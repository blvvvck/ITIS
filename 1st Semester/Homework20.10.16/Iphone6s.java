public class Iphone6s extends Iphone6 {

    public Iphone6s(String model, int price, String color, String material, int diagonal) {
        super(model, price + 20000, color, material, diagonal);
    }

    @Override
    protected Iphone6s clone() {
        return new Iphone6s(this.model , this.price, this.color, this.material, this.diagonal);
    }
}