package servlet;

import dao.UserDao;
import dao.UserDaoImpl;
import entity.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "UserInsertServlet")
public class UserInsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDaoImpl();
        User u = new User();
        Map<String, String[]> parameterMap = request.getParameterMap();
        try {
            BeanUtils.populate(u, parameterMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int update = userDao.insert(u);
        if (update > 0) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
        response.sendRedirect("insert_page.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
