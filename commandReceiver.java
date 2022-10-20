package Patterns;
import java.util.*;

public interface commandReceiver {
	
	public void exec();
	
	public void undo();
}
