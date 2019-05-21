package service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("testImpl")
public class TestImpl implements RmiTest {
    public String testApi() {

        return "hello word";
    }

    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-rmi.xml");
    }

}
