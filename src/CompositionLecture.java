/**
 * Created by bob.brown on 3/9/17.
 */
public class CompositionLecture {
    public static void main(String args[]){

    }

    public static void printArray(Animal[] array)
    {
        System.out.print("[");
        for( int x = 0; x < array.length; x++)
        {
            System.out.print(array[x]);
            if(x != array.length - 1)
                System.out.print(",");
        }
        System.out.println("]");
    }

}
