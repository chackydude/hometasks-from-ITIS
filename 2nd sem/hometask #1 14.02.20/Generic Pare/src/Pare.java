// Generic class 12.02.20
public class Pare <T0, T1> {
    private final T0 obj0;
    private final T1 obj1;
    // constructor
    public Pare(T0 obj0, T1 obj1) {
        this.obj0 = obj0;
        this.obj1 = obj1;
    }

    public T0 getValue0() {
        return obj0;
    }

    public T1 getValue1() {
        return obj1;
    }

    public Class getType0() {
        return this.obj0.getClass();
    }

    public Class getType1() {
        return this.obj1.getClass();
    }
}

