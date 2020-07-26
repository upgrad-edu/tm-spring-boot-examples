import com.upgrad.mtb.beans.*;
import com.upgrad.mtb.daos.*;
import com.upgrad.mtb.dto.BookingDTO;
import com.upgrad.mtb.exceptions.*;
import com.upgrad.mtb.services.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.text.ParseException;
import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mtbBeans.xml");

        System.out.println("\n\n======================   ******* Language Service ******** =======================\n");
        //Language Services Trainer TODO
        //Language Entity
        Language hindiLanguage = new Language("Hindi");
        Language englishLanguage = new Language("English");
        LanguageService languageService = (LanguageService)context.getBean("languageService");
        try{

            System.out.println("\n================== Insert ==================\n");

            englishLanguage=languageService.acceptLanguageDetails(englishLanguage);
            hindiLanguage=languageService.acceptLanguageDetails(hindiLanguage);

            System.out.println("\nInserted Language Details :-" +englishLanguage);
            System.out.println("Inserted Language Details :-" +hindiLanguage);

            System.out.println("\n================== Select  ==================\n");

            englishLanguage = languageService.getLanguageDetails(englishLanguage.getId());

            System.out.println("\nSearched Language Details :-" +englishLanguage);
            System.out.println("Searched Language Details :-" +languageService.getLanguageDetails(1333));

        } catch (LanguageDetailsNotFoundException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\n\n======================   ******* City Service ******** =======================\n");
        //City Services Trainer TODO
        //City Entity
        City mumbaiCity = new City("Mumbai");
        City puneCity = new City("Pune");

        CityService cityService = (CityService)context.getBean("cityService");
        try{
            System.out.println("\n================== Insert ==================\n");

            mumbaiCity=cityService.acceptCityDetails(mumbaiCity);
            puneCity=cityService.acceptCityDetails(puneCity);
            System.out.println("\nInserted City Details :-" +mumbaiCity);
            System.out.println("Inserted City Details :-" +puneCity);

            System.out.println("\n================== Select  ==================\n");

            mumbaiCity = cityService.getCityDetails(mumbaiCity.getId());

            System.out.println("\nSearched City Details :-" +mumbaiCity);
            System.out.println("Searched City Details :-" +cityService.getCityDetails(1333));

        } catch (CityDetailsNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("\n\n======================   ******* Status Service ******** =======================\n");
        //Status Services Student TODOs
        //Status Entity
        Status releasedStatus= new Status("Released") ;
        Status notReleasedStatus= new Status("NotReleased") ;
        StatusService statusService = (StatusService)context.getBean("statusService");
        try{
            ;
            System.out.println("\n================== Insert ==================\n");

            releasedStatus=statusService.acceptStatusDetails(releasedStatus);
            notReleasedStatus=statusService.acceptStatusDetails(releasedStatus);

            System.out.println("\nInserted Status Details :-" +releasedStatus);
            System.out.println("Inserted Status Details :-" +notReleasedStatus);

            System.out.println("\n================== Select  ==================\n");

            releasedStatus = statusService.getStatusDetails(releasedStatus.getId());

            System.out.println("\nSearched Language Details :-" +releasedStatus);
            System.out.println("Searched Language Details :-" +statusService.getStatusDetails(1333));

        } catch (StatusDetailsNotFoundException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\n\n======================   ******* UserType Service ******** =======================\n");
        //Status Services Student TODOs
        //UserType Entity
        UserType adminUserType = new UserType("Admin");
        UserType customerUserType = new UserType("Customer");
        UserTypeService userTypeService = (UserTypeService)context.getBean("userTypeService");
        try{

            System.out.println("\n================== Insert ==================\n");

            adminUserType=userTypeService.acceptUserTypeDetails(adminUserType);
            customerUserType=userTypeService.acceptUserTypeDetails(customerUserType);

            System.out.println("\nInserted UserType Details :-" +adminUserType);
            System.out.println("Inserted UserType Details :-" +customerUserType);

            System.out.println("\n================== Select  ==================\n");

            adminUserType = userTypeService.getUserTypeDetails(adminUserType.getId());

            System.out.println("\nSearched UserType Details :-" +adminUserType);
            System.out.println("Searched Language Details :-" +userTypeService.getUserTypeDetails(1333));

        } catch (UserTypeDetailsNotFoundException e){
            System.out.println(e.getMessage());
        }


        // TODO -- this section of the code will be covered in the class

        System.out.println("\n\n======================   ******* Movie Service ******** =======================\n");


        Movie dhoomMovie =new Movie("Dhoom","Movie about bike racing", new Date("2/9/2015"), 180, "coverPhotoURL" , "trailerURL") ;
        Movie madariMovie = new Movie("Madari","Movie child death revenge", new Date("12/3/2017"), 180, "coverPhotoURL" , "trailerURL");
        Movie uriMovie = new Movie("URI","Movie about URI attack", new Date("4/7/2018"), 150, "coverPhotoURL" , "trailerURL");
        Movie sholeMovie = new Movie("Shole","Movie about gabbar singh daku", new Date("22/6/1986"), 210, "coverPhotoURL" , "trailerURL");


        System.out.println("\n\n======================   ******* Theatre Service ******** =======================\n");
        //Theatre Services
        //Theatre
        Theatre imaxTheatre  = new Theatre("IMAX",250);
        Theatre cityPrideTheatre = new Theatre("CityPride",250);





        System.out.println("\n\n======================   ******* Customer Service ******** =======================\n");
        //Customer Services
        //Customer
        Customer anilCustomer = new Customer("Anil" ,"Kumar","aniluser","hello@1234",new Date("03/04/1987"));
        Customer rajeshCustomer = new Customer("Rajesh" ,"Kumar","rajeshuser","hi@1234",new Date("7/11/1990"));
        try{
            CustomerService customerService = (CustomerService) context.getBean("customerService");
            System.out.println("\n================== Insert ==================\n");

            anilCustomer=customerService.acceptCustomerDetails(anilCustomer);
            rajeshCustomer=customerService.acceptCustomerDetails(rajeshCustomer);

            System.out.println("\nInserted Customer Details :-" +anilCustomer);
            System.out.println("Inserted Customer Details :-" +rajeshCustomer);

            System.out.println("\n================== Update  ==================\n");
            anilCustomer.setUserType(customerUserType);
            rajeshCustomer.setUserType(customerUserType);

            customerService.updateCustomerDetails(anilCustomer.getId(),anilCustomer);
            customerService.updateCustomerDetails(rajeshCustomer.getId(),rajeshCustomer);


            System.out.println("\n================== Select  ==================\n");

            anilCustomer = customerService.getCustomerDetails(anilCustomer.getId());
            System.out.println("\nSearched Customer Details :-" +imaxTheatre);
            System.out.println("Searched Customer Details :-" +customerService.getCustomerDetails(1333));
            anilCustomer = customerService.getCustomerDetailsByUsername(anilCustomer.getUsername());

        } catch (CustomerUserNameExistsException e ){
            System.out.println(e.getMessage());
        }catch (UserTypeDetailsNotFoundException e){
            System.out.println(e.getMessage());
        }catch (CustomerDetailsNotFoundException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\n\n======================   ******* Booking Service ******** =======================\n");
        //Booking Services
        //Booking

        try{
            BookingDTO bookingDTO1 = new BookingDTO();
            bookingDTO1.setBookingDate(new Date("24/07/2020"));
            bookingDTO1.setCustomerId(anilCustomer.getId());
            bookingDTO1.setTheatreId(imaxTheatre.getId());
            BookingService bookingService = (BookingService)context.getBean("bookingService");
            Booking booking =bookingService.acceptBookingDetails(bookingDTO1);
        }catch (CustomerDetailsNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (TheatreDetailsNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (BookingFailedException e){
            System.out.println(e.getMessage());
        }
        catch (APIException e) {
            System.out.println(e.getMessage());
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }
}
