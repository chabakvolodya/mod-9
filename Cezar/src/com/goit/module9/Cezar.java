package com.goit.module9;

import com.goit.module9.Exception.CezarException;
import com.goit.module9.Exception.EmptyInputStringException;
import com.goit.module9.Exception.KeyNotValidException;
import com.goit.module9.language.Language;
import com.goit.module9.language.LanguageEnum;
import com.goit.module9.language.LanguageUtils;

/**
 * Created by Администратор on 1/30/2016.
 */
public class Cezar {

    private static StringBuilder result;
    private static Language language;

    public static String encryption(String string, LanguageEnum lang, int key) throws CezarException {

        language = LanguageUtils.getLanguage(lang);
        result = new StringBuilder();

        validation(string,language, key);

        for (char symbol : string.toCharArray()) {

            symbol = LanguageUtils.getNewAlphabetSymbol(language, symbol, key, false);

            result.append(symbol);
        }
        return result.toString();
    }

    public static String decryption(String string, LanguageEnum lang, int key) throws CezarException {

        language = LanguageUtils.getLanguage(lang);
        result = new StringBuilder();

        validation(string, language, key);

        for (char symbol : string.toCharArray()) {

            symbol = LanguageUtils.getNewAlphabetSymbol(language, symbol, key, true);

            result.append(symbol);
        }
        return result.toString();
    }

    private static void validation(String string, Language language, int key) throws CezarException {

        if (key < 0 || key > language.getSizeAlphabet())throw new KeyNotValidException(language.getName(), key);
        if (string.length() == 0) throw new EmptyInputStringException();
    }

}
