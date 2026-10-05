<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="pt-br">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Calculadora do Jantar</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                margin: 20px;
                background-color: #f5f0e8;
            }

            form {
                margin-bottom: 20px;
            }

            label {
                display: block;
                margin-bottom: 5px;
            }

            input[type="number"] {
                padding: 5px;
                width: 200px;
                margin-bottom: 10px;
            }

            button {
                padding: 10px 20px;
                background-color: #4CAF50;
                color: white;
                border: none;
                cursor: pointer;
            }

            button:hover {
                background-color: #45a049;
            }

            p {
                margin-top: 10px;
            }

            .moeda {
                color: green;
                font-weight: bold;
            }
            .cartao {
                background-color: white;
                padding: 30px;
                border-radius: 12px;
                max-width: 400px;
                margin: 40px auto;
                box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            }
            .conta {
                border-top: 1px dashed #999;
                padding-top: 20px;
            }
            .total {
                border-top: 2px solid #4CAF50;
                padding-top: 10px;
                font-size: 1.3em;
                font-weight: bold;
            }
        </style>
    </head>

    <body>
        <div class="cartao">
            <%String valorJantar=request.getParameter("valorJantar");%>
        <form>
            <label for="valorJantar">Calculadora do Jantar:</label>
            <input type="number" id="valorJantar" name="valorJantar" step="0.01" value="<%= valorJantar != null ? valorJantar : "" %>" required>
            <button type="submit">Calcular</button>
        </form>
                <% if (valorJantar !=null) { %>
                    <%
                    double valorComida = Double.parseDouble(valorJantar);
                    double taxaGarcom = valorComida*0.10;
                    double valorTotal = valorComida + taxaGarcom;
                    %>
                <div class="conta">
                <p>O valor da sua conta é de <span class="moeda">R$</span> <%=String.format("%.2f", valorComida)%></p>
                <p>O valor da taxa de serviço (10%) é de <span class="moeda">R$</span> <%=String.format("%.2f", taxaGarcom)%></p>
                <p class="total">O valor total da<br>sua compra é de <span class="moeda">R$</span> <%=String.format("%.2f", valorTotal)%></p>
                    </div>
                <% } %>
        </div>
        
    </body>

    </html>