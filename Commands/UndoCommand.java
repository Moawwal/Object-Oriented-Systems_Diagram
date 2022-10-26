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

    public UndoCommand(Shape crsh, LinkedList<String> commandList){
        this.crsh = crsh;
        String str = commandList.pop();
        String strsplit[]= str.split(" ");

        switch (strsplit[0]){
            case "CREATE":
                DeleteCommand de = new DeleteCommand(crsh);
                de.execute();
                break;
            case "SELECT":
                se.index= se.previndex;
                break;
            case "MOVE":
                String movestr = shapeStrat.shapesList.get(se.index);
                String prevmovestr = shapeStrat.prevShapes.get(shapeStrat.prevShapes.size()-1);
                shapeStrat.shapesList.remove(se.index);
                shapeStrat.shapesList.add(se.index, prevmovestr);
                break;
            case "DRAW":
                break;
            case "COLOR":
                String colorstr = shapeStrat.shapesList.get(se.index);
                String prevcolorstr = shapeStrat.prevShapes.get(shapeStrat.prevShapes.size()-1);
                shapeStrat.shapesList.remove(se.index);
                shapeStrat.shapesList.add(se.index, prevcolorstr);
                break;
            case "DELETE":
                String deletestr = shapeStrat.deletedShapes.get(shapeStrat.deletedShapes.size()-1);
                String [] deletestrsplit = deletestr.split(" ");
                int index = Integer.parseInt(deletestrsplit[deletestrsplit.length-1]);
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
