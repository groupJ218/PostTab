//package controller.rights;
//
//
//import dao.DaoRights;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//
//public class RightsDelete extends HttpServlet {
//
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        DaoRights.deleteById(Long.parseLong(req.getParameter("id")));
//        new RightsGetAll().doGet(req, resp);
//    }
//}
