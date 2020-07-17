

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WwAns1PartB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try {
        	File  myObj = new File("C:\\Users\\SAMVEEN\\eclipse-workspace\\wwAssess\\data\\wwfile.txt");
        	Scanner scan = new Scanner (myObj);
        	while (scan.hasNextLine()) {
        		 String data = scan.nextLine();
        		 String[] p1 = data.split("[ ]?-[ ]?");
        	     System.out.println(p1[0]);
        	     for(String mean: p1[1].split(","))
        	    	 System.out.println(mean.strip());
        	       
        	}
        	scan.close();
          }
          catch (FileNotFoundException e) {
              System.out.println("An error occurred.");
              e.printStackTrace();
          }
	}
}

