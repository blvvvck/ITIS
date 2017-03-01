public class IphoneViewer {

    public static void main(String[] args) {
        Iphone6sPlus i1 = new Iphone6sPlus("Apple Iphone", 25000, "Space Gray", "Aluminum", 5);

        System.out.println(i1);

        Iphone6sPlus i2 = i1.clone();
        System.out.println(i2);
        System.out.println("Hash code: " + i1.hashCode());
        System.out.println("Hardware equality: " + i1.equals(i2));
    }

}
