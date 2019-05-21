package dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class TestDubbo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-dubbo-provider.xml"});
        context.start();
        System.out.println("Provider register Success");
        try {
            System.in.read();//让此程序一直跑，表示一直提供服务
        }
        catch(
                IOException e) {
            e.printStackTrace();
        }
    }
}

