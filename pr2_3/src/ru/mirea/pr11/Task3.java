package ru.mirea.pr11;

import java.text.SimpleDateFormat;
import java.util.Date;

class Student {
    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getFormattedBirthDate(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(birthDate);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return "Student{name='" + name + "', birthDate=" + sdf.format(birthDate) + "}";
    }
}

public class Task3 {
    public static void main(String[] args) {
        Date date = new Date(958348800000L);
        Student student = new Student("Алексей", date);

        System.out.println(student.toString());

        System.out.println("Короткий формат: " + student.getFormattedBirthDate("dd.MM.yy"));
        System.out.println("Средний формат: " + student.getFormattedBirthDate("dd MMM yyyy"));
        System.out.println("Полный формат: " + student.getFormattedBirthDate("EEEE, d MMMM yyyy"));
    }
}