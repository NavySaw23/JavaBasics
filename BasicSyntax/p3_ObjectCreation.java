class dog{
    int age = 0; //dog starts with age of 0 
    public void birthday(){
        age += 1; //every birthday age is added by 1
        System.out.println("Your dog is now " + age +" years old!");
    }

    public void bark(){
        System.out.println("Bow Wow!");
    }
}

class p3_ObjectCreation {
    public static void main(String args[]){
        dog Bruno = new dog();
        Bruno.birthday();
        Bruno.bark();
        Bruno.birthday();
    }
}
