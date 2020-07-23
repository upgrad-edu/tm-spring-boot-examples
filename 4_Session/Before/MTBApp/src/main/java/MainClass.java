import com.upgrad.mtb.beans.*;
import com.upgrad.mtb.daos.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mtbBeans.xml");

        //Customer CRUD Operation Using Spring ORM + Spring Data

        /*CustomerDAO customerDAO   = (CustomerDAO) context.getBean("customerDAO");
        Customer customer1 = new Customer("Anil" ,"Kumar","aniluser","hello@1234",new Date("03/04/1987"));
        Customer customer2 = new Customer("Rajesh" ,"Kumar","rajeshuser","hi@1234",new Date("7/11/1990"));

        //insert
        System.out.println("===========Insert=============");
        customer1 = customerDAO.save(customer1);
        customer2 = customerDAO.save(customer2);

        System.out.println(customer1);
        System.out.println(customer2);

        //Update
        System.out.println("===========update=============");
        customer1.setFirstName("Rakesh");
        customer2.setPassword("newpassword");

        customer1 = customerDAO.save(customer1);
        customer2 = customerDAO.save(customer2);

        System.out.println(customer1);
        System.out.println(customer2);

        //select
        System.out.println("===========select=============");

        Optional<Customer> optionalCustomer1 = customerDAO.findById(customer1.getId());
        System.out.println(optionalCustomer1.get());

        try{
            Optional<Customer> optionalCustomer2 = customerDAO.findById(7632535);
            System.out.println(optionalCustomer2.get());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        List<Customer> customerList1 = customerDAO.findAll();
        customerList1.forEach(customer -> System.out.println(customer));


        System.out.println("===========select=============");
        customerDAO.delete(customer1);
        List<Customer> customerList2 = customerDAO.findAll();
        customerList2.forEach(customer -> System.out.println(customer));*/

        //City CRUD Operation Using Spring ORM + Spring Data

       /* CityDAO cityDAO = (CityDAO) context.getBean("cityDAO");

        City city1 = new City("Mumbai");
        City city2 = new City("Kolkata");


        //insert
        System.out.println("===========Insert=============");
        city1 = cityDAO.save(city1);
        city2 = cityDAO.save(city2);

        System.out.println(city1);
        System.out.println(city1);

        //Update
        System.out.println("===========update=============");
        city1.setCityName("Pune");
        city2.setCityName("Thane");

        city1 = cityDAO.save(city1);
        city2 = cityDAO.save(city2);

        System.out.println(city1);
        System.out.println(city1);

        //select
        System.out.println("===========select=============");

        Optional<City> cityOptional1 = cityDAO.findById(city1.getId());
        System.out.println(cityOptional1.get());

        try{
            Optional<City> cityOptional2 = cityDAO.findById(7632535);
            System.out.println(cityOptional2.get());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        List<City> cityList1 = cityDAO.findAll();
        cityList1.forEach(customer -> System.out.println(customer));


        System.out.println("===========select=============");
        cityDAO.delete(city1);

        List<City> cityList2 = cityDAO.findAll();
        cityList2.forEach(customer -> System.out.println(customer));*/

        //Language CRUD Operation Using Spring ORM + Spring Data

        LanguageDAO languageDAO = (LanguageDAO)context.getBean("languageDAO");

        Language language1 = new Language("Hindi");
        Language language2 = new Language("English");

        //insert
        System.out.println("===========Insert=============");
        language1 = languageDAO.save(language1);
        language2 = languageDAO.save(language2);

        System.out.println(language1);
        System.out.println(language2);

        //Update
        System.out.println("===========update=============");
        language1.setLanguage("Marathi");
        language2.setLanguage("Gujarati");

        language1 = languageDAO.save(language1);
        language2 = languageDAO.save(language2);

        System.out.println(language1);
        System.out.println(language2);

        //select
        System.out.println("===========select=============");

        Optional<Language> optionalLanguage1 = languageDAO.findById(language1.getId());
        System.out.println(optionalLanguage1.get());

        try{
            Optional<Language> optionalLanguage2  = languageDAO.findById(7632535);
            System.out.println(optionalLanguage2.get());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        List<Language> languageList1 = languageDAO.findAll();
        languageList1.forEach(language -> System.out.println(language));


        System.out.println("===========select=============");
        languageDAO.delete(language1);

        List<Language> languageList2 = languageDAO.findAll();
        languageList2.forEach(language -> System.out.println(language));

    }
}
