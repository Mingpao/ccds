/**
 * 
 */
package j.cleancode.wordcount.logik;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ahrens
 *
 */
public class WordCounter {

	/**
	 * @param sentence
	 * @param stopWords
	 * @return
	 */
	public static int getWordCountFromString(String sentence, List<String> stopWords) {
		List<String> words = split(sentence, " ");
		int wordCount = filter(words, stopWords);
		
		return wordCount;
	}
	
	/**
	 * @param sentence
	 * @param delim
	 * @return
	 */
	private static List<String> split(String sentence, String delim) {
		List<String> words = Arrays.stream((sentence).split(delim)).collect(Collectors.toList());
		
		return words;
	}
	
	/**
	 * @param words
	 * @param stopWords
	 * @return
	 */
	private static int filter(List<String> words, List<String> stopWords) {
		int wordCount = 0;
		wordCount = (int) words.stream().filter(word -> !stopWords.contains(word)).count();
		
		return wordCount;
	}
}
