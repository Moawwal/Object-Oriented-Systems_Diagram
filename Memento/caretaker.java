package Memento;

public class caretaker {
    private String commandtext;

    public void set(String commandtext){
        this.commandtext=commandtext;
    }
    public String getCommandtext(){
        return commandtext;
    }

    public memento takeSnapshot(){
        return new memento(this.commandtext);
    }
    public void restore(memento mem){
        this.commandtext = mem != null ? mem.getSavedText() : null;
    }

    public static class memento{
        private final String text;

        private memento(String textToSave){
            text= textToSave;
        }
        public String getSavedText(){
            return text;
        }
    }
}
