/**
 * 
 */
package j.cleancode.wordcount.app;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @author ahrens
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			new WordCount().execute();
		} catch (IOException | URISyntaxException e) {
			System.err.println(e);
		}
	}
}
