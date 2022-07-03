package com.narendra.docker.test;
//Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class Test3 {

    public static void main(String[] args) {
        List<Order> list = Arrays.asList(
                new Order(101, getDate("11/02/2021")),
                new Order(102, getDate("01/01/2021")),
                new Order(102, getDate("11/03/2021")),
                new Order(102, getDate("1/04/2021")),
                new Order(102, getDate("11/05/2021"))

        );


    }

    private static Date getDate(String s) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        try {
            simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


}
