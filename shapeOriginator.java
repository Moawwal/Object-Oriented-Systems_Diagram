package Patterns;

public class shapeOriginator {
    public commandInvoker save() {
        return new commandInvocker();//Arrayselectected());
    }
    public void restore(shapeOriginator save) {
        //Current value Array = new StringBuilder(save.getText());
    }
}