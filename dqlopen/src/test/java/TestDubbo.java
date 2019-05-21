import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ITestService;

import java.io.IOException;

public class TestDubbo {
    public static void main(String[] args) {
                 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                                 new String[] { "spring-dubbo-consumer.xml" });
                 context.start();
                 ITestService testService = (ITestService) context.getBean("testService");
                 System.out.println(testService.getName());
                 System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
                 try {
                         System.in.read();
                     } catch (IOException e) {
                         e.printStackTrace();
                     }

             }

}
