public  class Integrate {

    public static float calculateIntRectangle(float a, float b, int n, FunctionAware function) {
        float sum = 0;
        float dx = (b - a) / n;

        for (float i = a; i < b; i += dx) {
            sum += function.func(i);
        }

        sum *= dx;
        return sum;
    }

    public static float calculateIntTrapeze(float a, float b, int n, FunctionAware function){
        float sum = 0;
        float dx = (b-a) / n;

        for(float i = a; i < b; i += dx){
            sum += (function.func(i) + function.func(i+dx)) / 2;
        }

        sum *= dx;
        return sum;
    }

    public static float calculateIntSimpson(float a, float b, int n, FunctionAware function){
        float sum = 0;
        float dx = (b-a) / (2 * n);
        float s1 = 0;
        float s2 = 0;

        for (float i = a + 2 * dx; i < b; i += 2 * dx) {
            s1 += function.func(i);
        }
        for (float i = a + dx; i < b; i += 2 * dx) {
            s2 += function.func(i);
        }
        sum += function.func(a) + 2 * s1 + 4 * s2 + function.func(b);
        sum *= (dx / 3);
        return sum;
    }

    public static float fault(float a, float b, int n, FunctionAware function){
        float dx = (b - a) / n;
        float e = ((float) Math.pow((b-a), 5) * (float) Math.pow(function.func(dx),4)) / 2880;
        return e;
    }

}
