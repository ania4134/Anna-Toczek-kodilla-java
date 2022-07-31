package com.kodilla.hibernate.manytomany.facade;

public class SearchExceptions extends Exception {

    public static String ERR_CHARS_LENGTH_ERROR = "Characters length don't fit";
    public static String NO_DATA_FOUND_INFO = "No data found";

    public SearchExceptions(String message) {
        super(message);
    }
}
