<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="pt-br" lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Hello World Web</title>
<base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
</head>


<body>
	<h1>Calculadora Científica de Padeiro</h1>

	<img src="fabiano.jpg"
		style="width: 350px; height: 230px;" />
	<div>
		<h2>Created by gu574v0</h2>
		<form action="action/jsp" method="post">

			<div style="width: 50%; margin-top: 2%">
				<label>Primeiro Número</label> <input type="text" name="var1" /> <br />
				<label>Segundo Número</label> <input type="text" name="var2" /> <br />
				<br />
				<div>
					<input type="submit" name="operacao" value="+"
						style="background-color: green;" /> <input type="submit"
						name="operacao" value="-" style="background-color: green;" /> <input
						type="submit" name="operacao" value="/"
						style="background-color: green;" /> <input type="submit"
						name="operacao" value="*" style="background-color: green;" /> <input
						type="submit" name="operacao" value="Potenciação"
						style="background-color: green;" />

				</div>
				<div>
				<br/>
				<br/>
					<a href="saida.txt" download>Download
					do
					Log!</a>
				</div>
			</div>
		</form>

		<h2>
			O resultado é:
			<c:out value="${result}" />
		</h2>
	</div>
</body>

</html>