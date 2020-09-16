<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <meta lang="pt-br">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=yes">
    <title>Calculadora fatorial</title>

    <link rel="stylesheet" href="index.css">

</head>
<body>
<main>
    <div id="title">
        <h1>Calculadora fatorial</h1>
        <p id="text">n!</p>
    </div>
    <div id="form">
        <form action="calculate" method="post">
            <label for="input-value">Digite um número inteiro não negativo:</label>
            <br><br>
            <input type="number" id="input-value" name="input-value" min="0" max="10000" placeholder=" Digite seu número aqui" required>
            <input type="submit" id="button" value="Calcular">
        </form>
    </div>
    <div id="output">
        <p>${text}</p>
        <p id="result-text">${result}</p>
        <p id="history-text">Histórico de cálculos efetuados:<br><br>${historytext}</p>
    </div>
</main>
</body>
</html>