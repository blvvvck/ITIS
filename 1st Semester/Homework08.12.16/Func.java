public class Func implements FunctionAware {

    @Override
    public float func(float x) {
        return x * (float) Math.sin(x);
    }
}
