import java.util.*;
import java.io.*;

public class CustomerTester{
	static int count = 0;
	static Customer[] Customerlist = new Customer[30];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1= "";
		while 
	    
	}
	public static void saveProducts(){
	      // open file for writting
	     try{
	      FileOutputStream file = new FileOutputStream("customers.txt", true); 
	      PrintWriter outputFile = new PrintWriter(file);
	      
	      //process the array and save its elements to the file
	      for(int i=0; i<count; i++){
	        //write the current array element into the file
	        outputFile.println(Customerlist[i].toString());
	      }
	      //close the file
	      outputFile.flush();
	      outputFile.close();
	     }catch(IOException ex){
	        System.out.println("There were problems writting into the file");
	     }
}
