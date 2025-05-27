public class Student extends Person {
    private int studentNumber;
    public Student(){
        super();
        studentNumber = 0;
    }
    public Student(String name, int studentNumber){
        super(name);
        this.studentNumber = studentNumber;
    }
    public void reset(String name, int studentNumber){
        super.setName(name);
        studentNumber = studentNumber;
    }
    public int getStudentNumber(){
        return studentNumber;
    }
    public void setStudentNumber(int num){
        studentNumber = num;
    }
    public void writeOutput(){
        super.writeOutput();
        System.out.println("StudenNumber is " + studentNumber);
    }
    public boolean equals(Student other){
        return (this.hasSameName(other)) && (this.studentNumber == other.studentNumber);
    }
}
