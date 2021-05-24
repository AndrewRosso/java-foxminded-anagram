package com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.foxminded.anagram.reversers.WordsReverser;

class WordsReverserTest {

	private WordsReverser testInput = new WordsReverser();

	@Test
	void testReverseAllWordsWhenTheyAreNull() {
		NullPointerException exception = assertThrows(NullPointerException.class,
				() -> testInput.reverseAllWords(null));
		assertEquals("Cannot invoke \"String.split(String)\" because \"input\" is null", exception.getMessage());
	}

	@Test
	void testReverseAllWordsAsEmptyString() {
		assertEquals("", testInput.reverseAllWords(""));
	}

	@Test
	void testReverseAllWordsFromLettersOnly() {
		assertEquals("olleH dlroW", testInput.reverseAllWords("Hello World"));
	}

	@Test
	void testReverseAllWordsFromNumbersOnly() {
		assertEquals("556 778", testInput.reverseAllWords("556 778"));
	}

	@Test
	void testReverseAllWordsFromSpecialCharactersOnly() {
		assertEquals("!@#$% ^&*><", testInput.reverseAllWords("!@#$% ^&*><"));
	}

	@Test
	void testReverseAllWordsFromLettersAndNumbersOnly() {
		assertEquals("olleH 123", testInput.reverseAllWords("Hello 123"));
	}

	@Test
	void testReverseAllWordsFromLettersAndSpecialCharactersOnly() {
		assertEquals("olleH naM!", testInput.reverseAllWords("Hello Man!"));
	}

	@Test
	void testReverseAllWordsFromNumbersAndSpecialCharactersOnly() {
		assertEquals("556! 778!", testInput.reverseAllWords("556! 778!"));
	}

	@Test
	void testReverseAllWordsFromLettersAndNumbersAndSpecialCharactersOnly() {
		assertEquals("olleH dlroW123!", testInput.reverseAllWords("Hello World123!"));
	}
}
