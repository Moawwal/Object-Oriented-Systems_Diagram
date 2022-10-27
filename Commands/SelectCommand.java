package Commands;

import Patterns.Command;
import Patterns.Shape;
import Patterns.shapeStrategy;

public class SelectCommand implements Command {
    private Shape crsh;
    //private String typeOfShape;
    private shapeStrategy shapeStrat;
    //int index=-1;
    //int previndex=-1;

    public SelectCommand(Shape crsh, String[] shapeargs, int index,int previndex){
        this.crsh = crsh;
        //System.out.println("In select");
        int i= Integer.parseInt(shapeargs[1]);
        previndex=index;
        if (i>shapeStrat.shapesList.size()+1){
            System.out.println("ERROR: invalid shape for SELECT");
        }
        else{
            index =i;
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
