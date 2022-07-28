/*Write a program in java for LambdaExpressionFilter demo. The filter will filter the list of electronic products
whose cost is less than 20000 and print the details of products in the list whose cost is greater than 20000
Step1: Create an Electronic Product bean class with attributes id , name and price
Step2: create a main method and add list of products created to product list
Step3: create a stream object and filter the list using stream filter and lambda expression
Step4: Using lambda expression iterate through list to print product name and product price
Sample output
Iphone 6S: 65000.0
Sony Xperia: 25000.0*/

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class ElectronicProduct{
	int id;  
    String name;  
    double price;  
    public ElectronicProduct(int id, String name, double price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}


public class LambdaExpressionFilter {

	public static void main(String[] args) {
		List<ElectronicProduct> list = new ArrayList<>();
		
		list.add(new ElectronicProduct(10, "Iphone 6S", 65000.0));
		list.add(new ElectronicProduct(20, "Sony Xperia", 25000.0));
		list.add(new ElectronicProduct(8, "Redmi4", 26000.0));
		
		  ElectronicProduct productA = list.stream().max((product1, product2)->product1.price > product2.price ? 1: -1).get(); 
		  System.out.println(productA.price );
		  
		 // ElectronicProduct productB = list.stream().min((product1, product2)-> product1.price > product2.price ? 1 : -1).get();
		  
		  //System.out.println(productB.name);
		  
	        Map<Integer,String> productPriceMap =   
	                list.stream()  
	                            .collect(Collectors.toMap(p->p.id, p->p.name));  
	                  
	            System.out.println(productPriceMap);  

	       


	}

}
