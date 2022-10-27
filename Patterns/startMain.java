package Patterns;
import Commands.*;

import java.io.*;
import java.util.*;
import Memento.*;

public class startMain {

    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);

        String inputLine = br.readLine();
        String splitLineArr[];

        Shape shape = new Shape();
        originator origin = new originator();
        LinkedList<String> commandList = new LinkedList<String>();
        int index =-1;
        int prevIndex=index;

        while (inputLine != null) {
            splitLineArr= inputLine.split(" ");
            LinkedList<String> shapesList = new LinkedList<String>();
            switch(splitLineArr[0]) {
                case "CREATE":
                    CreateCommand cr = new CreateCommand(shape,splitLineArr);
                    break;
                case "SELECT":
                    SelectCommand se = new SelectCommand(shape,splitLineArr,index,prevIndex);
                    prevIndex=index;
                    index= Integer.parseInt(splitLineArr[1])-1;
                    break;
                case "MOVE":
                    MoveCommand mo = new MoveCommand(shape,splitLineArr,index);
                    break;
                case "DRAW":
                    DrawCommand draw = new DrawCommand(shape,index);
                    break;
                case "COLOR":
                    ColorCommand co = new ColorCommand(shape,splitLineArr,index);
                    break;
                case "DELETE":
                    DeleteCommand de = new DeleteCommand(shape,index);
                    index=prevIndex;
                    break;
                case "DRAWSCENE":
                    DrawSceneCommand drsc = new DrawSceneCommand(shape);
                    break;
                case "UNDO":
                    UndoCommand undo = new UndoCommand(shape, commandList,index,prevIndex);
                    break;
                default:
                    System.out.println("Invalid Command");
                    break;
            }
            origin.write(inputLine);
            if (splitLineArr[0]!="UNDO")
                commandList.add(inputLine);
            inputLine = br.readLine();
        }
        br.close();
    }
}
