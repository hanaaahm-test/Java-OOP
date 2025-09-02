import java.util.Scanner;

public class PalindromeCheckWithLoop
{
    public static void main (String []args)
    {
        PalindromeCheckWithLoop palchk=new PalindromeCheckWithLoop();
        String word=palchk.getWordFromUser();
       }
    public String getWordFromUser()
    {
        System.out.println("Please Enter Your Word");
        Scanner scan =new Scanner(System.in);
        String word= scan.next();

        if (isPalindrome(word)) {
            System.out.println("\"" + word + "\" is a palindrome.");
        } else {
            System.out.println("\"" + word + "\" is not a palindrome.");
        }
        scan.close();
        return word;

    }
    public static boolean isPalindrome(String str) {
        int leftsub= 0;
        int rightsub = str.length() - 1;

        while (leftsub < rightsub) {

            if (str.charAt(leftsub) != str.charAt(rightsub)) {
                return false;
            }
            leftsub++;
            rightsub--;
        }
        return true;
    }

}
