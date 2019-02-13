package controller.rights;

import dao.DaoRights;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RightsUpdate", urlPatterns = {"/rightsUpdate"})
public class RightsUpdate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name  = request.getParameter("name");
        long idRight = Long.parseLong(request.getParameter("id"));
        DaoRights.updateById(idRight, name);
        new RightsGetAll().doGet(request,response);
    }
}
