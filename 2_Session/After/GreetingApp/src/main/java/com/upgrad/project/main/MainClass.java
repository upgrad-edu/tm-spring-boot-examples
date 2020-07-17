package  com.upgrad.project.main;

import com.upgrad.project.services.GreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainClass {
    public static void main(String[] args) {
        //TODO For Trainer

        ApplicationContext context = new ClassPathXmlApplicationContext("projectBeans.xml");
        GreetingService service = context.getBean("greetingService",GreetingService.class);
        System.out.println(service.greetUser("Satish" ,"Mahajan"));


    }
}
