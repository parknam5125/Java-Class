public class Student {
    String name;
    int year;
    double gpa;
    String major;
    int credits;
    double gpaSum;

    String getname(){
        return name;
    }
    String getMajor(){
        return major;
    }
    void printData(){
        Syetem.out.println("name: "+name);
        Syetem.out.println("year: "+year);
        Syetem.out.println("gpa: "+gpa);
        Syetem.out.println("major: "+major);
        Syetem.out.println("credits: "+credits);
        Syetem.out.println("gpaSum: "+gpaSum);
    }
    void increaseYear(){
        year++;
    }
}
