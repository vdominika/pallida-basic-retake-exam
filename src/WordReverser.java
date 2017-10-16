public class WordReverser
{
    static void reverseEachWordOfString(String inputString)
    {
        String[] words = inputString.split(" ");

        String reverseString = "";

        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";

            for (int j = word.length()-1; j >= 0; j--)
            {
                reverseWord = reverseWord + word.charAt(j);
            }
                reverseString = reverseString + reverseWord + " ";
        }

        System.out.println(inputString);
        System.out.println(reverseString);
    }

    public static void main(String[] args)
    {
        reverseEachWordOfString("lleW ,enod taht saw ton taht drah");
    }
}

        // Create a function that takes a sentence as an input, reverses the letters in every word (but not reverses the words order in the sentence), and returns the sentence with the reversed words.
        // You shouldn't care about upper or lower case letters.
        // Example:
        //
        // String reversedWords = reverseWords("lleW ,enod taht saw ton taht drah");
        // System.out.println(reversedWords);
        //
        // Should print:
        // Well done, that was not that hard

