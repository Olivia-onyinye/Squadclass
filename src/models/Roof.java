package models;

import enums.ROOFTYPE;

public class Roof {
    private ROOFTYPE rooftype;
    private Integer id;

    public Roof() {
    }

    public ROOFTYPE getRooftype() {
        return rooftype;
    }

    public void setRooftype(ROOFTYPE rooftype) {
        this.rooftype = rooftype;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Roof{" +
                "rooftype=" + rooftype +
                ", id=" + id +
                '}';
    }

    public Roof(ROOFTYPE rooftype, Integer id) {
        this.rooftype = rooftype;
        this.id = id;
    }
}
