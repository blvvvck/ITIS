public class Notebook extends Computer implements Cloneable {

    public int monitorDiagonal;

    public Notebook(String gpu, String cpu, String ram, int price, int portability, int monitorDiagonal) {
        super(gpu, cpu, ram, price, portability);
        this.monitorDiagonal = monitorDiagonal;
    }

    public void setMonitorDiagonal(int newMonitorDiagonal) {
        this.monitorDiagonal = newMonitorDiagonal;
    }

    public int getMonitorDiagonal() {
        return monitorDiagonal;
    }

    public int getModifiedPortability() {
        return portability - 4;
    }

    public int getModifiedPrice() {
        return price + 5000;
    }

    public String toString() {
        return super.toString() + "Diagonal: " + getMonitorDiagonal() + ", " + "Portability: " + getModifiedPortability() + ", " + "Price: " + getModifiedPrice();
    }





    @Override
    public Notebook clone() {// this function clones objects and methods

        return new Notebook(this.GPU, this.CPU, this.RAM, this.price, this.portability, this.monitorDiagonal);

    }

    public boolean equals(Notebook notebook) {
        if (this.GPU.equals(notebook.GPU) && this.RAM.equals(notebook.RAM) && this.CPU.equals(notebook.CPU) &&
                this.price == notebook.price && this.monitorDiagonal == notebook.monitorDiagonal) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return (this.portability + this.price)/1000;
    }
}
