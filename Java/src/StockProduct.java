
import java.util.*;
import java.text.*;
public class StockProduct {

	public static void main(String[] args)  
	{
		Product[] pd = new Product[4];
		Scanner sc = new Scanner(System.in);
		DecimalFormat dm = new DecimalFormat("#,###.00");
		
		for(int i=0;i<pd.length;i++) {
			pd[i] = new  Product();
			System.out.print("Input product Id    : ");
			pd[i].setId(sc.next());
			System.out.print("Input product Unit  : ");
			pd[i].setUnit(sc.nextInt());
			while (!(pd[i].getunit()>0)) {
				System.out.print("Input product Unit  : ");
				pd[i].setUnit(sc.nextInt());
			}
			System.out.print("Input product Price : ");
			pd[i].setPrice(sc.nextDouble());
			while (!(pd[i].getPrice()>0)) {
				System.out.print("Input product Price  : ");
				pd[i].setPrice(sc.nextInt());
			}
			
			System.out.println();
			
			
		}
		System.out.println("---------------------------------------------------------");
		double totalPrice = 0;
		for(Product _pd:pd) {
			System.out.println("Product ID : "+_pd.getId()+", Total price = "+dm.format(_pd.calculate())+" baht.");
			totalPrice += _pd.calculate();
		}
		System.out.println("---------------------------------------------------------");
				
		System.out.println("Total price of all product is "+dm.format(totalPrice)+" baht.");

	}

}
