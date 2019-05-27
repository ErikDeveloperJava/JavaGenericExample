package example.generics.genInterface;

public interface GenInterface<T extends Number> {

    double square(T t);

    double percent(T t,T percentNumber);
}
