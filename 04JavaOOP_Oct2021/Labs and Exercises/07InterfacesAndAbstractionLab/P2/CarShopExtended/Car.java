package day7.InterfacesAndAbstractionLab.P2.CarShopExtended;

import java.io.Serializable;

public interface Car extends Serializable {
    int TIRES = 4;

    String getModel();

    String getColor();

    Integer getHorsePower();

    String countryProduced();

}
