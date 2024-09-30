public class Student extends Person{
    private final int voto;

    public Student(String name, int age, int voto){
        super(name, age); //I have to call the constructor of the super class!! I can't modify it's private attributes directly
        this.voto = voto;
    }

    public int getVoto(){
        return voto;
    }

    @Override
    public void print(){
        System.out.println("Name: " + this.getName() + "\nAge: " + this.getAge() + "\nVoto: " + voto);
    }
}

