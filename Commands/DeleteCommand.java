package Commands;

import Patterns.Command;
import Patterns.Shape;
import Patterns.shapeStrategy;

public class DeleteCommand implements Command {
    private Shape crsh;
    private shapeStrategy shapeStrat;

    public DeleteCommand(Shape crsh,int index){
        this.crsh = crsh;
        if(index!=-1 && (index <= shapeStrat.shapesList.size()-1)){
            String str = shapeStrat.shapesList.get(index);
            //System.out.println("index: "+index +str);
            String index1 = String.valueOf(index);
            str = str +" "+index1;
            shapeStrat.deletedShapes.add(str);
            shapeStrat.shapesList.remove(index);
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
