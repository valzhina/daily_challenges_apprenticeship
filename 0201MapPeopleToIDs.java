import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] names = new String[5];
        names[0] = "Bob";
        names[1] = "Alphonse";
        names[2] = "Lily";
        names[3] = "Marcus";
        names[4] = "Jess";

        int[] ages = new int[] { 28, 30, 25, 22, 20};

        int[] id = {13530, 48851, 97531, 25545, 92862};

        HashMap<Integer, Person> people = new HashMap<Integer, Person>();

        //        people.put(13530, new Person("Bob", 28));
        //        {
        //            13530:Person("Bob",28)
        //        }
        //        new Person("Bob", 28)

        for (int i = 0; i < id.length; i++) {
            people.put(id[i], new Person(names[i], ages[i]));
        }
        System.out.println(people);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an ID or name: ");
        String entry = input.nextLine();

        try {
            int searchID = Integer.parseInt(entry);
            if(people.containsKey(searchID)){
                System.out.println(people.get(searchID));
            }
            else{
                System.out.println("Person with " + searchID + " not found");
            }
        }
        catch(Exception e) {
            //  for item in keySet of people:
            for(int item: people.keySet()) {
                String currentName = people.get(item).name;
                if(currentName.equalsIgnoreCase(entry)) {
                    System.out.println(people.get(item));
                }
            }
        }

    }
}

class Person {
    public String name;
    public int age;

    public Person() {
        this.name = "John";
        this.age = 31;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ", " + age;
    }

    public boolean equals(Person otherPerson) {
        if (this.name.equals(otherPerson.name) && this.age == otherPerson.age) {
            return true;
        } else {
            return false;
        }
    }
}
