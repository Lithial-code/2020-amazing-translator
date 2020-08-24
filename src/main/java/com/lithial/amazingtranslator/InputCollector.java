package com.lithial.amazingtranslator;

import java.util.Scanner;

public class InputCollector {

    public InputCollector() {

    }

    public void Print(String message) {
        System.out.print(message);
    }

    //todo make better exception
    public int GetNumber(String numbersAsAString) throws Exception {
        try {
            int number = Integer.parseInt(numbersAsAString);
            return (number);
        } catch (NumberFormatException e) {
            //todo i dont like this solution either
            System.out.println("The number had to be numeric!");
            System.exit(0);
        }
        return -1;
    }
    //todo write an exception for this as well
    public int GetLanguage(String countryAsString) throws Exception{
        try{
            int language=Integer.parseInt(countryAsString);
            return language;
        }catch(NumberFormatException e){
            System.out.println("The number had to be numeric!");
            System.exit(0);
        }
        return -1;
    }

}


