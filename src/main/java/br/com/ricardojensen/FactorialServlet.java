package br.com.ricardojensen;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@WebServlet("/calculate")
public class FactorialServlet extends HttpServlet {
    String history = "";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int n = Integer.parseInt(request.getParameter("input-value"));
        String text ="Resultado de " + n + "!";
        history =  String.valueOf(n) + "!  " + history;
        BigInteger result = calculate(BigInteger.valueOf(n));
        request.setAttribute("historytext",history);
        request.setAttribute("text", text);
        request.setAttribute("result", result.toString());
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    private BigInteger calculate(BigInteger n) {

        if (n.intValue() < 2) {
            return BigInteger.ONE;
        } else {
            return n.multiply(calculate(n.subtract(BigInteger.ONE)));
        }

    }
}

