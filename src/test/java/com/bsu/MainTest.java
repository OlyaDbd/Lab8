package com.bsu;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void ifValidCheck(){
        List<String> mails = new ArrayList<String>();
        mails.add("Samostroyenko2001@facebook.com");
        mails.add("tessa1999@icloud.com");
        mails.add("+-=4567@google.com");
        mails.add("popov-yandex.ru");
        mails.add("bella.poarch@info.by");
        assertEquals(Main.checkEmail(mails.get(0)), true);
        assertEquals(Main.checkEmail(mails.get(1)), true);
        assertEquals(Main.checkEmail(mails.get(2)), false);
        assertEquals(Main.checkEmail(mails.get(3)), false);
        assertEquals(Main.checkEmail(mails.get(4)), true);
    }
}
