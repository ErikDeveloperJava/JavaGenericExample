package example.generics.wildcard.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class CarVersion2 extends CarVersion1{

    private String recordPlayer;

    private String wifi;


    public CarVersion2(int maxSpeed, int weight, String color, int fireWoodCount,String recordPlayer,String wifi) {
        super(maxSpeed, weight, color, fireWoodCount);
        this.recordPlayer = recordPlayer;
        this.wifi = wifi;
    }
}