package org.example;

import java.util.LinkedHashSet;
import java.util.TreeMap;

public class Slovar {
    private final TreeMap<String, LinkedHashSet <String>> Slovar = new TreeMap<>();

    public void add(String slovo, String translation) {
        LinkedHashSet <String> translations = Slovar.getOrDefault(slovo, new LinkedHashSet <>());
        if(translations.contains(translation) && slovo.contains(slovo)){
            System.out.println("строка'" + slovo + " " + translation + "' продублирована");
        }
        else if (translations.contains(translation)){
                System.out.println("Перевод '" + translation + "' для слова '"+slovo+ "' уже имеется");
        }
        translations.add(translation);
        Slovar.put(slovo, translations);
    }
    public void print() {
        for (String key : Slovar.keySet()) {
            LinkedHashSet <String> translations = Slovar.get(key);

            if (translations.size() > 1){
                System.out.println(key + " переводы: " + String.join(" или ", translations));
            }
            else{
                System.out.println(key + " перевод: " + String.join("", translations));
            }
        }
        System.out.println(Slovar.entrySet());
    }
}
