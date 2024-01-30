package dataStructures;
import java.util.*;
public class Lab1 {
//test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayLinearList l1 = new MyArrayLinearList();
		l1.add(0, Integer.valueOf(5));
		l1.add(1, Integer.valueOf(13));
		l1.add(2, Integer.valueOf(21));
		l1.add(3, Integer.valueOf(9));
		l1.add(4, Integer.valueOf(9));
		l1.add(5, Integer.valueOf(8));
		l1.add(6, Integer.valueOf(3));
		l1.add(7, Integer.valueOf(12));
		System.out.println("List l1:"+ l1.toString());
		System.out.println("1 - Reverse ");
		System.out.println("2 - Max ");
		System.out.println("3 - Min");
		System.out.println("4 - Sum");
		System.out.println("5 - Average ");
		System.out.println("6 - Remove odd element ");
		System.out.println("7 - Sort");
		System.out.println("8 - Unique");
		System.out.println("9 - Rand");
			   
			   
			   System.out.println("hiih uildlee songonuu:");
			   Scanner in=new Scanner(System.in); 
			   int a=in.nextInt();
			   switch(a) {
			   case 1:
				   MyArrayLinearList l2=l1.reverse();
				   System.out.println("Reverse:  "+l2.toString());
				   break;
			   case 2:
				   System.out.println("Max: "+l1.Max());
				   break;
				  
			   case 3:
				   System.out.println("Min: "+l1.Min());
				   break;
				   
			   case 4:
				   System.out.println("Sum: "+l1.Sum());
				   break;
				
			   case 5:
				   System.out.println("Average: "+l1.Average());
				   break;
				   
			   case 6:
				   l1.removeOdd();
				   System.out.println("Remove Odd element: "+l1.toString());
				   break;
				   
			   case 7:
				   l1.sort();
				   System.out.println("Sort: "+l1.toString());
				   break;
			 
			   case 8:
				   MyArrayLinearList l3=l1.unique();
				   System.out.println("Unique: "+l3.toString());
				   break;
			   case 9:
				   MyArrayLinearList l4=l1.rand();
				   System.out.println("Rand: "+l4.toString());
				   break;
			  
			   default :
					System.out.println("No such actio found! Choose from actions 1-9");
				   
		}
	}
}


