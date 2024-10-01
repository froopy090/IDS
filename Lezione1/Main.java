public class Main{
    public static void main(String [] args){
        //int x = 1; //tipo primitivo, si comporta come in C, stack
        /*Data d = new Data(); //puntatore in stack, quando chiamo costruttore mi fa la malloc per me in heap

        Data d1 = d; //entrambi puntano allo stesso oggetto in heap
        d.capodanno();
        System.out.println(d1.getAnno());

        d1 = null;
        d = null; //non è un problema perché java automaticamente fa la free*/


        //Data d = new Data(23, 9, 2024);
        //Data d1 = new Data(30, 9, 2024);
        
        //Util u = new Util(); had to change it to Util instead of Utils because there is another class with the same name apparently
        //u.swap(d, d1);
        //System.out.println(d1.getGiorno());

        //Person p1 = new Person("Name", 32);
        //Student s1 = new Student("Studente", 23, 17, StudentType.ARCH);
        //Person p2 = new Student("Studente2", 24, 18, StudentType.ING); //this works!!, but I cannot use the methods of Student, it's still a Person
        ////Student s2 = new Person("Name2", 44); error!! I want a student type, so I can't "downgrade" to a Person type
        //
        //s1.getVoto();
        //p1.print();
        //s1.print();
        //p2.print(); //note how this uses the override method in Student instead of the print() in Person !! Java starts looking within the dynamic type Student
        //
        //StudentType t1 = StudentType.ING;
        //System.out.println(Person.getNumPersons());
        //
        //Corso ingSoft = new Corso();
        //ingSoft.addStudent(s1);
        //ingSoft.sum1();
        
        //try running this part, trust it makes sense
        Punto2D punto1 = new Punto2D(10, 10);
        Punto2D punto2 = new Punto3D(10,10,20);
        Punto3D punto3 = new Punto3D(10,10,40);

        punto1.distance(punto1);
        punto1.distance(punto2);
        punto1.distance(punto3); //this works because Punto3D is also a Punto2D, no issues
    
        punto2.distance(punto1); //this will grab the methods from Punto3D class because it overrides
        punto2.distance(punto2); //dynamically, punto2 is actually a Punto3D
        punto2.distance(punto3);

        punto3.distance(punto1);
        punto3.distance(punto2);
        punto3.distance(punto3);
    }
}
