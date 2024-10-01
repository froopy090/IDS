public class Corso{
    private final Student[] students;
    private int numStudents;

    public Corso(){
        this.students = new Student[400]; //these contain references to Student objects (400*8 Bytes) all set to null initially
        this.numStudents = 0;
    }

    public void addStudent(Student student){
        this.students[numStudents] = student; //notice how this isn't an issue, I'm not modifying the address, so I don't get an error
        numStudents++; //btw u need to check that we don't already have 400 students, for simplicity we're not adding it
    }

    //returns the sum of student scores in the course
    public int sum(){
        int sum = 0;
        for(int i = 0; i < numStudents; i++){
            sum += students[i].getVoto();
        }
        return sum;
    }

    //this is how to use a for each loop, you lose the index though
    public int sum1(){
        int sum = 0;
        for(Student s : students){ //the issue is that this iterates through ALL students in the array
            sum += s.getVoto(); //so this won't work for the null values in the course
        }
        return sum;
    }
}
