package com.historymap.historymap.date.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utils {
    
    public static boolean timeCheck(String input){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        if(input == null) return false;
        if(input.isEmpty()) return false;
        
        try{
            LocalDate.parse(input, dateTimeFormatter);
        }catch(Exception e){
            return false;
        }
        
        return true;
    }
}
