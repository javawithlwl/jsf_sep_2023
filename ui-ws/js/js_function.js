let greet = name => `Hello ${name}!, Welcome to JavaScript World.`;
let message = greet('Rajesh')
console.log(message);

function perform(a,b,fn){
    return fn(a,b);
}
let result = perform(10,20,(a,b)=>a+b);
console.log(result);