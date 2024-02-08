<html>
<head>
<style>

h1{border-style:ridge;border-width:10px;border-color:brown;boder-radius:20px;}
body{background-color:rgb(78,43,78,0.08)}
table{background-color:pink}
</style></head>

<body>
<center>


<form action="/login">
<h1 style="color:red">BALANCE FORM</h1><p></p>

<a href="/home">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/addbank">New Bank</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/viewbank">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="with">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/form2">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/amount">Close A/c</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/about">about</a>&nbsp;&nbsp;&nbsp;&nbsp;
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
<th></th>
<td><input type="submit"value="Submit"></td>
</tr>
<tr>
<th></th>
</tr>
<tr>
<td></td>

<td><input type="submit"value="Clear"></td>
</tr>
</form>

</body>
</center>
</table>
</html>