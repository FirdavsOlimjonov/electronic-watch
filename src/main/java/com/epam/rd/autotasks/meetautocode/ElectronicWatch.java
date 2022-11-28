package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        int day = number/86400;
        number-= (day*86400);

        int hour = number/3600;
        number-=(hour*3600);

        int min = number/60;
        number-= (min*60);

        int sec = number;

        StringBuilder minS = new StringBuilder();
        minS.append(0);
        minS.append(min);
        String minStr = minS.substring(minS.length()-2);

        StringBuilder secS = new StringBuilder();
        secS.append(0);
        secS.append(sec);
        String secStr = secS.substring(secS.length()-2);

        System.out.println(hour+":"+minStr+":"+secStr);


    }
}

