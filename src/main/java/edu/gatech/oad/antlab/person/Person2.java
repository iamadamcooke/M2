package edu.gatech.oad.antlab.person;

import java.util.ArrayList;
import java.util.Collections;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Margaret
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
		ArrayList<Character> letters = new ArrayList<Character>(input.length());
		for ( char c : input.toCharArray() ) {
		   letters.add(c);
		}
		Collections.shuffle(letters);
		char[] shuffled = new char[letters.size()];
		for ( int i = 0; i < shuffled.length; i++ ) {
		   shuffled[i] = letters.get(i);
		}
		String newWord = new String(shuffled);
		return newWord;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
