package Commands;

import Patterns.Command;
import Patterns.Shape;
import Patterns.shapeStrategy;

public class DeleteCommand implements Command {
    private Shape crsh;
    //private String typeOfShape;
    private shapeStrategy shapeStrat;
    //private SelectCommand secom;

    public DeleteCommand(Shape crsh,int index){
        this.crsh = crsh;
        //System.out.println("IN delete");
        //System.out.println(index);
        if(index!=-1 && (index <= shapeStrat.shapesList.size()-1)){
            String str = shapeStrat.shapesList.get(index);
            //System.out.println(str);
            String index1 = String.valueOf(index);
            //System.out.println("index1");
            str = str +" "+index1;
            //System.out.println("str");
            shapeStrat.deletedShapes.add(str);
            //System.out.println("add to delete list");
            shapeStrat.shapesList.remove(index);
            //System.out.println("remove from list");
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
