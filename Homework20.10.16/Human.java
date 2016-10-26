public class Human extends Monkey {

    public String getInfoProf() {
        if (iq > 100) {
            prof = "Can be a programmer";
        }
        else if (iq < 100){
            prof = "Can't be a programmer";
        }
        return prof;
    }

    public String getInfoTools() {
        if (intellect > 3) {
            tools = "Can make the perfect tool";
        }
        else if (intellect <= 3) {
            tools = "Can't make the perfect tool";
        }
        return tools;
    }

}
