package domain;

public class Exercise {
    /**
     * a function that takes a string, reverse it and compares with the original
     * @param str contains a word to be checked for palindromy
     * @return true if word is palindrome and false if not
     */
    public static boolean Calculate(String str) {
        if(str.equals(new StringBuffer(str).reverse().toString()))
        {
            return true;
        }
        return false;
    }
}
