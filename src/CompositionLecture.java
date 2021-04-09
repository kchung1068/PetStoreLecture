import java.sql.SQLOutput;

/**
 * Created by bob.brown on 3/9/17.
 */
public class CompositionLecture {
    public static void main(String args[]){
            Animal[] bobsdiscount = {new Cat("Fifi"), new Dog("Fido")};


        PetStore petco = new PetStore(bobsdiscount);


        for (int x = 0 ; x < petco.allAnimals.length; x += 1) {
            Animal currentAnimal = petco.allAnimals[x];
            System.out.println(currentAnimal.getSound());
        }
    }

    public static void printArray(Animal[] array)
    {
        System.out.print("[");
        for( int x = 0; x < array.length; x++)
        {
            System.out.print(array[x].getName());
            if(x != array.length - 1)
                System.out.print(",");
        }
        System.out.println("]");
    }

}
