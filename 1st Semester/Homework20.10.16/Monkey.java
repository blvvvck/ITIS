public class Monkey {

    protected int intellect; // from 1 to 5
    protected String habitat;
    protected int age;
    protected int intAge;
    protected int iq;
    protected String prof;
    protected String tools;


    protected void setIntellect(int newIntellect) {
        this.intellect = newIntellect;
    }

    protected void setHabitat(String newHabitat) {
        this.habitat = newHabitat;
    }

    protected void setAge(int newAge) {
        this.age = newAge;
    }

    protected void setIntAge(int newIntAge) {
        this.intAge = newIntAge;
    }


    protected int getIntellect() {
        return intellect;
    }

    protected int getAge() {
        return age;
    }

    protected int getIntAge() {
        return intAge;
    }

    protected String getHabitat() {
        return habitat;
    }

    protected int getIQ() {
        iq = (((intAge/age) * 100) + intellect);
        return iq;
    }

    protected String getInfoProf() {
        if (iq > 100) {
            prof = "Can be the leader of the pack";
        }
        else if (iq < 100){
            prof = "Can't be the leader of the pack";
        }
        return prof;
    }

    protected String getInfoTools() {
        if (intellect > 3) {
            tools = "Can make primitive tools";
        }
        else if (intellect <= 3) {
            tools = "Can't make primitive tools";
        }
        return tools;
    }



}
