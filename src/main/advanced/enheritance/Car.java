package main.advanced.enheritance;

public class Car extends Vehicle
        implements Drivable, Cleaneble {

    public Car ( String name , int seatCapacity , String color , float maxSpeed ) {
        super ( name , seatCapacity , color , maxSpeed );
    }

    @Override
    public void info(){
        System.out.println ("This is a vehicle." );
    }

    public void info(String carType){
        System.out.println ("This is a " + carType + "char");
    }

    @Override
    public String toString () {
        return String.join ( "|",
                "CAR",
                getName (),
                seatCapacity + "seats",
                color,
                maxSpeed + "km/h");
    }

      String getMessage(){
        return "Message from Car";
    }


    @Override
    public void drive ( float distanceInKm ) {
        System.out.println ("drove" + distanceInKm + "km");

    }


    @Override
    public void clean ( String cleanType ) {
        System.out.println ("cleaned :" + cleanType );

    }
}
