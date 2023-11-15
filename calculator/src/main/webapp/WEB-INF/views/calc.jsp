<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>電卓</title>
</head>
<body>
<form action="./calc" method="post">

<table>
<tr>
<th colspan="3" align="center"><input type="text" name="total" id="result"></th>
</tr>
<tr>
<td><input type="button" value="7" onClick="calcclick(this)"></td>
<td><input type="button" value="8" onClick="calcclick(this)"></td>
<td><input type="button" value="9" onClick="calcclick(this)"></td>
<td><input type="button" value="÷" onClick="calcclick(this)"></td>
</tr>
<tr>
<td><input type="button" value="4" onClick="calcclick(this)"></td>
<td><input type="button" value="5" onClick="calcclick(this)"></td>
<td><input type="button" value="6" onClick="calcclick(this)"></td>
<td><input type="button" value="×" onClick="calcclick(this)"></td>
</tr>
<tr>
<td><input type="button" value="1" onClick="calcclick(this)"></td>
<td><input type="button" value="2" onClick="calcclick(this)"></td>
<td><input type="button" value="3" onClick="calcclick(this)"></td>
<td><input type="button" value="-" onClick="calcclick(this)"></td>
</tr>
<tr>
<td><input type="reset" value="c"</td>
<td><input type="button" value="０" onClick="calcclick(this)"></td>
<td><input type="submit" value="="></td>
<td><input type="button" value="+" onClick="calcclick(this)"></td>
</tr>
</table>

<label for="select">結果</label>
<% String result = (String)request.getAttribute("total"); %>
<input type="text" name="total" id="result" value="<%= result %>">

</form>

<script type="text/javascript">
	function calcclick(button) {
		document.getElementById("result").value += button.value;
	}
</script>

</body>
</html>