public class Main {
    public static void main(String[] args) {
        final int n1 = 10;
        final int n2 = 100;
        final int n3 = 1000;

        FunctionAware function = new Func();

        System.out.println(" N = 10");
        System.out.println("Rectangle method " + Integrate.calculateIntRectangle(0 , 10, n1 , function));
        System.out.println("Trapeze method " + Integrate.calculateIntTrapeze(0 , 10, n1 , function));
        System.out.println("Simpson method " +Integrate.calculateIntSimpson(0 , 10, n1 , function) );
        System.out.println("Mathematical fault " + Integrate.fault(0, 10, n1, function));
        System.out.println();

        System.out.println(" N = 100");
        System.out.println("Rectangle method " + Integrate.calculateIntRectangle(0 , 10, n2 , function));
        System.out.println("Trapeze method " + Integrate.calculateIntTrapeze(0 , 10, n2 , function));
        System.out.println("Simpson method " +Integrate.calculateIntSimpson(0 , 10, n2 , function) );
        System.out.println("Mathematical fault " + Integrate.fault(0, 10, n2, function));

        System.out.println();

        System.out.println(" N = 1000");
        System.out.println("Rectangle method " + Integrate.calculateIntRectangle(0 , 10, n3 , function));
        System.out.println("Trapeze method " + Integrate.calculateIntTrapeze(0 , 10, n3 , function));
        System.out.println("Simpson method " +Integrate.calculateIntSimpson(0 , 10, n3 , function) );
        System.out.println("Mathematical fault " + Integrate.fault(0, 10, n3, function));


    }
}
