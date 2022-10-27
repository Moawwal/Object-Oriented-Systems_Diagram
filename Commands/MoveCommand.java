package Commands;

import Patterns.*;

public class MoveCommand implements Command {
    private Shape crsh;
    //private String typeOfShape;
    private shapeStrategy shapeStrat;
    private SelectCommand secom;
    private rectangleShape rectangle;
    private circleShape circle;

    public MoveCommand(Shape crsh,String[] shapeargs,int index){
        this.crsh = crsh;
        rectangle = new rectangleShape();
        circle = new circleShape();
        //secom = new SelectCommand();
        //System.out.println("In Move");
        //System.out.println(index);

        if (index!=-1 && (index <= shapeStrat.shapesList.size()-1)){
            String str = shapeStrat.shapesList.get(index);

            String strsplit[]=str.split(" ");
            //System.out.println(strsplit[4]);
            String color=strsplit[2].replace(",","");
            //String size1=strsplit[4].replace(",","");
            //System.out.println(strsplit[0]);
            if (strsplit[0].equals("Rectangle,")) {
                String size1=strsplit[6].replace(",","");
                String size2=strsplit[8];
                rectangle.setTypeOfShape("Rectangle");
                rectangle.setColorOfShape(color);
                rectangle.setOriginOfShape1(shapeargs[1]);
                rectangle.setOriginOfShape2(shapeargs[2]);
                rectangle.setSizeOfShape1(size1);
                rectangle.setSizeOfShape2(size2);
                shapeStrat.shapesList.remove(index);
                shapeStrat.shapesList.add(index,rectangle.printShape());
                shapeStrat.prevShapes.add(rectangle.printShape());
            }
            else{
                String size1=strsplit[6];
                //System.out.println(size1);
                circle.setTypeOfShape("Circle");
                circle.setColorOfShape(color);
                circle.setOriginOfShape1(shapeargs[1]);
                circle.setOriginOfShape2(shapeargs[2]);
                circle.setSizeOfShape1(size1);
                shapeStrat.shapesList.remove(index);
                shapeStrat.shapesList.add(index,circle.printShape());
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
