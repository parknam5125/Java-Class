public class DoctorDemo {
    public static void main(String[] args) {
        Doctor a = new Doctor("Medicine",100);
        Doctor b = new Doctor();
        a.setName("park");
        b.setSpecialty("Medicine");
        b.setVisitFee(100);
        b.setName("park");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(a.equals(b));

    }
}
