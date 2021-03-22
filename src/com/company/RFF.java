package com.company;

import java.util.Comparator;

public class RFF implements Comparator <String> {

    @Override
    public int compare(String o1, String o2) {
        Integer first=o1.length();//получаем длинну слова
        Integer second=o2.length();
        return first.compareTo(second);// первое значение first сравниваем со вторым second

    }
}