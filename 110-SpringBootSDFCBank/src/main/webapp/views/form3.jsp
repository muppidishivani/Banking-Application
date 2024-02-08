<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<h1 style="color:red">Display Bank Details</h1>
<table border="1">
<tr>
<th>ACCOUNTNO</th>
<th>AMOUNT</th>
<th>WithdrawAmount</th>
<th>ADDRESS</th>

</tr>
<tr>
<td>${bank.accountNo}</td>
<td>${bank.amount}</td>
<td>${bank.withdrawAmount}</td>
<td>${bank.address}</td>
</tr>
</table>