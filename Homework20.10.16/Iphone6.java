    public class Iphone6 {
        protected String model;
        protected int price;
        protected String color;
        protected String material;
        protected int diagonal;

        public Iphone6(String model, int price, String color, String material, int diagonal){
            setPrice(price);
            setColor(color);
            setDiagonal(diagonal);
            setMaterial(material);
            setModel(model);
        }


        protected void setDiagonal(int newDiagonal) {
            this.diagonal = newDiagonal;
        }

        protected int getDiagonal() {
            return diagonal;
        }

        protected void setModel(String newModel) {
            this.model = newModel;
        }

        protected void setColor(String newColor ) {
            this.color = newColor;
        }

        protected void setMaterial(String newMaterial) {
            this.material = newMaterial;
        }

        protected void setPrice(int newPrice) {
            this.price = newPrice;
        }

        protected String getModel(){
            return model;
        }

        protected String getColor() {
            return color;
        }

        protected String getMaterial() {
            return material;
        }

        protected int getPrice() {
            return price;
        }

        public String toString(){
            return "Model: "+ getModel() + ", " + "Price: " + getPrice() + ", " + "Color: " + getColor() + ", "
                    + "Material: " + getMaterial()+", " + "Diagonal: " + getDiagonal();
        }

        @Override
        public int hashCode() {
            return (this.diagonal+this.price)/2*1000;
        }

        @Override
        protected Iphone6 clone() {
            return new Iphone6(this.model , this.price, this.color, this.material, this.diagonal);
        }

        public boolean equals(Iphone6 iphone6) {
            if (this.model.equals(iphone6.model) && this.color.equals(iphone6.color) && this.price == iphone6.price &&
                    this.diagonal == iphone6.diagonal && this.material.equals(iphone6.material)) return true;
            else return false;
        }
    }
