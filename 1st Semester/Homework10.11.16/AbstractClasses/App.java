public class App {
    public static void main(String[] args) {
        Client c = new Client("Алексей", " Петров" , "Сбербанк");
        c.Info();

        Employee e = new Employee("Иван", "Сидоров", "ВТБ");
        e.Info();
    }
}