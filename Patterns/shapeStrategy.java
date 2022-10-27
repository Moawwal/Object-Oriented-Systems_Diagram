package Patterns;

import java.util.*;

public interface shapeStrategy {
     ArrayList<String> shapesList = new ArrayList<String>();
     ArrayList<String> deletedShapes = new ArrayList<String>();
     ArrayList<String> prevShapes = new ArrayList<String>();

     void setTypeOfShape(String type);
     void setColorOfShape(String color);
    void setOriginOfShape1(String origin1);
    void setOriginOfShape2(String origin2);
    void setSizeOfShape1(String size1);
    void setSizeOfShape2(String size2);

    String printShape();

}
