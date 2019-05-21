package web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.RmiTest;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestHttpclient extends HttpServlet {



    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //ApplicationContext aa = new ClassPathXmlApplicationContext("spring-rmi-client.xml");
        String abc = DES.decryptDES(req.getParameter("param"), "22345679");
        System.out.println(abc);
        //RmiTest rmiTest = (RmiTest) aa.getBean("appInfoService");

        //String s = rmiTest.testApi();
        //resp.getWriter().write(abc);
    }
}
