import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mtbBeans.xml");

       /*
        MTB Schema: schema link  :-https://docs.google.com/spreadsheets/d/1dRg6O43F7d--dEig8CLEH1JByKbpH83RdPUvMIkdrUo/edit#gid=595411971
        Use Movie Booking App
        Create below entity classes in “com.upgrad.mtb.beans package”
        Booking
        City
        Customer
        Movie
        Status
        Theatre
        UserType
        Add @Entity, @Id , @GeneratedValue annotation on above listed entity classes
        executed code
        */
    }
}
