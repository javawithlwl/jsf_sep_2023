google.charts.load('current', {'packages':['corechart']});
function drawChart(arr) {
    console.log('Google Chart API Loaded');
    let dataArr = [['Principal Amount', 'Interest Amount']]
    for(let i = 0; i < arr.length; i++){
        dataArr.push(arr[i]);
    }
    console.log(dataArr);
    let data = google.visualization.arrayToDataTable(dataArr);
    let options = {
        title: 'Emi Calculator'
    };
    google.charts.load('current', {'packages':['corechart']});
    let chart = new google.visualization.PieChart(document.getElementById('idPiechart'));
    chart.draw(data, options);
}

function calculateEmi(){
    var p = document.getElementById("idAmount").value;
    var r = document.getElementById("idRateOfInterest").value;
    var t = document.getElementById("idDuration").value;
    ri = r / 12 / 100;
    emi = Math.round(p * ri * Math.pow(1 + ri, t) / (Math.pow(1 + ri, t) - 1));
    totalAmount = emi * t;
    totalInterest = totalAmount - p;
    let str = `
        <table class="table table-bordered table-striped">
            <tbody>
                <tr>
                    <td>EMI Amount</td>
                    <td>${emi}</td>
                </tr>
                <tr>
                    <td>Total Amount</td>
                    <td>${totalAmount}</td>
                </tr>
                <tr>
                    <td>Total Interest</td>
                    <td>${totalInterest}</td>
                </tr>
            </tbody>
        </table>
    `;
    document.getElementById("idEmiDetails").innerHTML = str;
    google.charts.setOnLoadCallback(drawChart([[`Principal Amount`, Number.parseFloat(p)], [`Interest Amount`, totalInterest]]));
}

document.getElementById("idAmount").addEventListener("keyup", calculateEmi);
document.getElementById("idRateOfInterest").addEventListener("keyup", calculateEmi);
document.getElementById("idDuration").addEventListener("keyup", calculateEmi);

window.onload = function(){
    calculateEmi();
}
