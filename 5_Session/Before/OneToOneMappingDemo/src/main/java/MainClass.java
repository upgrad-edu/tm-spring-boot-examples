
import com.upgrad.mtb.beans.Car;
import com.upgrad.mtb.beans.Engine;
import com.upgrad.mtb.daos.CarDAO;
import com.upgrad.mtb.daos.EngineDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.CacheRequest;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context=new  ClassPathXmlApplicationContext("projectBeans.xml");
        //Student TODO
        /*Modify Car entity apply @OneToOne and @JoinColumn annotation on the top of engine field

        Engine class to add @OneToOne , @JoinColumn annotation on the yop of car field

        Execute application*/

    }
}
