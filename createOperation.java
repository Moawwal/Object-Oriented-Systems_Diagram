package Patterns;
import java.util.*;

public class createOperation implements strategyInterface{
	//LinkedList<String> shapesList = new LinkedList<String>();
	@Override
	public LinkedList<String> executeCreate(LinkedList<String> shapesList, String crOperArr[]) {
		String str;
		if (crOperArr[1]=="RECTANGLE") {
			str="Rectangle, Color: Red, Origin: (0,0), Width: "+ crOperArr[2] + " Height: "+crOperArr[3];
			shapesList.add(str);
		}
		else if (crOperArr[1]=="CIRCLE") {
			str="Circle, Color: Blue, Origin: (0,0), Radius: "+ crOperArr[2];
			shapesList.add(str);
		}
		else {
			System.out.println("ERROR: Not allowed to create this");
		}
		
		return shapesList;
	}
	@Override
	public int executeSelect(LinkedList<String> shapesList, String seOper[]) {
		// TODO Auto-generated method stub
		int index = Integer.parseInt(seOper[1]) - 1;
		
		return index;
	}
	@Override
	public LinkedList<String> executeMove(LinkedList<String> shapesList, String moOper[], int index) {
		// TODO Auto-generated method stub
		if (index != -1) {
			String str=shapesList.get(index);
			String splitstr[]=str.split(" ");
			String newstr;
			for(int i=0; i<splitstr.length;i++) {
				if (splitstr[i].matches("(\\d,\\d),")) {
					newstr="("+moOper[1]+","+moOper[2]+"),";
					splitstr[i]=newstr;
					str=String.join(",", splitstr);
					shapesList.remove(index);
					shapesList.add(index, str);
				}
			}
		}
		else {
			System.out.println("ERROR: No correct select detected for move");
		}
		return shapesList;
		
	}
	@Override
	public void executeDraw(LinkedList<String> shapesList, String drawOper[], int index) {
		// TODO Auto-generated method stub
		if (index!=-1) {
			String str=shapesList.get(index);
			System.out.println(str);
		}
		else {
			System.out.println("ERROR: No shape selected for draw");
		}
		
	}
	@Override
	public LinkedList<String> executeColor(LinkedList<String> shapesList, String coOper[], int index) {
		// TODO Auto-generated method stub
		if (index!=-1) {
			String str=shapesList.get(index);
			String splitstr[]=str.split(",");
			String newstr;
			
			newstr="Color: "+coOper[1]+",";
			splitstr[1]=newstr;
			str=String.join(",", splitstr);
			shapesList.remove(index);
			shapesList.add(index, str);
			
		}
		else {
			System.out.println("ERROR: No shape selected for color change");
		}
		
		return shapesList;
		
	}
	@Override
	public void executeDelete(LinkedList<String> shapesList, String deOper[], int index) {
		// TODO Auto-generated method stub
		System.out.println("Delete execution");
		
	}
	@Override
	public void executeDrawScene(LinkedList<String> shapesList, String drscOper[]) {
		// TODO Auto-generated method stub
		for(int i=0;i<shapesList.size();i++) {
			System.out.println(shapesList.get(i));
		}
	}
	@Override
	public void executeUndo(LinkedList<String> shapesList, String undoOper[]) {
		// TODO Auto-generated method stub
		System.out.println("Undo Execution");
		
	}

}
