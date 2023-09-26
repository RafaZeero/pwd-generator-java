import java.security.SecureRandom;

public class PasswordGenerator {
    public static void main(String[] args) {
        int passwordLength = 12; // Default password length
        boolean useDigits = false; // Default to not use digits
        boolean useSpecialChars = false; // Default to not use digits

        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                if (args[i].equals("--useDigits")) {
                    useDigits = true;
                } else if (args[i].equals("--useSpecial")) {
                    useSpecialChars = true;
                } else if (args[i].matches("--length=\\d+")) {
                    passwordLength = Integer.parseInt(args[i].substring(9)); // Extract the length from --length= argument
                    if (passwordLength > 36) {
                        System.out.println("Password length too big. Max length is 36");
                        return;
                    }
                } else {
                    System.out.println("Usage: java PasswordGenerator [--useDigits] [--useSpecial] [--length=<passwordLength>]");
                    return;
                }
            }
        }

        String generatedPassword = generatePassword(passwordLength, useDigits, useSpecialChars);
        System.out.println("Generated Password: " + generatedPassword);
    }

    public static String generatePassword(int length, boolean useDigits, boolean useSpecialChars) {
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        
        String allCharacters = uppercaseLetters + lowercaseLetters;
        if (useDigits) {
            String digits = "0123456789";
            allCharacters += digits;
        }
        if (useSpecialChars) {
            String specialCharacters = "!@#$%^&*()_+";
            allCharacters += specialCharacters;
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(randomIndex));
        }

        return password.toString();
    }
}