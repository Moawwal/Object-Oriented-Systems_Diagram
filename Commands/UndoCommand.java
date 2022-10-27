package Commands;

import Patterns.Command;
import Patterns.Shape;
import Patterns.shapeStrategy;
import Memento.*;

import java.util.*;

public class UndoCommand implements Command {
    private Shape crsh;
    private String typeOfShape;
    private SelectCommand se;
    private shapeStrategy shapeStrat;
    private originator orig;

    public UndoCommand(Shape crsh, LinkedList<String> commandList,int index,int prevIndex){
        this.crsh = crsh;
        orig = new originator();

        orig.undo(index);
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
