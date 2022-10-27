package Patterns;

public class Shape {
    Command command;
    public Shape(){

    }

    public void setCommand(Command command){
        this.command = command;
    }
    public void executeCommand(){
        command.execute();
    }
    public void undoCommand(){
        command.undo();
    }
}
