package Patterns;
import java.io.*;
import java.util.*;

public class startMain {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader(args[0]);
		BufferedReader br = new BufferedReader(fr);
		
		String inputLine = br.readLine();
		String splitLineArr[];
		LinkedList<String> shapesList = new LinkedList<String>();
		
		while (inputLine != null) {
			splitLineArr= inputLine.split(" ");
			switch(splitLineArr[0]) {
				case "CREATE":
					commandInvoker cr = new commandInvoker(new createOperation());
					cr.executeCreateStrategyInterface(shapesList, splitLineArr);
					
					break;
				case "SELECT":
					commandInvoker se = new commandInvoker(new createOperation());
					se.executeSelectStrategyInterface(shapesList, splitLineArr);
					break;
				case "MOVE":
					commandInvoker mo = new commandInvoker(new createOperation());
					mo.executeMoveStrategyInterface(shapesList, splitLineArr);
					break;
				case "DRAW":
					commandInvoker draw = new commandInvoker(new createOperation());
					draw.executeDrawStrategyInterface(shapesList, splitLineArr);
					break;
				case "COLOR":
					commandInvoker co = new commandInvoker(new createOperation());
					co.executeColorStrategyInterface(shapesList, splitLineArr);
					break;
				case "DELETE":
					commandInvoker de = new commandInvoker(new createOperation());
					de.executeDeleteStrategyInterface(shapesList, splitLineArr);
					break;
				case "DRAWSCENE":
					commandInvoker drSc = new commandInvoker(new createOperation());
					drSc.executeDrawSceneStrategyInterface(shapesList, splitLineArr);
					break;
				case "UNDO":
					commandInvoker un = new commandInvoker(new createOperation());
					un.executeUndoStrategyInterface(shapesList, splitLineArr);
					break;
				default:
					System.out.println("Invalid Command");
					break;
			}
			inputLine = br.readLine();			
		}
		br.close();

	}

}
