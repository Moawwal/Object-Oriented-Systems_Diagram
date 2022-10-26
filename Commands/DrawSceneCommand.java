package Commands;

import Patterns.Command;
import Patterns.Shape;
import Patterns.shapeStrategy;

public class DrawSceneCommand implements Command {
    private Shape crsh;
    //private String typeOfShape;
    private shapeStrategy shapeStrat;

    public DrawSceneCommand(Shape crsh){
        this.crsh = crsh;
        for(int i=0;i<shapeStrat.shapesList.size();i++){
            String str = shapeStrat.shapesList.get(i);
            System.out.println(str);
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
