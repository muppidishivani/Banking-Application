<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<h1 style="color:red">Display Bank Details</h1>

<table border="1">

<tr>
<th>ACCOUNTNO</th>
<th>NAME</th>
<th>PASSWORD</th>
<th>AMOUNT</th>
<th>Withdraw</th>

</tr>
<tr>
<td>${bank.accountNo}</td>
<td>${bank.name}</td>
<td>${bank.psw}</td>
<td>${bank.amount}</td>
<td>${bank.withdrawAmount}</td>
</tr>

</table>