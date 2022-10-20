package Patterns;
import java.util.*;

public class commandInvoker {
	//LinkedList<strategyInterface> stratInter = new LinkedList<>();
	private strategyInterface stratInter;
	
	public commandInvoker(strategyInterface stratInter) {
		this.stratInter = stratInter;
	}
	
	public LinkedList<String> executeStrategyInterface(LinkedList<String> shapesList, String crOperArr[]){
		return stratInter.executeCreate(shapesList, crOperArr[]);
	}
}
