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
        System.out.println("name: "+name);
        System.out.println("year: "+year);
        System.out.println("gpa: "+gpa);
        System.out.println("major: "+major);
        System.out.println("credits: "+credits);
        System.out.println("gpaSum: "+gpaSum);
    }
    void increaseYear(){
        year++;
    }
}
