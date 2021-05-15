	import java.lang.Math;			// Math operations
	import java.io.File; 			// Import the File class
	import java.io.FileOutputStream;
	import java.io.IOException;  	// Import the IOException class to handle errors
	import java.io.FileWriter;  	// Import the FileWriter class


public class plot {

	
	
	
	
	
	public static void main(String[] args) {
		double r = .1;
		double xn = 0;
		double x_n = .40; 
		int index = 50;
		double values[] = new double[index+1];

	
		
		for(int i = 0; i <= index; i++) {
			xn=r*x_n*(1-x_n);
			x_n = xn;
			//print value out to the screen
			System.out.print(xn);
			System.out.print("\n");
			values[i] = xn;
			r += .1;
					
		}
		try {
			FileWriter myWriter = new FileWriter("LG.txt");
			for	(int q = 0; q < index; q++) {
			 	String str = String.valueOf(values[q]);
			 	myWriter.write(str);
				myWriter.write("\n");
			}
			myWriter.close();
		      	
		}
		catch(IOException e) {
			 System.out.println("IOException : " + e);
		}
	}
	
}


