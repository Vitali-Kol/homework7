package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод текста пользователем
        System.out.print("Введите текст: ");
        String inputText = scanner.nextLine().toLowerCase();

        // Определяем множество для всех букв русского алфавита
        Set<Character> alphabet = new HashSet<>();
        for (char c = 'а'; c <= 'я'; c++) {
            alphabet.add(c);
        }

        // Удаляем из множества алфавита все буквы, которые встречаются в тексте
        for (char c : inputText.toCharArray()) {
            alphabet.remove(c);
        }

        // Если множество пустое, значит текст содержит все буквы алфавита
        if (alphabet.isEmpty()) {
            System.out.println("Текст содержит все буквы русского алфавита.");
        } else {
            System.out.println("Текст НЕ содержит все буквы русского алфавита.");
            System.out.println("Не хватает следующих букв: " + alphabet);
        }

        scanner.close();
    }
}