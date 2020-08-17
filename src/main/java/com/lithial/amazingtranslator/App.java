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
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the number to translate?: ");
        int number = 0;
        int language = 0;
        String numbersAsAString=scanner.nextLine();
        try{
            number=Integer.parseInt(numbersAsAString);
            System.out.println(number);
        }catch(NumberFormatException e){
            System.out.println("The number had to be numeric!");
            System.exit(0);
        }
        System.out.println("What language do you want?: 1-French|2-German");
        String CountryAsAString=scanner.nextLine();
        try{
            language=Integer.parseInt(CountryAsAString);
            System.out.println(language);
        }catch(NumberFormatException e){
            System.out.println("The number had to be numeric!");
            System.exit(0);
        }
        //TODO check that the option is 1 or 2
        List<String> english = new ArrayList<>(Arrays.asList("one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen",
        "sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five",
                "twenty six","twenty seven","twenty eight","twenty nine","thirty"));
        List<String> german = Arrays.asList("eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn",
                "elf", "zwölf", "dreizehn", "vierzehn", "fünfzehn", "sechzehn", "siebzehn", "achtzhen", "neunzhen", "zwanzig",
                "einundzwanzig", "zweiundzwanzig", "dreiundzwanzig", "vierundzwanzig", "fünfundzwanzig", "sechsundzwanzig", "siebenundzwanzig", "schtundzwanzig", "neunundzwanzig", "dreiβig");
        List<String> french = Arrays.asList("un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf", "dix",
                "onze", "douze", "treize", "quatorze", "quinze", "seize", "dix-sept", "dix-huit", "dix-neuf", "vingt",
                "vingt et un", "vingt-deux", "vingt-trois", "vingt-quatre", "vingt-cinq", "vingt-six", "vingt-sept", "vingt-huit", "vingt-neuf", "vingt-dix");

        switch (language){

            case 1:
                System.out.printf("The number %s is %s\n", english.get(number-1), french.get(number-1));
                break;
            case 2:
                System.out.printf("The number %s is %s\n", english.get(number-1), german.get(number-1));
                break;
            default:

                break;
        }

    }
}
