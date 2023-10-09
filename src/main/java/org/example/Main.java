package org.example;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String[] words = {"dog", "tiger", "hall", "tower", "tiger", "help", "tiger", "dog", "tower", "euro"};
        TreeMap<String, Integer> wordList = new TreeMap<>();
        for (String i : words) {
            wordList.put(i, wordList.getOrDefault(i, 0) + 1);
        }
        System.out.println(wordList.entrySet());

        System.out.println("\nЗадание 2");

        Slovar s = new Slovar();
        s.add("Dog","Собака");
        s.add("Dog","Собака");
        s.add("Grandma","Бабушка");
        s.add("Key","Ключ");
        s.add("Run","Бежать");
        s.add("Run","Запустить");
        s.add("Run","Управлять");
        s.add("Run","Управлять");
        s.add("Get","Получить");
        s.add("Walk","Идти");
        s.add("Walk","Идти");
        s.print();
    }
}