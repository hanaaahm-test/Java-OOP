public class array {
    public static void main(String[] args) {
        int cNo[]={1,2,3};
        String cName[]={"Renault","BMW","Volo"};

        System.out.println(cName[0]+ " " + cNo[0]);
        cName[2]="Jeep";
        System.out.println(cName[2]);
        System.out.println(cNo.length);

        for(String i : cName)
        {
            System.out.println(i);

        }
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // Outputs 7
    }
}
