public class Computer {

    protected String CPU;
    protected String GPU;
    protected String RAM;
    protected int portability; // from 1 to 5;
    protected int price;

    public Computer(String gpu, String cpu, String ram, int price, int portability) {
        setPortability(portability);
        setGPU(gpu);
        setCPU(cpu);
        setRAM(ram);
        setPrice(price);
    }

    protected void setCPU(String newCPU){
        this.CPU = newCPU;
    }

    protected void setPrice(int newPrice) {
        this.price = newPrice;
    }

    protected int getPrice() {
        return price;
    }

    protected void setGPU(String newGPU) {
        this.GPU = newGPU;
    }

    protected void setRAM(String newRAM) {
        this.RAM = newRAM;
    }

    protected void setPortability(int newPortability) {
        this.portability = newPortability;
    }

    protected String getCPU() {
        return  CPU;
    }

    protected String getGPU() {
        return GPU;
    }

    protected String getRAM() {
        return RAM;
    }

    protected int getPortability() {
        return portability;
    }

    public String toString() {
        return "CPU : " + getCPU() + ", " + "GPU: " + getGPU() + ", " + "RAM: " + getRAM() + ", ";
    }


}