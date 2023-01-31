import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*ArrayList<String> trees = new ArrayList<String>();
        trees.add("pine");
        trees.add("maple");
        trees.add("frasier fir");
        System.out.println(trees);
        System.out.println(trees.size());
        System.out.println(trees.get(1));

        ArrayList<String> names = new ArrayList<String>();
        names.add("Benji");
        names.add("Andy");
        String[] moreNames = {"Crystal", "Monica", "Toby"};
        int lengths = names.size() + moreNames.length + names.get(0).length() + moreNames[0].length();
        System.out.println(lengths);

        ArrayList<Cat> Tails = new ArrayList<Cat>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        cat1.setName("Whiskers");
        Tails.add(cat1);
        cat2.setName("Angel");
        Tails.add(cat2);
        cat3.setName("Felix");
        Tails.add(cat3);
        cat4.setName("Fluffy");
        Tails.add(cat4);
        Cat cat5 = new Cat();
        cat5.setName("Oscar");
        Cat newCat = cat5;
        Tails.set(2, newCat);
        System.out.println(Tails);
        cat2.setName("Archie");
        Tails.set(1, cat2);
        System.out.println(Tails);*/

        ArrayList<Dog> dogList = new ArrayList<Dog>();
        Dog dog1 = new Dog("Spot");
        Dog dog2 = new Dog("Benny");
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.get(0).bark();



    }
}
