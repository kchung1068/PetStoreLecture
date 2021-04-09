/**
 * Created by bob.brown on 3/9/17.
 */
public class PetStore {
    public Animal[] allAnimals;

    public PetStore(Animal[] animalArray)
    {
        allAnimals = new Animal[animalArray.length];
        for (int z = 0; z < animalArray.length; z += 1) {
            if (animalArray[z] == null) {
                allAnimals[z] = new Animal("Animal");
            } else {

                allAnimals[z] = animalArray[z];
            }

        }
    }

    public void addCat(Cat c, int position){

        allAnimals[position] = c;
    }

    public void addDog(Dog d, int position){

        allAnimals[position] = d;
    }

    public String toString(){
        String output = "[";
        for( int x = 0; x < allAnimals.length; x++)
        {
            output += allAnimals[x];
            if(x != allAnimals.length - 1)
                output += ",";
        }
        output += "]";
        return output;
    }
}
