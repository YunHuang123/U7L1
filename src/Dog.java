public class Dog {
    private String name;

    public Dog(String dogName)
    {
        name = dogName;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String dogName)
    {
        name = dogName;
    }

    public void bark()
    {
        System.out.println("woof!");
    }

    public String toString()
    {
        return "Dog: " + name;
    }
}
