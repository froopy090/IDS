public class Person{
    private final int age; //final means I can't change it once it has been set
    private final String name; //you will get errors if you try to modify it some way

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void print(){
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}
