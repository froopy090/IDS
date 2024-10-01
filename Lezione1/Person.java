public class Person{
    private final int age; //final means I can't change it once it has been set
    private final String name; //you will get errors if you try to modify it some way
    private static int numPersons = 0; //static essentially makes it a global variable shared by all objects of this class

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        numPersons++;
    }
    
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public static int getNumPersons(){
        return numPersons;
    }

    public void print(){
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}
