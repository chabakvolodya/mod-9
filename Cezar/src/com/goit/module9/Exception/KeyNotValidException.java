package com.goit.module9.Exception;

import com.goit.module9.language.Language;

/**
 * Created by Администратор on 1/31/2016.
 */
public class KeyNotValidException extends CezarException {

    private int key;
    private String language;

    public KeyNotValidException(String language, int key) {
        this.language = language;
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public String getNameLanguage() {
        return language;
    }
}
