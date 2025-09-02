public class ifElse {
    public static void main(String[] args) {
        int time = 22;
        if (time < 12) {
            System.out.println("Good Morning");
        } else if (time > 12 & time < 20) {
            System.out.println("Good Day");
        } else {
            System.out.println("Good Night");
        }


        String result = (time < 12) ? "Good morning" : "Good Day";
        System.out.println(result);
    }
}

