
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
		for(Product pd_:pd) {
			if(pd_.getunit()<5) {
				System.out.println(">> "+pd_.getId()+" has "+pd_.getunit()+" Units");
			}
		}
		
		System.out.println("-------------------------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		System.out.println("-------------------------------------------------");
		for(Product pd_:pd) {
			if(pd_.getunit()>4 && pd_.getunit()<51) {
				System.out.println(">> "+pd_.getId()+" has "+pd_.getunit()+" Units");
			}
		}
		
		System.out.println("-------------------------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		System.out.println("-------------------------------------------------");
		for(Product pd_:pd) {
			if(pd_.getunit()>50) {
				System.out.println(">> "+pd_.getId()+" has "+pd_.getunit()+" Units");
			}
		}

	}

}
