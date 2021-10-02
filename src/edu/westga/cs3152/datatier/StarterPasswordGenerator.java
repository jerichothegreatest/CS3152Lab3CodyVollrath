package edu.westga.cs3152.datatier;

import java.util.ArrayList;

public class StarterPasswordGenerator {
	private final static int ALPHABET_LENGTH = 26;
	private final static int UPPER_ASCII_INDEX = 65;
	private final static int LOWER_ASCII_INDEX = 97;
	private final static int MAX_MIN_OUTCOMES = 10000;
	private StarterPasswordGenerator() {}
	
	public static ArrayList<String> getStarterPasswords() {
		ArrayList<String> generatedPasswords = new ArrayList<String>();
		for (int upper = 0; upper < ALPHABET_LENGTH; upper++) {
			for (int lower = 0; lower < ALPHABET_LENGTH; lower++) {
				for (int numbers = 0; numbers < MAX_MIN_OUTCOMES; numbers++) {
					String upperCase = String.valueOf(((char)(UPPER_ASCII_INDEX + upper)));
					String lowerCase = String.valueOf(((char)(LOWER_ASCII_INDEX + lower)));
					String pin = convertIntToPin(numbers);
					String password = upperCase + lowerCase + pin;
					generatedPasswords.add(password);
				}
			}
		}
		return generatedPasswords;
	}
	
	private static String convertIntToPin(int value) {
		String pin = String.format("%04d", value);
		return pin;
	}
}
