/**
 * 
 */
package j.cleancode.wordcount.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import j.cleancode.wordcount.logik.WordCounter;

/**
 * @author ahrens
 *
 */
class WordCounterTest {
	List<String> stopWords = new ArrayList<>(Arrays.asList("the", "a", "on", "off"));
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}
	
	/**
	 * Test method for {@link j.cleancode.wordcount.logik.WordCounter#getWordCountFromString(java.lang.String, java.util.List)}.
	 */
	@Test
	void testGetWordCountFromString_SentenceWithStopWord() {
		assertTrue(WordCounter.getWordCountFromString("Mary had a little lamb", stopWords) == 4);
	}
	
	/**
	 * Test method for {@link j.cleancode.wordcount.logik.WordCounter#getWordCountFromString(java.lang.String, java.util.List)}.
	 */
	@Test
	void testGetWordCountFromString_SentenceWithoutStopWord() {
		assertTrue(WordCounter.getWordCountFromString("Mary had a little lamb", new ArrayList<String>()) == 5);
	}
	
	/**
	 * Test method for {@link j.cleancode.wordcount.logik.WordCounter#getWordCountFromString(java.lang.String, java.util.List)}.
	 */
	@Test
	void testGetWordCountFromString_SentenceWithNoWords() {
		assertTrue(WordCounter.getWordCountFromString("", stopWords) == 0); //TODO: 1 ?
	}

}
