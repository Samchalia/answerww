


import java.io.File;


public class wwAns1 {

	public static void main(String[] args) {

		doesFileExists("path");

	}
      public static void doesFileExists(String path) {
    	  
    	  try {
    		  File f = new File(path);
    		  //boolean exists = f.exists();
    		 if(f.exists())
    		   System.out.println("The file exists");
    		 else {
    			 throw new Exception("File does not exist");
    		 }
    	  }
    	  
    	  catch(Exception e) {
    		  System.out.println(e.getMessage());
    		  
    	  }
      }
}
