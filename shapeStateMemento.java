package Patterns;

public static class shapeStateMemento {
    private final String string;
    private final Editor editor;


    public shapeStateMemento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    private String getSaveText() { //Getter only accessible by outer class or string class
        return sring;
    }

    //The momento should have the attributes as the text area

    //public void restore() {
        //editor.restore(backup);
    //}
}
