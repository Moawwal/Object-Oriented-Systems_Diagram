package Patterns;

import java.util.*;

public interface strategyInterface {
	public LinkedList<String> executeCreate(LinkedList<String> shapesList, String crOperArr[]);
	public int executeSelect(LinkedList<String> shapesList, String seOper[]);
	public LinkedList<String> executeMove(LinkedList<String> shapesList, String moOper[], int Index);
	public void executeDraw(LinkedList<String> shapesList, String drawOper[], int index);
	public LinkedList<String> executeColor(LinkedList<String> shapesList, String coOper[],int index);
	public void executeDelete(LinkedList<String> shapesList, String deOper[],int index);
	public void executeDrawScene(LinkedList<String> shapesList, String drscOper[]);
	public void executeUndo(LinkedList<String> shapesList, String undoOper[]);
}
