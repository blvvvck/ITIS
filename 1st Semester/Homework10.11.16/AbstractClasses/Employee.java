class Employee extends Person{
    private String bank;

    public Employee(String name, String surname, String bank){

        super(name, surname);
        this.bank = bank;

    }

    @Override
    public void Info(){
        System.out.println("Name: " + getName() + "\n" + "Surname: " + getSurname() + "\n" + "Works in: " +
                this.bank + " " + "bank");
        System.out.println("---------------------------");
	}

}