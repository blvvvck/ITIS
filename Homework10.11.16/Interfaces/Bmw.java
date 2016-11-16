public class Bmw implements SteeringWheel, UpgradeEngine, Pedals  {
    int amount;
    String type;
    String power;

    @Override
    public void setAmount(int newAmount) {
         this.amount = newAmount;

    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void pedalInfo() {
        System.out.println("Number of Pedals: " + getAmount());
    }

    @Override
    public void setType(String newType) {
        this.type = newType;

    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void wheelInfo() {
        System.out.println("Type of Steering Wheel : " + getType());
    }


    @Override
    public void setPower(String newPower) {
        this.power = newPower;
    }

    @Override
    public String getPower() {
        return power;
    }

    @Override
    public void engineInfo() {
        System.out.println("Power: " + getPower());
    }

    @Override
    public void turboBoost() {
        System.out.println("Speed +50km/h");
    }
}