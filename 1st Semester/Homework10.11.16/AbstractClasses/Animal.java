public abstract class Animal {
    private String type;

    Animal(String newType) {
        this.type = newType;
    }

    String getType(){
        return type;
    }

    abstract void getSound();
}
