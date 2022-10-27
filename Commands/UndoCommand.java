package Commands;

import Patterns.Command;
import Patterns.Shape;
import Patterns.shapeStrategy;

import java.util.*;

public class UndoCommand implements Command {
    private Shape crsh;
    private String typeOfShape;
    private SelectCommand se;
    private shapeStrategy shapeStrat;

    public UndoCommand(Shape crsh, LinkedList<String> commandList,int index,int prevIndex){
        this.crsh = crsh;
        String str = commandList.pop();
        String strsplit[]= str.split(" ");
        System.out.println("IN undo");
        switch (strsplit[0]){
            case "CREATE":
                DeleteCommand de = new DeleteCommand(crsh,index);
                //de.execute();
                break;
            case "SELECT":
                index= prevIndex;
                break;
            case "MOVE":
                String movestr = shapeStrat.shapesList.get(index);
                String prevmovestr = shapeStrat.prevShapes.get(shapeStrat.prevShapes.size()-1);
                shapeStrat.shapesList.remove(index);
                shapeStrat.shapesList.add(index, prevmovestr);
                break;
            case "DRAW":
                break;
            case "COLOR":
                String colorstr = shapeStrat.shapesList.get(index);
                String prevcolorstr = shapeStrat.prevShapes.get(shapeStrat.prevShapes.size()-1);
                shapeStrat.shapesList.remove(index);
                shapeStrat.shapesList.add(index, prevcolorstr);
                break;
            case "DELETE":
                String deletestr = shapeStrat.deletedShapes.get(shapeStrat.deletedShapes.size()-1);
                String [] deletestrsplit = deletestr.split(" ");
                int indexfordelete = Integer.parseInt(deletestrsplit[deletestrsplit.length-1]);
                ArrayList<String> newdelete = new ArrayList<String>();
                for (int i=0;i<deletestrsplit.length-2;i++){
                    newdelete.add(deletestrsplit[i]);
                }

                String deletefinalstr=String.join(",", newdelete);
                shapeStrat.shapesList.add(deletefinalstr);
                break;
            case "DRAWSCENE":
                break;
            default:
                System.out.println("ERROR in undo");

        }
    }

    @Override
    public void execute(){
        crsh.executeCommand();
    }

    @Override
    public void undo() {
        crsh.undoCommand();
    }
}
