package com.lithial.amazingtranslator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //This is a test
        int number = 0;
        int language = 0;

        Scanner scanner = new Scanner(System.in);
        InputCollector input = new InputCollector();
        input.Print("What is the number to translate?: ");
        String numbersAsAString=scanner.nextLine();

        try {
            number = input.GetNumber(numbersAsAString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        input.Print("What language do you want?: 1-French|2-German: ");
        String CountryAsAString=scanner.nextLine();

        try {
            language = input.GetLanguage(CountryAsAString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try{
            System.out.printf("The number %s is %s\n", LanguageDatabase.getTranslation(number, 0), LanguageDatabase.getTranslation(number,language));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
