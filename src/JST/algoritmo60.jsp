<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Locale" %>
<!DOCTYPE html>
    <html lang="pt-br">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Calculadora do Jantar</title>
        <link rel="stylesheet" href="estilo.css">
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
                    Locale brasil = Locale.of("pt", "BR");
                    %>
                <div class="conta">
                <p>O valor da sua conta é de <span class="moeda">R$</span> <%=String.format(brasil, "%.2f", valorComida)%></p>
                <p>O valor da taxa de serviço (10%) é de <span class="moeda">R$</span> <%=String.format(brasil, "%.2f", taxaGarcom)%></p>
                <p class="total">O valor total da<br>sua compra é de <span class="moeda">R$</span> <%=String.format(brasil, "%.2f", valorTotal)%></p>
                    </div>
                <% } %>
        </div>
        
    </body>

    </html>