package Patterns;

import java.util.*;

public interface strategyInterface {
	public LinkedList<String> executeCreate(LinkedList<String> shapesList, String crOperArr[]);
	public void executeSelect(LinkedList<String> shapesList, String seOper[]);
	public void executeMove(LinkedList<String> shapesList, String moOper[]);
	public String executeDraw(LinkedList<String> shapesList, String drawOper[]);
	public void executeColor(LinkedList<String> shapesList, String coOper[]);
	public void executeDelete(LinkedList<String> shapesList, String deOper[]);
	public String executeDrawScene(LinkedList<String> shapesList, String drscOper[]);
	public void executeUndo(LinkedList<String> shapesList, String undoOper[]);
}
