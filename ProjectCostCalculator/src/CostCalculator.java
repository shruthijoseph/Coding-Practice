import javax.swing.JOptionPane;
public class CostCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String userStringInput;
		double basePrice;
		int no_of_persons;
		String material;
		userStringInput=JOptionPane.showInputDialog("Enter the base price");
				basePrice=Double.parseDouble(userStringInput);
		userStringInput=JOptionPane.showInputDialog("Enter the number of people");
		        no_of_persons=Integer.parseInt(userStringInput);
		userStringInput=JOptionPane.showInputDialog("Enter the material");
		        material=userStringInput;


	}

}
