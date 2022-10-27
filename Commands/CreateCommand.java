package Commands;

import Patterns.*;

public  class CreateCommand implements Command{
    private Shape crsh = new Shape();
    private rectangleShape rectangle;
    private circleShape circle;
    //private String typeOfShape;
    private shapeStrategy shapeStrat;

    public CreateCommand(Shape crsh, String[] typeOfShape){
        this.crsh = crsh;
        System.out.println(typeOfShape[1]);
        rectangle = new rectangleShape();
        circle = new circleShape();
        if (typeOfShape[1].equals("RECTANGLE")){
            System.out.println("inside ");

            rectangle.setTypeOfShape("Rectangle");
            rectangle.setOriginOfShape1("0");
            rectangle.setOriginOfShape2("0");
            rectangle.setColorOfShape("Red");
            rectangle.setSizeOfShape1(typeOfShape[2]);
            rectangle.setSizeOfShape2(typeOfShape[3]);
            shapeStrat.shapesList.add(rectangle.printShape());
            shapeStrat.prevShapes.add(rectangle.printShape());

        }
        else if (typeOfShape[1].equals("CIRCLE")){
            System.out.println("in circle");
            circle.setTypeOfShape("Circle");
            circle.setOriginOfShape1("0");
            circle.setOriginOfShape2("0");
            circle.setColorOfShape("Blue");
            circle.setSizeOfShape1(typeOfShape[2]);
            shapeStrat.shapesList.add(circle.printShape());
            shapeStrat.prevShapes.add(circle.printShape());
        }
        else{
            System.out.println("ERROR: invalid shape entered");
        }

    }

    @Override
    public void execute(){
        crsh.executeCommand();
    }

    @Override
    public void undo() {

    }
}
