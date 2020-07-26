package com.upgrad.mtb.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BookingDTO {
    int bookingId;
    Date bookingDate;
    int noOfSeats;
    int customerId;
    int theatreId;
}
