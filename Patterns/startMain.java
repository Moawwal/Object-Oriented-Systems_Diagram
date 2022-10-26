package Patterns;
import Commands.*;

import java.io.*;
import java.util.*;
public class startMain {

    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);

        String inputLine = br.readLine();
        String splitLineArr[];

        Shape shape = new Shape();

        //LinkedList<String> shapeList = new LinkedList<>();
        LinkedList<String> commandList = new LinkedList<String>();
        shapeStrategy shateStrat;
        int index =-1;

        while (inputLine != null) {
            splitLineArr= inputLine.split(" ");
            LinkedList<String> shapesList = new LinkedList<String>();
            switch(splitLineArr[0]) {
                case "CREATE":
                    //Shape shape = new Shape();
                    CreateCommand cr = new CreateCommand(shape,splitLineArr);
                    cr.execute();
                    System.out.println("Create");
                    break;
                case "SELECT":
                    SelectCommand se = new SelectCommand(shape,splitLineArr);
                    se.execute();
                    System.out.println("select");
                    break;
                case "MOVE":
                    MoveCommand mo = new MoveCommand(shape,splitLineArr);
                    mo.execute();
                    System.out.println("miove");
                    break;
                case "DRAW":
                    DrawCommand draw = new DrawCommand(shape);
                    draw.execute();
                    System.out.println("draw");
                    break;
                case "COLOR":
                    ColorCommand co = new ColorCommand(shape,splitLineArr);
                    co.execute();
                    System.out.println("Color");
                    break;
                case "DELETE":
                    DeleteCommand de = new DeleteCommand(shape);
                    de.execute();
                    System.out.println("delete");
                    break;
                case "DRAWSCENE":
                    DrawSceneCommand drsc = new DrawSceneCommand(shape);
                    drsc.execute();
                    System.out.println("drsc");
                    break;
                case "UNDO":
                    UndoCommand undo = new UndoCommand(shape, commandList);
                    undo.undo();
                    System.out.println("undo");
                    break;
                default:
                    System.out.println("Invalid Command");
                    break;
            }
            if (splitLineArr[0]!="UNDO")
                commandList.add(inputLine);
            inputLine = br.readLine();
        }
        br.close();
    }
}
