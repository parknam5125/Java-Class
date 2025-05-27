public class Doctor extends Person {
    String specialty;
    double visit_fee;

    public Doctor(){
        super();
        specialty = "Not yet";
        visit_fee = 0;
    }
    public Doctor(String specialty, double fee){
        this.specialty = specialty;
        visit_fee = fee;
    }
    public void setSpecialty(String specialty){
        String major[] = {"Medicine", "Surgery", "Dentist", "Oriental"};
        boolean isValid = false;

        for(String m : major){
            if(m.equalsIgnoreCase(specialty)){
                isValid = true;
                break;
            }
        }
        if(isValid){
            this.specialty = specialty;
        }
        else{
            System.exit(0);
        }
    }
    public void setVisitFee(double fee){
        this.visit_fee = fee;
    }
    public String getSpecialty(){
        return specialty;
    }
    public double getVisitfee(){
        return visit_fee;
    }
    public String toString(){
        return "Name: " + getName() + "\nSpecialty: " + getSpecialty() + "\nVisitFee: " + getVisitfee();
    }
    public boolean equals(Object other){
        boolean isEqual = false;
        if(other instanceof Doctor){
            Doctor otherDoctor = (Doctor)other;
            isEqual = this.specialty.equals(otherDoctor.specialty)&&(this.visit_fee==otherDoctor.visit_fee);
        }
        return isEqual;
    }
}
