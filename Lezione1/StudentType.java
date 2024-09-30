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
