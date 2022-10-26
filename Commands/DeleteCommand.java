package Commands;

import Patterns.Command;
import Patterns.Shape;
import Patterns.shapeStrategy;

public class DeleteCommand implements Command {
    private Shape crsh;
    //private String typeOfShape;
    private shapeStrategy shapeStrat;
    private SelectCommand secom;

    public DeleteCommand(Shape crsh){
        this.crsh = crsh;
        if(secom.index!=-1){
            String str = shapeStrat.shapesList.get(secom.index);
            String index = String.valueOf(secom.index);
            str = str +" "+index;
            shapeStrat.deletedShapes.add(str);
            shapeStrat.shapesList.remove(secom.index);
        }
        else {
            System.out.println("ERROR: no shape selected to delete");
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
