
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
        CarDAO carDAO = (CarDAO) context.getBean("carDAO");
        Engine insertedEngine = engineDAO.save(new Engine("petrol"));
        Car insertedCar = carDAO.save(new Car("BMW"));
        insertedCar.setEngine(insertedEngine);
        insertedEngine.setCar(insertedCar);
        carDAO.save(insertedCar);
        engineDAO.save(insertedEngine);
    }
}
