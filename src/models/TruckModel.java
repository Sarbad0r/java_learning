package models;

public class TruckModel extends TransportModel {

    public TruckModel(float speed, float weight, String color, byte[] coordinate) {
        //instead of writing
        // this.speed = speed;
        // like adding value to extended class
        // we write just super
        // super - will connect to the "father" class
        // and write need fields
        super(speed, weight, color, coordinate);
    }

}
