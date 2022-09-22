package models;

import enums.ROOFTYPE;
import enums.TYPE;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

Car benz = new Car(14223, "Marcel okey", TYPE.BENZ,  2022);
Car honda = new Car(14062, "OLIVIA", TYPE.HONDA, 2014);
Car benz2 = new Car();
Integer n = 1;
for (int i =0; i<10; i++){
//    Car benz = new Car()
}
//        System.out.println(benz2);
//        System.out.println(benz.getModelYear());
//                //to call out an emum
//                //System.out.println(TYPE.HONDA);
//   L
//   List<Car> myCars = new ArrayList<>(); //list was instantiated here as an Array list
//   myCars.add(benz);
//   myCars.add(honda);
        List<Convertible> numConv = new ArrayList<>();
        List<Car> numCar = new ArrayList<>();
        Roof openRoof = new Roof (ROOFTYPE.CLOSE, 1);
        Convertible set1 = new Convertible(2, "Josh", TYPE.TESLA,  2012, openRoof, 4 );
        numConv.add(set1);
        numCar.add(set1);
    }
}
