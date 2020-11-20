package com.busyqa.course;

public class pattern {
	
		public static void main(String[] args)
	    {
	        
	        System.out.println("Enter the number of rows: ");
	 
	                    
	        for (int i= 0; i<= rows-1 ; i++)
	        {
	            for (int j=0; j <i; j++)
	            {
	                System.out.print(" ");
	            }
	            for (int k=i; k<=rows-1; k++) { 
	            	System.out.print("j" + " ");
	            	} 
	            System.out.println(""); 
	            	} 
	        for (int i= rows-1; i>= 0; i--)
	        {
	            for (int j=0; j< i ;j++)
	            {
	                System.out.print(" ");
	            }
	            for (int k=i; k<=rows-1; k++)
	            {
	                System.out.print("a" + " ");
	            }
	            System.out.println("");
	        }
   }


}
