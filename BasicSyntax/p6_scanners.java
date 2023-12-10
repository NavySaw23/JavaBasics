//improving default constructor using scanner

import java.util.Scanner;


class dog{
    //instance variables - global inside a class, belongs to object
    int age;
    String name;

    //declare scanner
    Scanner scn = new Scanner(System.in);

    // default constructor - runs at object creation
    dog(){
        System.out.println("Enter name - ");
        String name = scn.next();
        this.name = name;

        System.out.println("Enter age - ");
        int age = scn.nextInt();
        this.age  = age;
    }

    // parametrized constructors
    dog(String name){
        this.name = name;
        age  = 0;
    }

    dog(int age){
        name = "Bruno";
        this.age  = age;
    }

    dog(String name, int age){
        this.name = name;
        this.age  = age;
    }

    //details display function
    public void details(){
        System.err.println("Name - " +name+ "\nAge - " +age);
    }
}

class p6_scanners {
    public static void main(String[] args) {
        dog Bruno = new dog();
        dog Marshall = new dog("Marshall");
        dog BrunoII = new dog(5);
        dog Skyla = new dog("Skyla", 3);

        Bruno.details();
        Marshall.details();
        BrunoII.details();
        Skyla.details();
    }
}
