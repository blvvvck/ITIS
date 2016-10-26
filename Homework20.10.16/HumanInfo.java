public class HumanInfo {
    public static void main(String[] args) {

        Human h = new Human();

        h.setAge(20);
        h.setIntAge(24);
        h.setHabitat("Megapolis");
        h.setIntellect(4);

        System.out.println("Age: "+h.getAge());
        System.out.println("Habitat: "+h.getHabitat());
        System.out.println("Intellect: "+h.getIntellect());
        System.out.println("IQ: " +h.getIQ());
        System.out.println(h.getInfoProf());
        System.out.println(h.getInfoTools());

    }
}
