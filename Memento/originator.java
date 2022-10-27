package Memento;

import Commands.UndoCommand;
import Patterns.shapeStrategy;

import java.util.Deque;
import java.util.LinkedList;

public class originator {
    private final caretaker ct;

    public LinkedList<String> sizeshapesList;
    private final Deque<caretaker.memento> commandhistory;
    shapeStrategy shapeStrat;

    public originator() {

        ct = new caretaker();
        commandhistory = new LinkedList<>();
    }

    public void undo(int index){

        if (index>shapeStrat.shapesList.size()){
            System.out.println("ERROR: invalid shape for SELECT");
        }
        else {

            shapeStrat.shapesList.remove(index);
            shapeStrat.shapesList.add(index, shapeStrat.prevShapes.remove(shapeStrat.prevShapes.size() - 1));
        }

    }
    public void printText(){
        System.out.println(ct.getCommandtext());
    }


}
