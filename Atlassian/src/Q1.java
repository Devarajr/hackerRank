import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q1 {
	private static final Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) throws IOException {
		
	       String filename = null;
	        filename = scan.nextLine();
	        
	        String c_filename = "c_"+filename;
	        String cpp_filename = "cpp_"+filename;
	        String cs_filename = "cs_"+filename;
	        
	        BufferedWriter out = null;
	        try  
	        {
	            FileWriter fstream = new FileWriter("out.txt", true); 
	            out = new BufferedWriter(fstream);
	            out.write("\nsue");
	        }
	        catch (IOException e)
	        {
	            System.err.println("Error: " + e.getMessage());
	        }
	        finally
	        {
	            if(out != null) {
	                out.close();
	            }
	        }
	        
	        scan.close();
	}

}

