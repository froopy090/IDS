public class Student extends Person implements Printable{
    private final int voto;
    private final StudentType type;

    public Student(String name, int age, int voto, StudentType type){
        super(name, age); //I have to call the constructor of the super class!! I can't modify it's private attributes directly
        this.voto = voto;
        this.type = type;
    }

    public int getVoto(){
        return voto;
    }
    
    public int getInterest(){
        switch(type){
            case ING -> {
                return 100;
            }
            case ARCH -> {
                return 50;
            }
            default -> {
                return 0;
            }
        }
    }

    @Override //an override occurs when you have the same signature (same name, same parameters)
    public void print(){
        System.out.println("Name: " + this.getName() + "\nAge: " + this.getAge() + "\nVoto: " + voto);
    }
    
    //this is not an override, it is an overload (same name, different parameters)
    public void print(int repititions){
        for(int i = 0; i < repititions; i++){
            print();
        }
    }
}

