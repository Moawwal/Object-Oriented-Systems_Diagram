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
					createOperation cr = new createOperation();
					cr.executeCreate(shapesList, splitLineArr);
					
					break;
				case "SELECT":
					createOperation se = new createOperation();
					se.executeSelect(shapesList, splitLineArr);
					break;
				case "MOVE":
					createOperation mo = new createOperation();
					mo.executeMove(shapesList, splitLineArr);
					break;
				case "DRAW":
					createOperation draw = new createOperation();
					draw.executeDraw(shapesList, splitLineArr);
					break;
				case "COLOR":
					createOperation co = new createOperation();
					co.executeColor(shapesList, splitLineArr);
					break;
				case "DELETE":
					createOperation de = new createOperation();
					de.executeDelete(shapesList, splitLineArr);
					break;
				case "DRAWSCENE":
					createOperation drSc = new createOperation();
					drSc.executeDrawScene(shapesList, splitLineArr);
					break;
				case "UNDO":
					createOperation un = new createOperation();
					un.executeUndo(shapesList, splitLineArr);
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
