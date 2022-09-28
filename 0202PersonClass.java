public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) { //This feature is known as overloading.
        setName(name);
        setAge(age);
//      this.name = name;
//      this.age = age;
    }

    public Person() {

        this("JohnDoe", 99);

//        setName("JohnDoe");
//        setAge(99);

//        this.name = "JohnDoe";
//        this.age = 99;
    }

    public String getName() { return name;}
    public int getAge() { return age;}

    public void setName(String name) { this.name = name;}

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
        else{
            System.out.println("Invalid integer for age: must be 0 or greater");
        }
    }

    @Override
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

