/**
 * Created by bob.brown on 3/6/17.
 */
public class Dog extends Animal {

    private String sound;

    public Dog(String name)
    {
        super(name);
    }

    public String getSound() {
        sound = "Bark";
        return sound;
    }

    public void chaseMailMan()
    {

    }
}
