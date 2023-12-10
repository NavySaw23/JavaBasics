class dog{
    //instance variables - global inside a class, belongs to object
    int age;
    String name;

    // default constructor - runs at object creation
    dog(){
        name = "Bruno";
        age  = 0;
    }

    // parametrized constructors
    dog(String inputted_name){
        name = inputted_name;
        age  = 0;
    }

    dog(int inputted_age){
        name = "Bruno";
        age  = inputted_age;
    }

    dog(String inputted_name, int inputted_age){
        name = inputted_name;
        age  = inputted_age;
    }

    //details display function
    public void details(){
        System.err.println("Name - " +name+ "\nAge - " +age);
    }
}

class p4_Constructors {
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
