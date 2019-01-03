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

@WebServlet(name = "UserUpdateServlet")
public class UserUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDaoImpl();
        User user = new User();
        Map<String, String[]> parameterMap = request.getParameterMap();
        try {
            BeanUtils.populate(user, parameterMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (userDao.update(user) == 1) {
            System.out.println("用户更新失败");
            //JOptionPane.showMessageDialog(null,"用户更新成功");
        } else {
            //JOptionPane.showMessageDialog(null,"用户更新失败");
            System.out.println("用户更新失败");
        }

        response.sendRedirect("select_page.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
