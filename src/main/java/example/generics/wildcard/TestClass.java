package example.generics.wildcard;

import example.generics.wildcard.model.Car;
import example.generics.wildcard.model.CarVersion1;
import example.generics.wildcard.model.CarVersion2;

public class TestClass {

    public static void main(String[] args) {
        CarUtil<Car> carUtil = new CarUtil<>(Car
                .builder()
                .maxSpeed(12)
                .weight(43)
                .build());
        CarUtil<CarVersion1> carVersion1Util = new CarUtil<>(new CarVersion1(200,1000,"Blue",12));
        CarUtil<CarVersion2> carVersion2Util = new CarUtil<>(new
                CarVersion2(200,1000,"Blue",12,"recordPlayer","wifi"));

        // CarUtil<? extends Car> works for all these objects
        getCarWeightByExtend(carUtil);
        getCarWeightByExtend(carVersion1Util);
        getCarWeightByExtend(carVersion2Util);

        // CarUtil<? super Car> works for two version CarUtil<Car> and CarUtil<CarVersion1> object
        getCarWeightBySuper(carUtil);
        getCarWeightBySuper(new CarUtil<>(new CarVersion1(1,2,"12",1)));
        // getCarWeightBySuper(carVersion1Util);
        // getCarWeightBySuper(carVersion2Util);
    }

    private static int getCarWeightByExtend(CarUtil<? extends Car> carUtil){
        return carUtil.getCar().getWeight();
    }

    private static int getCarWeightBySuper(CarUtil<? super Car> carUtil){
        return carUtil.getCar().getWeight();
    }
}
