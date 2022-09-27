import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>(); //cupcakeMenu ArrayList which contains Cupcake objects

        //Objects Declaration
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        System.out.println("We are in the middle of creating the cupcake menu. " +
                "We currently have three cupcakes on the menu but we need to decide on pricing.");
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");

        cupcake.type(); //calling the type() method on the cupcake objects to get the text from standard cupcake class

        System.out.println("How much would you like to charge for the cupcake? " +
                "\n(Input a numerical number taken to 2 decimal places)");

        Scanner input = new Scanner(System.in); //a Scanner object to accept the users input
        double priceText = input.nextDouble();
        input.nextLine();
        //double price = Double.parseDouble(priceText);

        cupcake.setPrice(priceText);//calling the setPrice() method w/the param. of priceText on the cupcake object
        redVelvet.setPrice(priceText + 1); //calling the setPrice() method w/the param. of priceText on the redVelvet object
        chocolate.setPrice(priceText + 2);//calling the setPrice() method w/the param. of priceText on the choco object

        cupcakeMenu.add(cupcake); //adding each of Class objects to the ArrayList
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        System.out.println("If regular cupcake price is " + cupcake.price + ". Then:" +
                "\nRed Velvet cupcake price would be " + redVelvet.price + "." +
                "\nChocolate cupcake price would be " + chocolate.price);

    }
}
class Cupcake{ //public or not? new class named Cupcake

    public double price; // Create a public double variable named price, no value assigned
//  private double price; // Create a private double var so cupcake.price won't be available from main

    public double getPrice() { //CodeGenerate Getter method #1
        return price;
    }

    public void setPrice(double price) { //CodeGenerate Setter method #2
        this.price = price;
    }

    public void type(){ //a public function  'type' that prints and returns void method #3
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }

    public String toString(){ return "" + price; }
}

class RedVelvet extends Cupcake{
    public void type(){
        System.out.println("A red velvet based cupcake, with cream cheese frosting."); //overrides the behavior of the inherited method
    }
}
class Chocolate extends Cupcake{
    public void type(){
        System.out.println("A chocolate based cupcake, with chocolate frosting."); //overrides the behavior of the inherited method
    }
}
