import javax.swing.JOptionPane;
public class CostCalculator {

	public static double calculateCost(double bp,int n,double mm)
	 {
	 }
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

		        if (material.equals("food"))
					materialMarkup=0.13;
				if(material.equals("drugs"))
					materialMarkup=0.075;
				if(material.equals("electronics"))
					materialMarkup=0.02;
				
				CalculatedCost=calculateCost(basePrice,no_of_persons,materialMarkup);
				JOptionPane.showMessageDialog(null,String.format("The calculated Price is"+CalculatedCost));

	}

}
