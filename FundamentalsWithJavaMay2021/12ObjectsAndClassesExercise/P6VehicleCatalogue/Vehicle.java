package day12ObjectsAndClassesExercise.P6VehicleCatalogue;

public class Vehicle {
    //Type: {typeOfVehicle}
    //Model: {modelOfVehicle}
    //Color: {colorOfVehicle}
    //Horsepower: {horsepowerOfVehicle}
    private String typeOfVehicle;
    private String modelOfVehicle;
    private String colorOfVehicle;
    private int horsepowerOfVehicle;

    public Vehicle(String typeOfVehicle, String modelOfVehicle
            , String colorOfVehicle, int horsepowerOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
        this.modelOfVehicle = modelOfVehicle;
        this.colorOfVehicle = colorOfVehicle;
        this.horsepowerOfVehicle = horsepowerOfVehicle;
    }

    public String getModelOfVehicle() {

        return modelOfVehicle;
    }

    public String getTypeOfVehicle() {

        return typeOfVehicle;
    }

    public String getColorOfVehicle() {

        return colorOfVehicle;
    }

    public int getHorsepowerOfVehicle() {

        return horsepowerOfVehicle;
    }

    public void setHorsepowerOfVehicle(int horsepowerOfVehicle) {
        this.horsepowerOfVehicle = horsepowerOfVehicle;
    }
}
