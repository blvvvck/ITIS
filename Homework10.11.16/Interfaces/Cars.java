public class Cars {
    public static void main(String[] args) {
        Bmw b = new Bmw();
        System.out.println("BMW");
        b.setAmount(3);
        b.setType("Спортивный");
        b.wheelInfo();
        b.pedalInfo();
        b.setPower("400 horsepower");
        b.engineInfo();
        b.turboBoost();

        System.out.println();
        
        System.out.println("Lada");
        Lada l = new Lada();
        l.setAmount(3);
        l.setType("Семейная");
        l.wheelInfo();
        l.pedalInfo();
        l.setPower("100 horsepower");
        l.engineInfo();
    }

}