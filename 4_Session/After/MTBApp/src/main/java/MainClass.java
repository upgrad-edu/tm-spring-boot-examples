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

        //Movie CRUD Operation Using Spring

       /* MovieDAO movieDAO = (MovieDAO)context.getBean("movieDAO");
        System.out.println("==============================Movie CRUD=====================================");
        Movie movie1 = new Movie("Dhoom","Movie about bike racing", new Date("2/9/2015"), 180, "coverPhotoURL" , "trailerURL");
        Movie movie2 = new Movie("Madari","Movie child death revenge", new Date("12/3/2017"), 180, "coverPhotoURL" , "trailerURL");

        //insert
        System.out.println("===========Insert=============");
        movie1 = movieDAO.saveMovie(movie1);
        movie2 = movieDAO.saveMovie(movie2);

        System.out.println(movie1);
        System.out.println(movie2);

       //Update
        System.out.println("===========update=============");
        movie1.setDuration(45);
        movie2.setDuration(56);

        movie1 = movieDAO.updateMovie(movie1);
        movie2 = movieDAO.updateMovie(movie2);

        System.out.println(movie1);
        System.out.println(movie2);

        //select
        System.out.println("===========select=============");

        Optional<Movie> optionalMovie1 = movieDAO.getMovie(movie1.getId());
        System.out.println(optionalMovie1.get());

        try{
           Optional<Movie> optionalMovie2 = movieDAO.getMovie(6363);
           System.out.println(optionalMovie2.get());
        }catch (Exception e){
           System.out.println(e.getMessage());
        }

        List<Movie> movieList1 = movieDAO.getAllMovies();
        movieList1.forEach(movie -> System.out.println(movie));


        System.out.println("===========remove=============");

        movieDAO.deleteMovie(movie1);
        List<Movie> movieList2 = movieDAO.getAllMovies();
        movieList2.forEach(movie -> System.out.println(movie));*/

        //Theatre CRUD Operation Using Spring ORM

        System.out.println("==============================Theatre CRUD=====================================");
       /* TheatreDAO theatreDAO =(TheatreDAO)context.getBean("theatreDAO");
        Theatre theatre1 = new Theatre("Eclipse Theatres" , 150);
        Theatre theatre2 = new Theatre("City Pride" , 300);

        //insert
        System.out.println("===========Insert=============");
        theatre1 = theatreDAO.saveTheatre(theatre1);
        theatre2 = theatreDAO.saveTheatre(theatre2);

        System.out.println(theatre1);
        System.out.println(theatre2);

        //Update
        System.out.println("===========update=============");
        theatre1.setTicketPrice(490);
        theatre2.setTicketPrice(300);

        theatre1 = theatreDAO.updateTheatre(theatre1);
        theatre2 = theatreDAO.updateTheatre(theatre2);

        System.out.println(theatre1);
        System.out.println(theatre2);

        //select
        System.out.println("===========select=============");

        Optional<Theatre> theatreOptional1 = theatreDAO.getTheatre(theatre1.getId());
        System.out.println(theatreOptional1.get());

        try{
            Optional<Theatre> theatreOptional2 = theatreDAO.getTheatre(747);
            System.out.println(theatreOptional2.get());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        List<Theatre> theatreList1 = theatreDAO.getAllTheatre();
        theatreList1.forEach(theatre -> System.out.println(theatre));

        System.out.println("===========remove=============");

        theatreDAO.deleteTheatre(theatre1);
        List<Theatre> theatreList2 = theatreDAO.getAllTheatre();
        theatreList2.forEach(theatre -> System.out.println(theatre));
*/



        System.out.println("=====================================================================================");

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
