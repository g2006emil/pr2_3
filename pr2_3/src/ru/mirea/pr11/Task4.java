package ru.mirea.pr11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год, месяц (1-12), день, часы, минуты через пробел:");
        int year = scanner.nextInt();
        int month = scanner.nextInt() - 1;
        int day = scanner.nextInt();
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        // объект Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, 0);

        System.out.println("Объект Calendar: " + calendar.getTime());

        // объект Date на основе Calendar
        Date date = calendar.getTime();
        System.out.println("Объект Date: " + date);
    }
}