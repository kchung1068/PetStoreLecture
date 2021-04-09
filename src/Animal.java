/**
 * Created by bob.brown on 3/6/17.
 */
public class Animal {

    private String name;

    public Animal()
    {
        this("animal");
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(Animal a)
    {
        this(a.name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return "HUH?";
    }

}
