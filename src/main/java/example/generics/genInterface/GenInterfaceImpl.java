package example.generics.genInterface;

public class GenInterfaceImpl<T extends Number> implements GenInterface <T>{
    @Override
    public double square(T t) {
        return t.doubleValue() * t.doubleValue();
    }

    @Override
    public double percent(T t, T percentNumber) {
        return percentNumber.doubleValue() / 100 * t.doubleValue();
    }
}
