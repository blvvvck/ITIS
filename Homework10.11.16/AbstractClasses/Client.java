public class Client extends Person {
    private String bank;

    public  Client (String name, String surname, String company) {

        super(name, surname);
        this.bank = company;
    }

    @Override
    public void Info(){
        System.out.println("Name: " + getName() + "\n" + "Surname: " + getSurname() + "\n" + "Client of the: " +
                this.bank + " " + "bank");
        System.out.println("---------------------------");
    }
}