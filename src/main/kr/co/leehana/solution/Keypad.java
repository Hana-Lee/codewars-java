package kr.co.leehana.solution;

/**
 * Created by Hana Lee on 2015-10-23 오후 3:14
 *
 * @author {@link "mailto:i@leehana.co.kr" "Hana Lee"}
 * @since 2015-10-23 오후 3:14
 *
 * = Description =
 * Multi-tap Keypad Text Entry on an Old Mobile Phone
 *
 * Prior to having fancy iPhones, teenagers would wear out their thumbs sending SMS messages on
 * candybar-shaped feature phones with 3x4 numeric keypads.
 *
 * ------- ------- -------
 * |     | | ABC | | DEF |
 * |  1  | |  2  | |  3  |
 * ------- ------- -------
 * ------- ------- -------
 * | GHI | | JKL | | MNO |
 * |  4  | |  5  | |  6  |
 * ------- ------- -------
 * ------- ------- -------
 * |PQRS | | TUV | | WXYZ|
 * |  7  | |  8  | |  9  |
 * ------- ------- -------
 * ------- ------- -------
 * |     | |space| |     |
 * |  *  | |  0  | |  #  |
 * ------- ------- -------
 *
 * Prior to the development of T9 (predictive text entry) systems, the method to type words was called "multi-tap"
 * and involved pressing a button repeatedly to cycle through the possible values.
 *
 * For example, to type a letter "R" you would press the 7 key three times (as the screen display for the current
 * character cycles through P->Q->R->S->7). A character is "locked in" once the user presses a different key
 * or pauses for a short period of time (thus, no extra button presses are required beyond what is needed
 * for each letter individually). The zero key handles spaces, with one press of the key producing a space
 * and two presses producing a zero.
 *
 * In order to send the message "WHERE DO U WANT 2 MEET L8R" a teen would have to actually do 47 button presses.
 * No wonder they abbreviated.
 *
 * For this assignment, write a module that can calculate the amount of button presses required for any phrase.
 * Punctuation can be ignored for this exercise. Likewise, you can assume the phone doesn't distinguish between
 * upper/lowercase characters (but you should allow your module to accept input in either for convenience).
 *
 * Hint: While it wouldn't take too long to hard code the amount of keypresses for all 26 letters by hand,
 * try to avoid doing so! (Imagine you work at a phone manufacturer who might be testing out different keyboard layouts,
 * and you want to be able to test new ones rapidly.)
 */
public class Keypad {
	public static int presses(String phrase) {
		char[][] keypad = {
				{'1'},                 {'A','B','C','2'}, {'D','E','F','3'},
				{'G','H','I','4'},     {'J','K','L','5'}, {'M','N','O','6'},
				{'P','Q','R','S','7'}, {'T','U','V','8'}, {'W','X','Y','Z','9'},
				{'*'},                 {' ', '0'},        {'#'}
		};
		char[][] keypad2 = {
				{'1', 'A', 'D', 'G', 'J', 'M', 'P', 'T', 'W', '*', ' ', '#'},
				{'B', 'E', 'H', 'K', 'N', 'Q', 'U', 'X', '0'},
				{'C', 'F', 'I', 'L', 'O', 'R', 'V', 'Y'},
				{'2', '3', '4', '5', '6', 'S', '8', 'Z'},
				{'7', '9'}
		};

		String[] keypad3 = {
				"1ADGJMPTW* #",
				"BEHKNQUX0",
				"CFILORVY",
				"23456S8Z",
				"79"
		};

		int result = 0;
		String[] phraseArray = phrase.toUpperCase().split("");
		for (int i = 0; i < keypad3.length; i++) {
			for (String phraseLetter : phraseArray) {
				if (keypad3[i].contains(phraseLetter)) {
					result += (i + 1);
				}
			}
		}
		return result;
	}

	// jcniebla's solution
	static String[] keys = {"1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#"};
	public static int otherPresses(String phrase) {
		int nPresses = 0;

		for (char c : phrase.toUpperCase().toCharArray())
			for (String s : keys)
				nPresses += s.indexOf(c) + 1;
		return nPresses;
	}
}
