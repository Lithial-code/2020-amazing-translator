package com.lithial.amazingtranslator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LanguageDatabase {

    //todo check if these are correct with tests
    public static List<String> english = new ArrayList<>(Arrays.asList("one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen",
            "sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five",
            "twenty six","twenty seven","twenty eight","twenty nine","thirty"));
    public static List<String> german = Arrays.asList("eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn",
            "elf", "zwölf", "dreizehn", "vierzehn", "fünfzehn", "sechzehn", "siebzehn", "achtzhen", "neunzhen", "zwanzig",
            "einundzwanzig", "zweiundzwanzig", "dreiundzwanzig", "vierundzwanzig", "fünfundzwanzig", "sechsundzwanzig", "siebenundzwanzig", "schtundzwanzig", "neunundzwanzig", "dreiβig");
    public static List<String> french = Arrays.asList("un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf", "dix",
            "onze", "douze", "treize", "quatorze", "quinze", "seize", "dix-sept", "dix-huit", "dix-neuf", "vingt",
            "vingt et un", "vingt-deux", "vingt-trois", "vingt-quatre", "vingt-cinq", "vingt-six", "vingt-sept", "vingt-huit", "vingt-neuf", "vingt-dix");

    public static List<List<String>> languages = new ArrayList<>(Arrays.asList(english,french,german));

    public static String getTranslation(int number, int language) throws Exception {
        try{
            return languages.get(language).get(number-1);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return "";
        }
    }


}


