/*
 * Classname Main
 *
 * Version info 1
 *
 * Copyright Vasylkivska Kateryna KNTEU
 *  */

//-------------------------------------------
//1. Write to console 8 facts about yourself using primitive types.

package com.company;

public class Main {

    public static void main(String[] args) {
        byte age = 6;
        short squats = 150;
        int money = 180000;
        long cells = 100_000_000_000l;
        float water = 1.5f;
        double houseArea = 180.0;
        char bloodType = '1';
        boolean amGirl = true;
        String AboutMySelf = " My name is Kate. I went to school at " + age + " \n " +
                "years old. I squat " + squats + " times. I spend " + money + "₴ \n " +
                "per year. My body has " + cells + " cells. I drink " + water + "l \n " +
                "of water. The area of my house is " + houseArea + " square meters. \n " +
                "I have " + bloodType+ " blood type. I am girl. It's " + amGirl + ".";
        System.out.println(AboutMySelf);
        System.out.println(AboutMySelf.length());

    }
}
