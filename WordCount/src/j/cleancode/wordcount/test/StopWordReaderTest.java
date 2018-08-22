/**
 * 
 */
package j.cleancode.wordcount.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.junit.jupiter.api.Test;

import j.cleancode.wordcount.ui.StopWordReader;

/**
 * @author ahrens
 *
 */
class StopWordReaderTest {

	/**
	 * Test method for {@link j.cleancode.wordcount.ui.StopWordReader#readStopWordsFromFile(java.lang.String)}.
	 */
	@Test
	void testReadStopWordsFromFile() {
		try {
			List<String> stopWords = StopWordReader.readStopWordsFromFile("j/cleancode/wordcount/stopwords.txt");
			assertTrue(stopWords.size() == 4);
		} catch (IOException | URISyntaxException e) {
			fail(e.getMessage());
		}
	}

}
