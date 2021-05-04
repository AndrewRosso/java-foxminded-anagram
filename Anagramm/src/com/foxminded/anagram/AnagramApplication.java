package com.foxminded.anagram;
import com.foxminded.anagram.reversers.WordsReverser;

public class AnagramApplication {

	public static void main(String[] args) {

		WordsReverser myWords = new WordsReverser();

		System.out.println(myWords.reverseAllWords("Hell1 world1s"));

	}

}
