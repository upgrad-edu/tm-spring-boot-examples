import com.upgrad.mtb.beans.*;
import com.upgrad.mtb.daos.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mtbBeans.xml");

        //City Entity

        CityDAO cityDAO = (CityDAO) context.getBean("cityDAO");
        City mumbaiCity = cityDAO.save(new City("Mumbai"));
        City puneCity = cityDAO.save(new City("Pune"));
        List<City> insertedCityList = cityDAO.findAll();
        insertedCityList.forEach(city -> System.out.println(city));

        //Language Entity

        LanguageDAO languageDAO = (LanguageDAO)context.getBean("languageDAO");
        Language hindiLanguage = languageDAO.save(new Language("Hindi"));
        Language englishLanguage = languageDAO.save(new Language("English"));
        List<Language> insertedLanguageList = languageDAO.findAll();
        insertedLanguageList.forEach(language -> System.out.println(language));

        //UserType Entity

        UserTypeDAO userTypeDAO = (UserTypeDAO)context.getBean("userTypeDAO");
        UserType adminUserType = userTypeDAO.save(new UserType("Admin"));
        UserType customerUserType = userTypeDAO.save(new UserType("Customer"));
        List<UserType> insertedUserTypeList = userTypeDAO.findAll();
        insertedUserTypeList.forEach(userType -> System.out.println(userType));

        //Status Entity

        StatusDAO statusDAO = (StatusDAO)context.getBean("statusDAO");
        Status releasedStatus= statusDAO.save(new Status("Released") );
        Status notReleasedStatus= statusDAO.save(new Status("NotReleased") );
        List<Status>insertedStatusList = statusDAO.findAll();
        insertedStatusList.forEach(status  -> System.out.println(status));

        //Theatre
        TheatreDAO theatreDAO = (TheatreDAO) context.getBean("theatreDAO");
        Theatre imaxTheatre  = theatreDAO.save(new Theatre("IMAX",250));
        Theatre cityPride = theatreDAO.save(new Theatre("CityPride",250));

        //Movie

        MovieDAO movieDAO = (MovieDAO)context.getBean("movieDAO");
        Movie dhoomMovie =movieDAO.save(new Movie("Dhoom","Movie about bike racing", new Date("2/9/2015"), 180, "coverPhotoURL" , "trailerURL")); ;
        Movie madariMovie = movieDAO.save(new Movie("Madari","Movie child death revenge", new Date("12/3/2017"), 180, "coverPhotoURL" , "trailerURL"));;
        Movie uriMovie = movieDAO.save(new Movie("URI","Movie about URI attack", new Date("4/7/2018"), 150, "coverPhotoURL" , "trailerURL"));
        Movie sholeMovie = movieDAO.save(new Movie("Shole","Movie about gabbar singh daku", new Date("22/6/1986"), 210, "coverPhotoURL" , "trailerURL"));

        //Customer
        CustomerDAO customerDAO   = (CustomerDAO) context.getBean("customerDAO");
        Customer anilCustomer = customerDAO.save(new Customer("Anil" ,"Kumar","aniluser","hello@1234",new Date("03/04/1987")));
        Customer rajeshCustomer = customerDAO.save(new Customer("Rajesh" ,"Kumar","rajeshuser","hi@1234",new Date("7/11/1990")));



        System.out.println("==================================================================================================");

        // @OneToMany Mapping

        //  Movie+Language+Status
        //  Dhoom Madari movie TODO Trainer



        //uriMovie, sholeMovie movie TODO Student
        // 1)use hindiLanguage
        // 2)use notReleasedStatus



        //=================================================================================
        //Mapping @ManyToMany

        //Madari, dhoom move need add in IMAX and CityPride Trainers TODO


        //URI ,Shole Movie Need to add in IMAX and CityPride Students TODOs


        //Mappings @ElementCollection @CollectionTable
        //Customer mobileNumber Mapping TODO


        //Anil Phonenumber Trainer TODO




        //rajesh PhoneNumber  TODO Student


    }
}
