package example.generics.wildcard;

import example.generics.wildcard.model.Car;
import lombok.Getter;

public class CarUtil<T extends Car> {

    @Getter
    private T car;

    public CarUtil(T car) {
        this.car = car;
    }
}