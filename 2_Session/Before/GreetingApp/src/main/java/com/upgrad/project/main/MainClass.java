package  com.upgrad.project.main;

import com.upgrad.project.services.GreetingService;
import com.upgrad.project.services.GreetingServiceImpl1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainClass {
    public static void main(String[] args) {
        //TODO For Trainer


        //old way tight coupling
      /*  GreetingService service = new GreetingServiceImpl1();
        service.greetUser("Akshy" ,"Kumar");*/

        // spring way loose coupling

        //1st step create spring IocContainer
        ApplicationContext context = new ClassPathXmlApplicationContext("projectBeans.xml");

        // get the greeting service bean form Spring Container
        GreetingService service1 = context.getBean("greetingService",GreetingService.class);
        System.out.println(service1.greetUser("Satish" ,"Mahajan"));

        GreetingService service2 = context.getBean("greetingService",GreetingService.class);
        System.out.println(service2.greetUser("Akasy" ,"Kumar"));


    }
}
