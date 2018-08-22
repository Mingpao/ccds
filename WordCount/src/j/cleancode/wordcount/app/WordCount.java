/**
 * 
 */
package j.cleancode.wordcount.app;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import j.cleancode.wordcount.logik.WordCounter;
import j.cleancode.wordcount.ui.ResultPrinter;
import j.cleancode.wordcount.ui.SentenceReader;
import j.cleancode.wordcount.ui.StopWordReader;

/**
 * @author ahrens
 *
 */
public class WordCount {
	/**
	 * @return
	 * @throws IOException 
	 * @throws URISyntaxException 
	 */
	public int execute() throws IOException, URISyntaxException {
		List<String> stopWords = StopWordReader.readStopWordsFromFile("j/cleancode/wordcount/stopwords.txt");
		
		String sentenceInput = SentenceReader.readSentence();
		
		int result = WordCounter.getWordCountFromString(sentenceInput, stopWords);

		ResultPrinter.printWordCountResult(result);

		return 0;
	}
}
