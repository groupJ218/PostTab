package controller;

import dao.DaoAddress;
import dao.DaoPointOfSale;
import dao.DaoProduct;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainController extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String pass = request.getParameter("pass");
        String email = request.getParameter("email");
        String msg = "Pass " + pass + " Email  " + email;
        System.out.println(DaoPointOfSale.getPointByPointId("Comfy"));
        System.out.println(DaoProduct.getProdByPointId(1));
        System.out.println(DaoAddress.getAddressById(1));

        request.setAttribute("point", DaoProduct.getProdByPointId(1));

        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    int count = 0;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        System.out.println("Servlet" + count++);
        response.encodeRedirectURL("index.jsp");
    }

}
