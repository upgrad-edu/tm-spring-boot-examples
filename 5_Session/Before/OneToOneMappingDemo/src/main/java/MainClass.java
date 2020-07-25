
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

        EngineDAO engineDAO = (EngineDAO)context.getBean("engineDAO");
        Engine engine = engineDAO.save(new Engine("Petrol"));

        CarDAO carDAO = (CarDAO)context.getBean("carDAO");
        Car bmw = carDAO.save(new Car("BMW"));

        engine.setCar(bmw);
        bmw.setEngine(engine);

        carDAO.save(bmw);
        engineDAO.save(engine);

        engine= engineDAO.findById(engine.getId()).get();
        System.out.println(engine.getId());
        System.out.println(engine.getCar());

        Car car = carDAO.findById(bmw.getId()).get();
        System.out.println(car.getName());
        System.out.println(car.getEngine());

        //Student TODO
        /*Modify Car entity apply @OneToOne and @JoinColumn annotation on the top of engine field

        Engine class to add @OneToOne , @JoinColumn annotation on the yop of car field

        Execute application*/

    }
}
