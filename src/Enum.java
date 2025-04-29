public class Enum {
    enum DevType1 { MOBILE, WEB, SERVER }
    enum DevType2 {
        MOBILE("Android"), WEB("CSS"), SERVER("Linux");
        final private String name;
        public String getName() { return name; }
        private DevType2(String name) { this.name = name; }
    }
    public String name;
    public int carrer;
    public DevType1 type1;
    public static void main(String[] args) {
        Enum developer = new Enum();
        developer.name = "Park";
        developer.carrer = 3;
        developer.type1 = DevType1.WEB;
        System.out.println("Developer name : " + developer.name);
        System.out.println("Experience : " + developer.carrer);
        System.out.println("Experties : " + developer.type1);

        DevType1 tp1 = DevType1.MOBILE;
        DevType1 tp2 = DevType1.valueOf("WEB");
        System.out.println(tp1);
        System.out.println(tp2);
        System.out.println(tp1.ordinal());
        System.out.println(tp2.ordinal());
        for(DevType1 type1 : DevType1.values()){
            System.out.println(type1);
        }
        for(DevType2 type2: DevType2.values()){
            System.out.println(type2.getName());
        }
    }
}
