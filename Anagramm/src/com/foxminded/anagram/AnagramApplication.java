package com.foxminded.anagram;
import com.foxminded.anagram.reversers.WordsReversers;

public class AnagramApplication {

	public static void main(String[] args) {

		WordsReversers myWords = new WordsReversers();

		System.out.println(myWords.reverseAllWords("Hell1 world1s"));

	}

}
