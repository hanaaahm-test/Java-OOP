import java.util.Scanner;

public class PalindromeCheck {

    public static void main (String []args)
    {
        //1- Function get input from user Overriding Done
        //2- Function to remove middle character Done
        //3- Function Substring for words Done
        //4- Reverse for the second part Done
        //5- compare function Done

        PalindromeCheck palindromeCheck = new PalindromeCheck();
        String wordfromUser = palindromeCheck.getWordFromUser();

        String afterRemovedMiddleCharWord = palindromeCheck.removeMiddleCharacter(wordfromUser);

        String [] partsOfTheWord = palindromeCheck.splitWordToParts(afterRemovedMiddleCharWord);

        String reversedPart = palindromeCheck.reverseWord(partsOfTheWord[1]);
        partsOfTheWord[1] = reversedPart;
        palindromeCheck.palindromeVerify(partsOfTheWord, wordfromUser);

    }
     public String getWordFromUser ()
     {
         System.out.println("Please enter the word you want to be checked:");
         Scanner scanner = new Scanner(System.in);
         String wordToBeChecked = scanner.next();
         scanner.close();
         return wordToBeChecked;
     }
     public String removeMiddleCharacter (String wordToBeChecked)
     {
         int x=0;
         String word =wordToBeChecked;
         if (wordToBeChecked.length()%2 !=0) {
             x = wordToBeChecked.length() / 2;
             word = wordToBeChecked.substring(0, x)+wordToBeChecked.substring(x+1);
         }
         return word;
     }
     public String[] splitWordToParts(String wordToBeSplitted)
     {
         String parts [] = new String[2];
         String part;

         part=wordToBeSplitted.substring(0,wordToBeSplitted.length()/2);
         System.out.println(part);
         parts[0]=part;

         part=wordToBeSplitted.substring(wordToBeSplitted.length()/2);
         System.out.println(part);
         parts[1]=part;

         return parts;
     }
     public String reverseWord (String wordToBeReversed)
     {
         String reversePart2 = new StringBuilder(wordToBeReversed).reverse().toString();
         System.out.println(reversePart2);
         return reversePart2;
     }
     public void palindromeVerify (String [] Parts, String wordToBeChecked)
     {
         if(Parts[0].equalsIgnoreCase(Parts[1]))
             System.out.println("The word : "+wordToBeChecked + " is palindrome");
         else
             System.out.println("The word : "+wordToBeChecked + " is not palindrome");
     }
}
