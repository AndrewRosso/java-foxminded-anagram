package com.foxminded.anagram.reversers;

public class WordsReverser {
	
	public String reverseAllWords(String input) {

		String inputWords[] = input.split(" ");
		String outputWords[] = new String[inputWords.length];

		for (int i = 0; i < inputWords.length; i++) {
			outputWords[i] = reverseWord(inputWords[i]);
		}
		return String.join(" ", outputWords);
	}

	private String reverseWord(String incomingWord) {

		char[] inputSymbol = incomingWord.toCharArray();
		char[] outSymbol = new char[inputSymbol.length];

		int startIndex = 0;
		int endIndex = inputSymbol.length - 1;

		while (startIndex <= endIndex) {

			if (!Character.isLetter(inputSymbol[startIndex])) {
				outSymbol[startIndex] = inputSymbol[startIndex];
				startIndex++;
			}
			if (!Character.isLetter(inputSymbol[endIndex])) {
				outSymbol[endIndex] = inputSymbol[endIndex];
				endIndex--;
			}
			if (Character.isLetter(inputSymbol[startIndex]) && Character.isLetter(inputSymbol[endIndex])) {

				outSymbol[endIndex] = inputSymbol[startIndex];
				outSymbol[startIndex] = inputSymbol[endIndex];

				endIndex--;
				startIndex++;
			}
		}
		return String.valueOf(outSymbol);
	}
}
