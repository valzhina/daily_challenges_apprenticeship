public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Bob", 28);
        Student student1 = new Student("Alphonse", 30);
        Teacher teacher1 = new Teacher("Lily", 22);
        Teacher teacher2 = new Teacher("Jess", 20);

        person1.introduce();
        student1.introduce();
        teacher1.introduce("Alphonse");
        teacher2.introduce();
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

    //    ======================================
//    CONSTRUCTOR
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

    public void introduce(){
        System.out.println("Hi, my name is " + getName() + ".");
    }

    @Override
    public String toString() {
        //return name + ", " + age;
        return "{ name = " + this.name + ", \n" +
                "age = " + this.age + "\n" +
                "}\n";

    }

    public boolean equals(Person otherPerson) {
        if (this.name.equals(otherPerson.name) && this.age == otherPerson.age) {
            return true;
        } else {
            return false;
        }
    }
}

class Student extends Person {
    private char grade;
    //private char grade = 'B'; //default grade

    public Student() {
        //super("Student", 12);
        //this.grade = 'B';
        //setGrade ('B');
        this("Student", 12,'B');
    }

    public Student(String name, int age) {
        super(name, age);
        this.grade = grade;
        //setGrade(grade);
    }

    public Student(String name, int age, char grade) {
        super(name, age);
        this.grade = grade;
        //setGrade(grade);
    }

    public char getGrade(){
        return grade;
    }

    public void setGrade(char grade) {
/*
        if ((int)grade >= 65 && (int)grade <= 70 && (int)grade != 69){
            this.grade = grade;
        }
        else if ((int)grade >= 97 && (int)grade <= 102 && (int)grade != 101){
            Character.toUpper(grade);
            this.grade = grade;
        }
        else{
            System.out.println("Invalid char for grade: one of four allowed chars");
        }
*/

/*
        switch(grade){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'F':
                Character.toLowerCase(grade);
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'f':
                this.grade = grade;
                break;
            default:
                System.out.println("Invalid char for grade: one of four allowed chars");
        }
*/

        Character.toUpperCase(grade);
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D') {
            this.grade = grade;
        }
        else{
            System.out.println("Invalid char for grade: one of four allowed chars");
        }
/*
        Character.toUpperCase(grade);
        char[] validGrades = {'A', 'B', 'C', 'D'};

        for(char v: validGrades){
            if(grade == v){

            }
        }
        */

    }
}


class Teacher extends Person {
    private int salary;

    public Teacher() {
        //super("Teacher", 120000);
        //this.salary = 120000;
        //setSalary (120000);
        this("Teacher", 47,120000);
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }


    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary) {
        if (salary >= 150000) {
            this.salary = salary;
        }
        else{
            System.out.println("Invalid int for salary: should be higher or equal 150K");
        }
    }
    public void introduce(){
        System.out.println("Hello, I'm Professor " + getName() + ".");
        //System.out.printf("Hi, my name is %s and I am %d2.2 years old." this.getName(), this.getAge());
        //System.out.printf("Hi, my name is %s and I am %d years old." getName(), getAge());
    }
    public void introduce(String otherName){
        System.out.println("Nice to meet you, " + otherName + "! I'm Professor " + getName() + ".");
    }
}