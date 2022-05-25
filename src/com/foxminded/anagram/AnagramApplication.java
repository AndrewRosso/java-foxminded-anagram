package com.foxminded.anagram;

import com.foxminded.anagram.reversers.WordsReverser;

import java.util.Scanner;

public class AnagramApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();

        WordsReverser myWords = new WordsReverser();
        System.out.println(myWords.reverseAllWords(inputText));
    }
}
