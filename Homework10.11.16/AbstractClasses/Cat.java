public class Cat extends Animal {

    Cat(String newType) {
        super(newType);
    }

    @Override
    void getSound() {
        System.out.println(getType() + ": " + "Мяу");
    }
}
