/**
 * 
 */
package j.cleancode.wordcount.ui;

import java.util.Scanner;

/**
 * @author ahrens
 *
 */
public class SentenceReader {
	
	/**
	 * @return
	 */
	public static String readSentence() {
		System.out.print("Enter your text: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		
		return input;
	}
}
