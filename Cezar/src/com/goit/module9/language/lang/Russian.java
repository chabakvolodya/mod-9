package com.goit.module9.language.lang;

import com.goit.module9.language.Language;

/**
 * Created by Администратор on 1/30/2016.
 */
public class Russian extends Language {

    private String UpperCase = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private String LowerCase = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private int sizeAlphabet = 33;
    private String name = "Russian";

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
        return getName();
    }
}
