package factoryADT;

import java.util.Scanner;

/**
 * Main class 
 * @author yash.porwal_metacube
 *
 */
public class Main {
	
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		boolean flag=true;
		
		while(flag){
			System.out.println("1.Add shape");
			System.out.println("2.Remove shape");
			System.out.println("3.Display shapes");
			System.out.println("4.Check weather given point is enclosed or not");
			System.out.println("5.Sort acc. to timestamp latest to old");
			System.out.println("6.Sort acc. to area in ascending order");
			System.out.println("7.Exit");
			System.out.print("Enter your Choice:-  ");
			int option = sc.nextInt();
			
			switch(option) {
				case 1:
					Screen.addShape();
					break;
					
				case 2:
					Screen.removeShape();
					break;
					
				case 3:
					Screen.displayShapes();
					break;
					
				case 4:
					Screen.isEnclosed();
					break;
					
				case 5:
					Screen.sortAndDisplay();
					break;
					
				case 6:
					Screen.getSortedListOfShapesByArea();
					break;
					
				case 7:
					flag=false;
					break;
				
				default:
					System.out.println("Invalid input!");
			}
			System.out.println("\n");
		}
	}
	
}
