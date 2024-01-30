package dataStructures;

import java.util.*;
public class MyArrayLinearList extends ArrayLinearList {
	
	public MyArrayLinearList(int initialCapacity) {
		super(initialCapacity);
	}
	
	public MyArrayLinearList() {
		super(10);
	}
	
	//huulah baiguulagch
	public MyArrayLinearList(MyArrayLinearList mylist) {
		super(mylist.size());
		for(int i=0; i<mylist.size(); i++)
			this.add(i, mylist.element[i]);
	}
	
	//reverse-esreg daraalald oruulah functs
	public MyArrayLinearList reverse() {
		MyArrayLinearList temp = new MyArrayLinearList (this.size());
		int j=0;
		for (int i = this.size()- 1; i>=0; i--)
			temp.add(j++, this.element[i]);
		return temp;
	}
	
	//Max
	public int Max() {
		int max =  (int)this.get(0);
		for(int i=0; i<this.size(); i++)
			if(max < (int)this.get(i))
				max = (int)this.get(i);
		return max;
	}
	//Min
	public int Min() {
		int min = (int)this.get(0);
		for(int i=0; i<this.size(); i++)
			if(min > (int)this.get(i))
		      min = (int)this.get(i);
		 return min;

	}
	
	//Sum-jagsaaltiin elementuudiin niilberiig oloh
	public int Sum() {
		int sum=0;
		for(int i=0; i<this.size(); i++)
			sum = sum+(int)this.get(i);
		return sum;
		
	}
	
	//Average-Dundajiig oloh
	public int Average() {
		return Sum()/this.size();
	}
	
	//removeOdd - jagsaaltiin sondgoi utga buhii elementuudiig ustgah
	public void removeOdd() {
		for(int i=0; i<this.size(); i++)
			if((int)this.get(i)%2 != 0) {
				remove(i);
				i = i-1;
			}
	}
	
	//sort- jagsaltiin elementuudiig osohoor erembleh
	public void sort() {
		int x;
		for(int i=0; i<this.size(); i++)
		{
			for (int j=0; j<this.size(); j++) {
				if((int)element[i] < (int)element[j]) {
					x = (int)element[i];
					element[i] = element[j];
					element[j] = x;
				}
			}
		}
	}
	
	//unique- jagsaaltiin elementuudiin davhtsaliig arilgah
	public MyArrayLinearList unique() {
		MyArrayLinearList temp = new MyArrayLinearList(this);
		MyArrayLinearList temp1 = new MyArrayLinearList();
		 Arrays.sort(temp.element);
		 int j=0;
		 
		 for (int i = 0; i<temp.size()-1; i++) {
			 if(temp.element[i] != temp.element[i+1]) {
				 temp1.add(j++, temp.element[i]);
			 }
		 }
		 temp1.add(j++, temp.element[temp.size()-1]);
		 return temp1;
	}
	
	//public MyArrayLinearList unique() {
		//MyArrayLinearList temp1=new MyArrayLinearList(this); 
    	//for(int i=0; i<this.size()-1; i++)
    		//if((int)this.get(i)==(int)this.get(i+1)) {
    			//temp1.remove(i);
    		//}
    	//return temp1;
	//}
	
	
	//rand --jagsaaltiin ogogdliig bairlaliig sanamsargui holij butsaana
	 public MyArrayLinearList rand(){
		   
	    	 MyArrayLinearList temp2=new MyArrayLinearList(this);
	    	 MyArrayLinearList temp3=new MyArrayLinearList();
	    
	    	int j=0;
	    	Random r=new Random();
	    	
	    	for(int i=0; i<this.size(); i++) { 
	    	int a=r.nextInt(temp2.size());
	    	temp3.add(j++,temp2.get(a));
	    	temp2.remove(a);
		}
	    	return temp3;
	 }
	 //public MyArrayLinearList rand() {
		// int key;
		 //MyArrayLinearList copylist = new MyArrayLinearList(this);
		// MyArrayLinearList temp = new MyArrayLinearList();
		 //Random rd = new Random();
		// while (!copylist.isEmpty()) {
			// key = rd.nextInt(copylist.size());
			 //temp.add(0, copylist.element[key]);
			 //copylist.remove(key);
		 //}
		 //return temp;
	 //}
}