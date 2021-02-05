import java.util.*;
import java.awt.*;
public class DataOfSquare {
	//Array that'll contain the colors
	ArrayList<Color> C = new ArrayList<Color>();
	int color; //2: snake, 1: food, 0:empty
	SquarePanel square;
	public DataOfSquare(int col) {
		//lets add the color to the arrayList
		C.add(Color.white);
		C.add(Color.GREEN);
		C.add(Color.DARK_GRAY);
		color = col;
		square = new SquarePanel(C.get(color));
	}
	public void lightMeUp(int c) {
		square.ChangeColor(C.get(c));
	}
}
