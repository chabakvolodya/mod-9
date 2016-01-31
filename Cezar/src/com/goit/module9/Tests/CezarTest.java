package com.goit.module9.Tests;

import com.goit.module9.Cezar;
import com.goit.module9.Exception.EmptyInputStringException;
import com.goit.module9.Exception.KeyNotValidException;
import com.goit.module9.language.LanguageEnum;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by Администратор on 1/31/2016.
 */
public class CezarTest {

    String English = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    String Ukrainian = "АБВГҐДЕЄЖЗИІЇЙКЛМНОПРСТУФХЦЧШЩЪЮЯабвгґдеєжзиіїйклмнопрстуфхцчшщъюя";
    String Russian = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    String testEnglish = "HIJKLMNOPQRSTUVWXYZABCDEFGhijklmnopqrstuvwxyzabcdefg";
    String testUkrainian = "КЛМНОПРСТУФХЦЧШЩЪЮЯАБВГҐДЕЄЖЗИІЇЙклмнопрстуфхцчшщъюяабвгґдеєжзиіїй";
    String testRussian = "ЪЫЬЭЮЯАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩъыьэюяабвгдеёжзийклмнопрстуфхцчшщ";

    @Test
    public void testEncryption() throws Exception {
        Assert.assertEquals(testEnglish, Cezar.encryption(English, LanguageEnum.ENGLISH, 7));
        Assert.assertEquals(testUkrainian, Cezar.encryption(Ukrainian, LanguageEnum.UKRAINIAN, 14));
        Assert.assertEquals(testRussian, Cezar.encryption(Russian, LanguageEnum.RUSSHIAN, 27));
    }

    @Test
    public void testDecryption() throws Exception {
        Assert.assertEquals(English, Cezar.decryption(testEnglish, LanguageEnum.ENGLISH, 7));
        Assert.assertEquals(Ukrainian, Cezar.decryption(testUkrainian, LanguageEnum.UKRAINIAN, 14));
        Assert.assertEquals(Russian, Cezar.decryption(testRussian, LanguageEnum.RUSSHIAN, 27));
    }

    @Test(expected = EmptyInputStringException.class)
    public void testEncryptionEmptyInputStringException() throws Exception {
        Assert.assertEquals(testEnglish, Cezar.encryption("", LanguageEnum.ENGLISH, 7));
        Assert.assertEquals(testUkrainian, Cezar.encryption(Ukrainian, LanguageEnum.UKRAINIAN, 14));
        Assert.assertEquals(testRussian, Cezar.encryption("", LanguageEnum.RUSSHIAN, 27));

    }

    @Test(expected = EmptyInputStringException.class)
    public void testDecryptionEmptyInputStringException() throws Exception {
        Assert.assertEquals(English, Cezar.decryption(testEnglish, LanguageEnum.ENGLISH, 7));
        Assert.assertEquals(Ukrainian, Cezar.decryption("", LanguageEnum.UKRAINIAN, 14));
        Assert.assertEquals(Russian, Cezar.decryption(testRussian, LanguageEnum.RUSSHIAN, 27));
    }

    @Test(expected = KeyNotValidException.class)
    public void testEncryptionKeyNotValidException() throws Exception {
        Assert.assertEquals(testEnglish, Cezar.encryption(testEnglish, LanguageEnum.ENGLISH, 100));
        Assert.assertEquals(testUkrainian, Cezar.encryption(Ukrainian, LanguageEnum.UKRAINIAN, 100));
        Assert.assertEquals(testRussian, Cezar.encryption(testRussian, LanguageEnum.RUSSHIAN, 27));

    }

    @Test(expected = KeyNotValidException.class)
    public void testDecryptionKeyNotValidException() throws Exception {
        Assert.assertEquals(English, Cezar.decryption(testEnglish, LanguageEnum.ENGLISH, -7));
        Assert.assertEquals(Ukrainian, Cezar.decryption(testUkrainian, LanguageEnum.UKRAINIAN, 14));
        Assert.assertEquals(Russian, Cezar.decryption(testRussian, LanguageEnum.RUSSHIAN, -27));
    }
}