package models;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String brand;
    private String type;
    private String fuelType;
    private String color;
}
