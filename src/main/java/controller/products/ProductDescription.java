package controller.products;

import dao.DaoProduct;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductDescription", urlPatterns = {"/products/product"})
public class ProductDescription extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long id = Long.parseLong(request.getParameter("id"));
        request.setAttribute("product", DaoProduct.getProdById(id));
        request.getRequestDispatcher("/product.jsp").forward(request, response);
    }
}
