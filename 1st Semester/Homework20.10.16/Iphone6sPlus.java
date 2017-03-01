public class Iphone6sPlus extends Iphone6s {

    public Iphone6sPlus(String model, int price, String color, String material, int diagonal) {
        super(model, price, color, material, diagonal + 1);
    }

    @Override
    protected Iphone6sPlus clone() {
        return new Iphone6sPlus(this.model , this.price - 20000, this.color, this.material, this.diagonal - 1);
    }
}
