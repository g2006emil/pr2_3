package ru.mirea.pr11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        System.out.println("Введите дату в формате yyyy-MM-dd HH:mm (например, 2023-11-05 14:30):");
        String userInput = scanner.nextLine();

        try {
            Date userDate = sdf.parse(userInput);
            Date currentDate = new Date();

            System.out.println("Текущая дата: " + sdf.format(currentDate));
            System.out.println("Введенная дата: " + sdf.format(userDate));

            if (userDate.after(currentDate)) {
                System.out.println("Введенная дата находится в будущем.");
            } else if (userDate.before(currentDate)) {
                System.out.println("Введенная дата находится в прошлом.");
            } else {
                System.out.println("Даты совпадают.");
            }
        } catch (ParseException e) {
            System.out.println("Ошибка формата даты. Попробуйте снова.");
        }
    }
}