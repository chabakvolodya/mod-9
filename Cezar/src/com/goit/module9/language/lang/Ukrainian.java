package com.goit.module9.language.lang;

import com.goit.module9.language.Language;

/**
 * Created by Администратор on 1/30/2016.
 */
public class Ukrainian extends Language {

    private String UpperCase = "АБВГҐДЕЄЖЗИІЇЙКЛМНОПРСТУФХЦЧШЩЪЮЯ";
    private String LowerCase = "абвгґдеєжзиіїйклмнопрстуфхцчшщъюя";
    private int sizeAlphabet = 33;
    private String name = "Ukrainian";

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
