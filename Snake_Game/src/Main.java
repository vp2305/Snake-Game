import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// This will create a window with all the features
		
		Window f1 = new Window();
		
		//Setting up the window settings
		f1.setTitle("Snake");
		f1.setSize(500,500);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
