<html>
<head>
<style>

h1{border-style:dashed;border-width:10px;border-color:aqua;boder-radius:20px;}
body{background-color:rgb(67,98,23,0.5)}
table{background-color:grey}
</style></head>
<center>
<h1 style="color:yellow">TRANSFER AMOUNT</h1>
<body>
<a href="/home">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/addbank">New Bank</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/viewbank">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="with">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/form2">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/amount">Close A/c</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/about">about</a>&nbsp;&nbsp;&nbsp;&nbsp;
<form action="/trans">
<table border="1">
<tr>
<th>Account No:</th>
<td><input type="number"name="accountNo"></td>
</tr>
<tr>
<th>Name:</th>
<td><input type="text"name="name"></td>
</tr>
<tr>
<th>Password:</th>
<td><input type="text"name="psw"></td>
</tr>
<tr>
<th>Target account Number:</th>
<td><input type="number"name="targetaccountno"></td>
</tr>
<tr>
 <th>Transfer Amount:</th>
 <td><input type="number"name="transferamount"></td>
 </tr>
 <tr>
 <th></th>
<td><input type="submit"value="printTransfer"></td>
</tr>
</form>
</center>
</table>
</body>
</html>