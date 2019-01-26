package main.advanced.enheritance;

import org.junit.jupiter.api.Test;

public class Tester {

    @Test
    public void test(){

    }

    public static void main ( String[] args ) {

        Vehicle plane = new Vehicle ("plane",
                50,
                "white",
                300);
        //System.out.println(plane.toString());
        System.out.println (plane);
        plane.info ();

        Car car = new Car (
                "Audi",
                5,
                "red",
                200);
        System.out.println (car);
        //Object <- Vehicle <- Car
        car.info ();
        //public
        car.color = "black";
        //protected
        car.seatCapacity =4;
        //default (package)
        car.maxSpeed = 300;
        //private + setter
        car.setName ( "BMW" );

        System.out.println (car);


        System.out.println(car.getMessage ());

        //polymorphism
        //Object <- Vehicle <- Car
        Object porsche = new Car (
                "Porsche",
                2,
                "orange",
                300);

        ((Vehicle) porsche).info ();
        ((Car) porsche).info ("sport");
        System.out.println (( (Car) porsche ).getMessage () );
        System.out.println (porsche );

        System.out.println (
                "porsche is Object: " +
                        (porsche instanceof  Object));

        System.out.println (
                "porsche is Vehicle: " +
                        (porsche instanceof  Vehicle));

        System.out.println (
                "porsche is Car: " +
                        (porsche instanceof  Car));
    }
    @Test
    public void interface_test(){

        //polymorphism
        //Object <- Vehicle <- Car
        Car porsche = new Car (
                "Porsche",
                2,
                "orange",
                300);

        Drivable.start ();
        porsche.drive ( 50.5f );
        porsche.stop ();
        porsche.clean ( "Premium" );

    }

}
