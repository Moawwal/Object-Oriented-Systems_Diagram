package Patterns;
import java.util.*;

public class commandInvoker {
	//LinkedList<strategyInterface> stratInter = new LinkedList<>();
	private strategyInterface stratInter;
	
	public commandInvoker(strategyInterface stratInter) {
		this.stratInter = stratInter;
	}
	
	public LinkedList<String> executeCreateStrategyInterface(LinkedList<String> shapesList, String crOperArr[]){
		 return stratInter.executeCreate(shapesList, crOperArr);
	}
	public int executeSelectStrategyInterface(LinkedList<String> shapesList, String crOperArr[]){
		  return stratInter.executeSelect(shapesList, crOperArr);
	}
	public LinkedList<String> executeMoveStrategyInterface(LinkedList<String> shapesList, String crOperArr[],int index){
		 return stratInter.executeMove(shapesList, crOperArr, index);
	}
	public void executeDrawStrategyInterface(LinkedList<String> shapesList, String crOperArr[], int index){
		 stratInter.executeDraw(shapesList, crOperArr, index);
	}
	public LinkedList<String> executeColorStrategyInterface(LinkedList<String> shapesList, String crOperArr[], int index){
		return stratInter.executeColor(shapesList, crOperArr, index);
	}
	public void executeDeleteStrategyInterface(LinkedList<String> shapesList, String crOperArr[], int index){
		 stratInter.executeDelete(shapesList, crOperArr, index);
	}
	public void executeDrawSceneStrategyInterface(LinkedList<String> shapesList, String crOperArr[]){
		 stratInter.executeDrawScene(shapesList, crOperArr);
	}
	public void executeUndoStrategyInterface(LinkedList<String> shapesList, String crOperArr[]){
		 stratInter.executeUndo(shapesList, crOperArr);
	}
	
}
