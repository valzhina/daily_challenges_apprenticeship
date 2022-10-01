import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();
        try {
            File log_file = new File("people.txt");
            Scanner reader = new Scanner(log_file);

            String line;
            String instanceType = "";
            String[] lineData;

            while (reader.hasNextLine()) {
//                System.out.println(reader.nextLine());
                line = reader.nextLine();
                lineData = line.split("\t");

                if (lineData.length == 1) {
                    instanceType = lineData[0];
                }
                else if (instanceType.equals("People")) {
                    people.add(new Person(lineData[0], Integer.parseInt(lineData[1])));
                }
                else if (instanceType.equals("Students")) {
                    people.add(new Student(lineData[0], Integer.parseInt(lineData[1]), lineData[2].charAt(0)));// charAt(0)))
                }
                else if (instanceType.equals("Teachers")) {
                    people.add(new Teacher(lineData[0], Integer.parseInt(lineData[1]), Integer.parseInt(lineData[2])));
                }
            }
            System.out.println(people);
            reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }

        Person oldest = new Person("DefaultPerson", 0);
        for (Person p : people) {
            if (p.getAge() >= oldest.getAge()) {
                oldest = p;
            }
        }
//        System.out.printf("%s is the oldest at age %d", oldest.getName(), oldest.getAge());

        try {
            FileWriter fw = new FileWriter("people.txt", true);
            PrintWriter promptWriter = new PrintWriter(fw); // PrintWriter takes FileWriter as a param

            promptWriter.println("\n" + oldest.getName() + " is the oldest, at " + oldest.getAge());

            promptWriter.close();
            System.out.println("Successfully append to the file");
        }
        catch(IOException e) {
            System.out.println("An error occurred.");
        }
        

    }
}
