public class Main {
    public static void main(String[] args) {
         // Encapsulation
         EncapsulationAnimals myanimals = new EncapsulationAnimals();

         String dog=myanimals.dog("My Dog can"," Howwwowww");
         System.out.println(dog);

         String cat=myanimals.cat("My Cat can "," Meoww Meoww");
         System.out.println(cat);

         // Inheritance
           InheritanceAnimals MyNewAnimals= new InheritanceAnimals();
           String fish =MyNewAnimals.Fish("Fish Pory " , "Can Swim");
           System.out.println(fish);

           String bird=MyNewAnimals.bird("My bird ", " Can Fly");
           System.out.println(bird);

           String mycat=MyNewAnimals.cat("This cat called " , "Noosa");
           System.out.println(mycat);

           // Polymorphism
             PolymorphismAnimals difAnimals= new PolymorphismAnimals();
             int mydifanimal =difAnimals.myAnimals(5,6);
             System.out.println(mydifanimal);

             String mydifanimal2 = difAnimals.myAnimals("Nossa","Meoow");
             System.out.println(mydifanimal2);

            // Abstraction
        AbsAnimals abbanimal= new AbsAnimals();
                String ANIMALS= abbanimal.newAni("CAT ","MEOWWWW");
           System.out.println(ANIMALS);
           }

    }
