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
	public void executeSelectStrategyInterface(LinkedList<String> shapesList, String crOperArr[]){
		  stratInter.executeSelect(shapesList, crOperArr);
	}
	public void executeMoveStrategyInterface(LinkedList<String> shapesList, String crOperArr[]){
		 stratInter.executeMove(shapesList, crOperArr);
	}
	public String executeDrawStrategyInterface(LinkedList<String> shapesList, String crOperArr[]){
		 return stratInter.executeDraw(shapesList, crOperArr);
	}
	public void executeColorStrategyInterface(LinkedList<String> shapesList, String crOperArr[]){
		stratInter.executeColor(shapesList, crOperArr);
	}
	public void executeDeleteStrategyInterface(LinkedList<String> shapesList, String crOperArr[]){
		 stratInter.executeDelete(shapesList, crOperArr);
	}
	public String executeDrawSceneStrategyInterface(LinkedList<String> shapesList, String crOperArr[]){
		 return stratInter.executeDrawScene(shapesList, crOperArr);
	}
	public void executeUndoStrategyInterface(LinkedList<String> shapesList, String crOperArr[]){
		 stratInter.executeUndo(shapesList, crOperArr);
	}
	
}
