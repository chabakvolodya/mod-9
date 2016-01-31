package com.goit.module9.language;

import com.goit.module9.language.lang.English;
import com.goit.module9.language.lang.Russian;
import com.goit.module9.language.lang.Ukrainian;

/**
 * Created by Администратор on 1/30/2016.
 */
public class LanguageUtils {

//    public static char getNewAlphabetSymbol(Language language, char symbol, int key) {
//
//        char result = 0;
//        int tempIndexChar = 0;
//        char[] symbols = null;  //Масив літер
//
//        if (isUpperCase(language, symbol)){ //Якщо символ велика літера
//
//            symbols = language.getUpperCase();  //Масив великих літер
//
//        }else if (isLowerCase(language, symbol)){   //Якщо символ мала літера
//
//            symbols = language.getLowerCase();  //Масив маленьких літер
//
//        }
//
//        if (symbols != null){
//            for (int i = 0; i < symbols.length; i++){
//
//                if (symbol == symbols[i]){
//                    tempIndexChar = i;
//                    break;
//                }
//            }
//
//            tempIndexChar += key;
//
//            if (tempIndexChar >= symbols.length) tempIndexChar -= language.getSizeAlphabet();
//
//            result = symbols[tempIndexChar];
//
//        } else {
//            result = symbol;
//        }
//
//        return result;
//    }

    public static char getNewAlphabetSymbol(Language language, char symbol, int key, boolean reverse) {

        char result = 0;
        int tempIndexChar = 0;
        char[] symbols = null;  //Масив літер

        if (isUpperCase(language, symbol)){ //Якщо символ велика літера

            symbols = language.getUpperCase();  //Масив великих літер

        }else if (isLowerCase(language, symbol)){   //Якщо символ мала літера

            symbols = language.getLowerCase();  //Масив маленьких літер

        }

        if (symbols != null){
            for (int i = 0; i < symbols.length; i++){

                if (symbol == symbols[i]){
                    tempIndexChar = i;
                    break;
                }
            }

            if (reverse){
                tempIndexChar -= key;

                if (tempIndexChar < 0) tempIndexChar += language.getSizeAlphabet();
            }else {
                tempIndexChar += key;

                if (tempIndexChar >= symbols.length) tempIndexChar -= language.getSizeAlphabet();
            }
            result = symbols[tempIndexChar];

        } else {
            result = symbol;
        }

        return result;
    }

    public static Language getLanguage(LanguageEnum lang){
        Language language = null;

        switch (lang){
            case ENGLISH: language = new English();
                break;
            case RUSSHIAN: language = new Russian();
                break;
            case UKRAINIAN: language = new Ukrainian();
                break;
        }

        return language;
    }

    private static boolean isUpperCase(Language language, char symbol){
        boolean result = false;
        for (char c : language.getUpperCase()){
            if (symbol == c){
                result = true;
                break;
            }
        }
        return result;
    }

    private static boolean isLowerCase(Language language, char symbol){
        boolean result = false;
        for (char c : language.getLowerCase()){
            if (symbol == c){
                result = true;
                break;
            }
        }
        return result;
    }
}
