import java.util.Scanner;

import javax.swing.JOptionPane;

public class WordSeparator {

	public static void main(String[] args) {
	
		
		/*Write a program that accepts as input a sentence in which all of the words are run together,
		 *  but the first character of each word is uppercase.
		 *  Convert the sentence to a string in which the words are separated by spaces
		 *   and only the first word starts with an uppercase letter. 
		 * For example, the string “StopAndSmellTheRoses.” 
		 * would be converted to “Stop and smell the roses.” 
		 * Use StringBuilder object for processing the string. Use JOptionPane for user input/output.
		 *  Use wrapper class Character for detecting words */
		
		String sentencein = JOptionPane.showInputDialog(null, "Please enter a sentence: \n");
		
		StringBuilder str = new StringBuilder(sentencein);
		int sentenceinI = 1;
		while(sentenceinI < str.length())
		{
			if(Character.isUpperCase(str.charAt(sentenceinI)))
			{
				//insert space
				str.insert(sentenceinI," ");
				char ch = Character.toLowerCase(str.charAt(sentenceinI+1));
				str.setCharAt((sentenceinI+1),  ch);
			}
			sentenceinI++;
		}//Print out output
		JOptionPane.showMessageDialog(null,"The message is : "  + str );
		System.exit(0);

		 
	}

}
