public class NotebookViewer {

    public static void main(String[] args) throws CloneNotSupportedException {

        Notebook n1 = new Notebook("GTX760", "Intel i5 4440", "8GB", 30000, 5 , 13);


        System.out.println(n1);


        Notebook n2 = n1.clone();
        System.out.println(n2);
        System.out.println("Hash code: " + n1.hashCode());
        System.out.println("Hardware equality: " + n1.equals(n2));


    }



}
