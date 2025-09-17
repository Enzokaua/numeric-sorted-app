package com.enzordrigues.numericaldraw.utils;

import java.util.Random;

public class Utils {

    public String randomGenerate(Integer value1, Integer value2){
        Random random = new Random();
        if(value1 >= value2){
            return String.valueOf(random.nextInt((value1 - value2) + 1) + value2);
        } else {
            return String.valueOf(random.nextInt((value2 - value1) + 1) + value1);
        }
    }
}
