public class Dog extends Animal {

    Dog(String newType) {
        super(newType);
    }

    @Override
    void getSound() {
        System.out.println(getType() + ": " + "Гав");
    }
}
