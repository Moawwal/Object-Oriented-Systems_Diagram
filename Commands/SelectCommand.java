package Commands;

import Patterns.Command;
import Patterns.Shape;
import Patterns.shapeStrategy;

public class SelectCommand implements Command {
    private Shape crsh;
    private shapeStrategy shapeStrat;

    public SelectCommand(Shape crsh, String[] shapeargs, int index,int previndex){
        this.crsh = crsh;
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
