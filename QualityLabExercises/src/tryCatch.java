public class tryCatch {
    public static void main(String[] args) {
       try {
           int[] numbers = {1, 2, 3, 4};
           System.out.println(numbers[2]);
       }
       catch(Exception e)
        {
            System.out.println("Wrong number of index");

        }
    }
}
