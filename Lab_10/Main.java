package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;
import java.io.FileWriter;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println("Доброго дня! Що ви бажаєте зробити:");
        System.out.println("1 - Записати дані в файл;");
        System.out.println("2 - Зчитати дані з файлу");
        System.out.print("Введіть цифру: ");
        Scanner in = new Scanner(System.in);
        int numb = in.nextInt();
        if(numb == 1){
            Scanner name = new Scanner(System.in);
            System.out.print("Ваше ім'я: ");
            String name_text = name.nextLine();
            Scanner gender = new Scanner(System.in);
            System.out.print("Ваша стать: ");
            String gender_text = gender.nextLine();
            Scanner registration = new Scanner(System.in);
            System.out.print("Реєстраційний номер: ");
            String reg_text = registration.nextLine();
            Scanner date = new Scanner(System.in);
            System.out.print("Дата реєстрації: ");
            String date_text = date.nextLine();
            System.out.println("Ваше ім'я - " + name_text);
            System.out.println("Ваша стать - " + gender_text);
            System.out.println("Ваш реєстраційний номер - " + reg_text);
            System.out.println("Ваша дата реєстрації - " + date_text);
            File myFile = new File("C:\\Users\\DareBlig\\IdeaProjects\\Lab_10\\Information.txt");
            try {
                PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
                writer.println("Ім'я - " + name_text);
                writer.println("Стать - " + gender_text);
                writer.println("Реєстраційний номер - " + reg_text);
                writer.println("Дата реєстрації - " + date_text);
                writer.println("**************************************");
                writer.flush();
                writer.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
        else if(numb == 2) {
            File file = new File("C:\\Users\\DareBlig\\IdeaProjects\\Lab_10\\Information.txt");

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }
            else {
                System.out.println("Дана команда не підтримується");
        }
    }
}
