package Commands;

import Patterns.Command;
import Patterns.Shape;
import Patterns.shapeStrategy;

public class DrawCommand implements Command {
    private Shape crsh;
    //private String typeOfShape;
    private SelectCommand secom;
    private shapeStrategy shapeStrat;

    public DrawCommand(Shape crsh){
        this.crsh = crsh;
        if (secom.index!=-1){
            String str = shapeStrat.shapesList.get(secom.index);
            System.out.println(str);
        }
        else{
            System.out.println("ERROR: No shape selected for draw");
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
