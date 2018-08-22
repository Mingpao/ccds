/**
 * 
 */
package j.cleancode.wordcount.ui;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ahrens
 *
 */
public class StopWordReader {

	/**
	 * @param filename
	 * @return
	 * @throws IOException
	 * @throws URISyntaxException 
	 */
	public static List<String> readStopWordsFromFile(String filename) throws IOException, URISyntaxException {
		List<String> stopWords = new ArrayList<>();

		URI uri = Thread.currentThread().getContextClassLoader().getResource(filename).toURI();
		
		if (!new File(uri).exists()) {
			System.out.println("Cannot open input file.");
		}
		
		try (Stream<String> stream = Files.lines(Paths.get(uri))) {
			stopWords = stream.collect(Collectors.toList());
		}
		
		return stopWords;
	}
}
