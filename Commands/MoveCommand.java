package Commands;

import Patterns.*;

public class MoveCommand implements Command {
    private Shape crsh;
    //private String typeOfShape;
    private shapeStrategy shapeStrat;
    private SelectCommand secom;
    private rectangleShape rectangle;
    private circleShape circle;

    public MoveCommand(Shape crsh,String[] shapeargs){
        this.crsh = crsh;
        if (secom.index!=-1){
            String str = shapeStrat.shapesList.get(secom.index);
            String strsplit[]=str.split(" ");
            String color=strsplit[2].replace(",","");
            String size1=strsplit[6].replace(",","");
            if (strsplit[0]=="Rectangle,") {
                String size2=strsplit[8];
                rectangle.setTypeOfShape("Rectangle");
                rectangle.setColorOfShape(color);
                rectangle.setOriginOfShape1(shapeargs[1]);
                rectangle.setOriginOfShape2(shapeargs[2]);
                rectangle.setSizeOfShape1(size1);
                rectangle.setSizeOfShape2(size2);
                shapeStrat.shapesList.remove(secom.index);
                shapeStrat.shapesList.add(secom.index,rectangle.printShape());
                shapeStrat.prevShapes.add(rectangle.printShape());
            }
            else{
                circle.setTypeOfShape("Rectangle");
                circle.setColorOfShape(color);
                circle.setOriginOfShape1(shapeargs[1]);
                circle.setOriginOfShape2(shapeargs[2]);
                circle.setSizeOfShape1(size1);
                shapeStrat.shapesList.remove(secom.index);
                shapeStrat.shapesList.add(secom.index,circle.printShape());
                shapeStrat.prevShapes.add(circle.printShape());
            }
        }
        else {
            System.out.println("ERROR: No shape selected for move");
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
