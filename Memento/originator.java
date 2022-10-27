package Memento;

import java.util.Deque;
import java.util.LinkedList;

public class originator {
    private final caretaker ct;
    private final Deque<caretaker.memento> commandhistory;

    public originator() {
        ct = new caretaker();
        commandhistory = new LinkedList<>();
    }
    public void write(String commandtext){
        ct.set(commandtext);
        commandhistory.offer(ct.takeSnapshot());
    }
    public void undo(){
        if (commandhistory.isEmpty()){
            return;
        }
        commandhistory.pollLast();
        ct.restore(commandhistory.peekLast());
    }


}
