package models;
import enums.ROOFTYPE;
import enums.TYPE;

public class Convertible extends Car {
    private Roof type;
    private Integer noOfDoors;
    private ROOFTYPE rooftype;

    public Convertible(int i, String josh, TYPE tesla, int i1, Roof openRoof, int i2) {
    }

    public Convertible(Roof type, Integer noOfDoors, ROOFTYPE rooftype) {
        this.type = type;
        this.noOfDoors = noOfDoors;
        this.rooftype = rooftype;
    }

    public Convertible(Integer id, String name, TYPE typeOfCar, Integer modelYear, Roof type, Integer noOfDoors, ROOFTYPE rooftype) {
        super(id, name, typeOfCar, modelYear);
        this.type = type;
        this.noOfDoors = noOfDoors;
        this.rooftype = rooftype;
    }

    public Roof getType() {
        return type;
    }

    public void setType(Roof type) {
        this.type = type;
    }

    public Integer getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(Integer noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public ROOFTYPE getRooftype() {
        return rooftype;
    }

    public void setRooftype(ROOFTYPE rooftype) {
        this.rooftype = rooftype;
    }

    @Override
    public String toString() {
        return "Convertible{" +
                "type=" + type +
                ", noOfDoors=" + noOfDoors +
                ", rooftype=" + rooftype +
                '}';
    }

    public Convertible(Integer id, String name, TYPE typeOfCar, Integer modelYear) {
        super(id, name, typeOfCar, modelYear);
    }
}
