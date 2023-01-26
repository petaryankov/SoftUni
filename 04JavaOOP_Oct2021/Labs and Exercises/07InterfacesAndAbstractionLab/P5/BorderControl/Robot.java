package day7.InterfacesAndAbstractionLab.P5.BorderControl;

public class Robot implements Identifiable {
    private String id;
    private String model;

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }
}
