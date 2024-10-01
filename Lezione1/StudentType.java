//using enums has advantages: you don't have to have a separate class for everything
//disadvantages: you lose the benfits of classes
//so only use an enum for something that probably won't change over time, like the days of the week is a good example
public enum StudentType{
    ING("Ingegneria"),
    ARCH("Architettura"),
    DES("Design"),
    WRONG("Bruh");

    private String name;

    private StudentType(String name){ //constructor needs to be private
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
