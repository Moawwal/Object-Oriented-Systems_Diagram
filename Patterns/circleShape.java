package Patterns;
import Memento.originator;

public class circleShape implements shapeStrategy{
    originator origin;
    private String typeOfShape;
    private String colorOfShape;
    private String originOfShape1;
    private String originOfShape2;
    private String sizeOfShape1;

    private String sizeOfShape2;

    public void setTypeOfShape(String typeOfShape) {
        this.typeOfShape = typeOfShape;
    }

    public void setColorOfShape(String colorOfShape) {
        this.colorOfShape = colorOfShape;
    }

    public void setOriginOfShape1(String originOfShape1) {
        this.originOfShape1 = originOfShape1;
    }

    public void setOriginOfShape2(String originOfShape2) {
        this.originOfShape2 = originOfShape2;
    }

    public void setSizeOfShape1(String sizeOfShape1) {
        this.sizeOfShape1 = sizeOfShape1;
    }

    public void setSizeOfShape2(String sizeOfShape2) {
        this.sizeOfShape2 = sizeOfShape2;
    }
    public String printShape(){
        String str = typeOfShape+", Color: "+colorOfShape+", Origin: ("+originOfShape1+","+originOfShape2+"), "+"Radius: "+sizeOfShape1;
        return str;
    }
}
