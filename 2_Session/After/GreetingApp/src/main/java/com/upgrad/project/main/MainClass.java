package  com.upgrad.project.main;

import com.upgrad.project.services.DataSourceImpl;
import com.upgrad.project.services.GreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        //TODO For Trainer

        ApplicationContext context = new ClassPathXmlApplicationContext("projectBeans.xml");
        GreetingService service = context.getBean("greeting",GreetingService.class);
        System.out.println(service.greetUser("Satish" ,"Mahajan"));
    }
}
