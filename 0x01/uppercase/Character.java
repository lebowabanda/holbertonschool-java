public class Character {
    // Method to check if a character is uppercase
    public static boolean IsUpper(char c) {
        // Uppercase letters go from 'A' to 'Z'
        if (c >= 'A' && c <= 'Z') {
            return true;
        } else {
            return false;
        }
    }
}
