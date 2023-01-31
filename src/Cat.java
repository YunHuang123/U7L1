public class Cat {
    private String name;

    public Cat(String catName)
    {
        name = catName;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String catName)
    {
        name = catName;
    }

    public String toString()
    {
        return "Cat: " + name;
    }
}
