import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("BLAS ANDRES AYALA GARCIA");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(900, 400);
		myFrame.setSize(210, 150);
		
		 MyPanelClass myPanel = new MyPanelClass();
                        myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
	}
}