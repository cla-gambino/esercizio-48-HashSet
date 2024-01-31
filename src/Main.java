import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(myDogs());

        String dog = "Akita";
        HashSet<String> dogHouse = myDogs();
        dogHouse.add(dog);

        System.out.println(dogHouse);


//        for (String element : dogHouse) {
//            System.out.println("ecco il cane di razza: " + element);
//        }

        Iterator<String> iterator = dogHouse.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("ecco il cane di razza: " + element);
            if (Objects.equals(element, "Akita")) {
                iterator.remove();
            }
        }

        System.out.println(dogHouse);

        dogHouse.clear();
        System.out.println(dogHouse);

    }

    private static HashSet<String> myDogs() {
        HashSet<String> dogs = new HashSet<String>();
        dogs.add("Chow Chow");
        dogs.add("Shiba Inu");
        dogs.add("Labrador");
        dogs.add("Golden Retriever");
        dogs.add("Samoyed");
        return dogs;
    }
}