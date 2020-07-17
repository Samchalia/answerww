

import java.util.Random;
import java.util.Scanner;

public class Generate500Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scan = new Scanner(System.in);
		
	        Random rand = new Random();
	        int arr[] = new int [500];
	        System.out.print("Enter nth number: ");
	        int n = scan.nextInt();
	       
	        
	        for(int i=1; i<arr.length; i++)
	        {
	            arr[i] = rand.nextInt();
	            System.out.println(arr[i]);
	        }                  
	        
	        for (int k=0; k<arr.length-1; k++) {
	        	
	        	//sorting the array
	        	for (int j=k+1; j<arr.length;j++ ) {
	        		
	        		if (arr[k]> arr[j]) {
	        			int temp = arr[k];
	        			arr[k] = arr[j];
	        			arr[j] = temp;
	        		}
	        	} 
	        	//There are so many values but we need to sort this until given nth value
	        	if(k==n-1) {
	        		System.out.println("The "+n+"th smallest number is "+arr[k]);
	        		break;
	        	}
	        }
	        
	    }

	}


