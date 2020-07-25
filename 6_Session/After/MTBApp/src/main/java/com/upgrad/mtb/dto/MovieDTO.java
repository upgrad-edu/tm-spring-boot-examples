package com.upgrad.mtb.dto;

import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class MovieDTO {
    int movieId;
    String coverURL;
    String description;
    int duration;
    String name;
    Date releaseDate;
    String trailerURL;
    int languageId;
    int statusId;
    List<Integer> theatreIds;
}
