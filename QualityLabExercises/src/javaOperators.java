public class javaOperators {
    public static void main(String[] args) {
        int x=10;
        int y=3;
        //Arthematic operators
        System.out.println(x+y);  //جمع
        System.out.println(x-y);  //طرح
        System.out.println(x*y);  // ضرب
        System.out.println(x/y);  // قسمة
        System.out.println(x%y);  // باقى القسمة
        System.out.println(++x);  // زود 1
        System.out.println(--y);  // نقص 1

        //Assignment operators
        System.out.println(x+=3);  //زود على ال x
        System.out.println(y-=1);  //اطرح منها
        System.out.println(x*=10);  // ضرب في
        System.out.println(y/=3);  // اقسم على
        System.out.println(x%=2);  // باقى القسمة
        System.out.println(x&=3);  // زود 1
        System.out.println(y|=2);  // نقص 1
        System.out.println(x^=2);  // باقى القسمة
        System.out.println(x>>=3);  // زود 1
        System.out.println(y<<=2);  // نقص 1
    }
}
