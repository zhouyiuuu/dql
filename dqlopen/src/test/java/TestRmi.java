import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.RmiTest;
import web.DES;

import javax.annotation.Resource;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:application-context.xml","classpath:application-db.xml"})
public class TestRmi {

    @Resource
    RmiTest rmiTest;

    @Test
    public void test(){
        ApplicationContext aa = new ClassPathXmlApplicationContext("spring-rmi-client.xml");

        RmiTest rmiTest = (RmiTest) aa.getBean("appInfoService");

        System.out.println(rmiTest.testApi());

    }

    @Test
    public void testDes(){

        String abc = DES.decryptDES("/Kx7OuE/ah9Jhz/mfrDEew==", "22345679");
        System.out.println(abc);
    }
    @Test

    public void test1(){

       System.out.println( rmiTest.testApi());
    }
}
