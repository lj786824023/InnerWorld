package servlet;

import dao.UserDao;
import dao.UserDaoImpl;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserDeleteServlet")
public class UserDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("dopost");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDaoImpl();
        User u = new User();
        u.setUsername(request.getParameter("username"));
        if (userDao.delete(u) > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
        response.sendRedirect("select_page.jsp");
    }
}
