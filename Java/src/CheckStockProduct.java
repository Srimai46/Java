
import java.util.*;
public class CheckStockProduct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many product list in stock : ");
		Product[] pd = new Product[sc.nextInt()];
		System.out.println();
		
		for(int i = 0;i<pd.length;i++) {
			pd[i] = new  Product();
			System.out.print("Input product Id   : ");
			pd[i].setId(sc.next());
			System.out.print("Input product Unit : ");
			pd[i].setUnit(sc.nextInt());
			System.out.println();
		}
		System.out.println("-------------------------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("-------------------------------------------------");
		for(int a =0;a<pd.length;a++) {
			if(pd[a].getunit()<5) {
				System.out.println(">> "+pd[a].getId()+" has "+pd[a].getunit()+" Units");
			}
		}
		
		System.out.println("-------------------------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		System.out.println("-------------------------------------------------");
		for(int i =0;i<pd.length;i++) {
			if(pd[i].getunit()>4 && pd[i].getunit()<51) {
				System.out.println(">> "+pd[i].getId()+" has "+pd[i].getunit()+" Units");
			}
		}
		
		System.out.println("-------------------------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		System.out.println("-------------------------------------------------");
		for(int i =0;i<pd.length;i++) {
			if(pd[i].getunit()>50) {
				System.out.println(">> "+pd[i].getId()+" has "+pd[i].getunit()+" Units");
			}
		}

	}

}
