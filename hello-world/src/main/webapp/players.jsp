<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Player Details</title>
</head>
<body>
	
			<h3>Player Details</h3>
			<table border="1">
				<thead>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Role</th>
						<th>Team</th>
						<th>Country</th>
						<th>Amount</th>
					</tr>
				</thead>
				<tbody>
					
				<c:forEach items="${players}" var="player">
					<tr>
						<td>${player.id}</td>
						<td>${player.name}</td>
						<td>${player.role}</td>
						<td>${player.team}</td>
						<td>${player.country}</td>
						<td>${player.amount}</td>
						
						
						
				</c:forEach>
					
				</tbody>
			</table>
			
			
</body>
</html>