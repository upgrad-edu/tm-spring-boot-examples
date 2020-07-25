package com.upgrad.mtb.services;

import com.upgrad.mtb.beans.Movie;
import com.upgrad.mtb.beans.Theatre;
import com.upgrad.mtb.daos.BookingDAO;
import com.upgrad.mtb.beans.Booking;
import com.upgrad.mtb.dto.BookingDTO;
import com.upgrad.mtb.exceptions.*;
import com.upgrad.mtb.utils.DateDifference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service(value = "bookingService")
public class BookingServiceImpl implements BookingService  {
    @Autowired
    @Qualifier("bookingDAO")
    private BookingDAO bookingDAO  ;
    @Autowired
    CustomerService customerService;
    @Autowired
    TheatreService theatreService;


    public Booking acceptBookingDetails(BookingDTO bookingDTO) throws TheatreDetailsNotFoundException, CustomerDetailsNotFoundException, BookingFailedException, APIException, ParseException {
        System.out.println("New booking");
        Theatre theatre = theatreService.getTheatreDetails(bookingDTO.getTheatreId());
        List<Movie> moviesList = theatre.getMovies();
        if(moviesList.get(moviesList.size()-1).getStatus().getStatus().equalsIgnoreCase("Released")){
            Booking newBooking = new Booking();
            newBooking.setNoOfSeats(bookingDTO.getNoOfSeats());
            newBooking.setBookingDate(bookingDTO.getBookingDate());
            newBooking.setTheatre(theatreService.getTheatreDetails(bookingDTO.getTheatreId()));
            newBooking.setCustomer(customerService.getCustomerDetails(bookingDTO.getCustomerId()));
            theatreService.updateTheatreDetails(bookingDTO.getTheatreId(), theatre );
            return bookingDAO.save(newBooking);
        }
        else
            throw new BookingFailedException("Booking Failed");
    }
    public Booking getBookingDetails(int id) throws BookingDetailsNotFoundException {
        return bookingDAO.findById(id).orElseThrow(
                ()->  new BookingDetailsNotFoundException("Booking Details not found for id : " + id));
    }
    public boolean deleteBooking(int id) throws BookingDetailsNotFoundException {
        Booking booking = getBookingDetails(id);
        bookingDAO.delete(booking);
        return true;
    }
    public List<Booking> getAllBookingDetails() {
        return bookingDAO.findAll();
    }
}
