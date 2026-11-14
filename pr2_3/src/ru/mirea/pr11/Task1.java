package ru.mirea.pr11;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        Date receivedDate = new Date();

        try { Thread.sleep(2000); } catch (InterruptedException e) {}

        Date submittedDate = new Date(System.currentTimeMillis());

        System.out.println("Разработчик: Иванов И.И.");
        System.out.println("Задание получено: " + receivedDate);
        System.out.println("Задание сдано: " + submittedDate);
    }
}