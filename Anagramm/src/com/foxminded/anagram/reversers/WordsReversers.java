package com.foxminded.anagram.reversers;

public class WordsReversers {
	
	public String reverseAllWords(String input) {

		String inputWords[] = input.split(" ");
		String outputWords[] = new String[inputWords.length];

		for (int i = 0; i < inputWords.length; i++) {
			outputWords[i] = reverseWord(inputWords[i]);
		}
		return String.join(" ", outputWords);
	}

	private static String reverseWord(String incomingWord) {

		char[] inputSymbol = incomingWord.toCharArray();
		char[] outSymbol = new char[inputSymbol.length];

		int indexStart = 0;
		int indexEnd = inputSymbol.length - 1;

		while (indexStart <= indexEnd) {

			if (!Character.isLetter(inputSymbol[indexStart])) {
				outSymbol[indexStart] = inputSymbol[indexStart];
				indexStart++;
			}
			if (!Character.isLetter(inputSymbol[indexEnd])) {
				outSymbol[indexEnd] = inputSymbol[indexEnd];
				indexEnd--;
			}
			if (Character.isLetter(inputSymbol[indexStart]) && Character.isLetter(inputSymbol[indexEnd])) {

				outSymbol[indexEnd] = inputSymbol[indexStart];
				outSymbol[indexStart] = inputSymbol[indexEnd];

				indexEnd--;
				indexStart++;
			}
		}
		return String.valueOf(outSymbol);
	}
}
