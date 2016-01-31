package com.goit.module9.language.lang;

import com.goit.module9.language.Language;

/**
 * Created by Администратор on 1/30/2016.
 */
public class English extends Language {

    private String UpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String LowerCase = "abcdefghijklmnopqrstuvwxyz";
    private int sizeAlphabet = 26;
    private String name = "English";

    @Override
    public char[] getUpperCase() {
        return UpperCase.toCharArray();
    }

    @Override
    public char[] getLowerCase() {
        return LowerCase.toCharArray();
    }

    @Override
    public int getSizeAlphabet() {
        return sizeAlphabet;
    }

    @Override
    public String getName() {
        return name;
    }
}
