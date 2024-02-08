<h1>One Record successfully</h1>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<center>  
<h1 style="color:red">Display Bank Record</h1>

<table border="1">
<tr>
<th>ACCOUNTNO</th>
<th>NAME</th>
<th>PSW</th>
<th>CPSW</th>
<th>AMOUNT</th>
<th>ADDRESS</th>
<th>MOBILENO</th>

</tr>
<tr>
<td>${bank.accountNo}</td>
<td>${bank.name}</td>
<td>${bank.psw}</td>
<td>${bank.cpsw}</td>
<td>${bank.amount}</td>
<td>${bank.address}</td>
<td>${bank.mobileNo}</td>

</tr>
</table>
</center>