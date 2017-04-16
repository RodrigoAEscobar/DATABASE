package transaction.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Driver {

	public static void main(String[] args) {
		try {
			File f1 = new File("employee.txt");				// Create Object
			File f2 = new File("transaction_file.txt");			// Create Object
			File f3 = new File("transaction_log.txt");		// Create Object
			
			InputStream in1 = new FileInputStream(f1);		// Read File
			InputStream in2 = new FileInputStream(f2);		// Read File
			OutputStream out = new FileOutputStream(f3);	// Create File
			
			byte[] buffer = new byte[1024];					// Array 1024 bytes
			int len;										// Count # of bytes 
			
			while ((len = in1.read(buffer)) > 0) {			// Check no bytes left behind
				out.write(buffer, 0, len);					// Write bytes into new file
			}
			
			while ((len = in2.read(buffer)) > 0) {			// Check no bytes left behind
				out.write(buffer, 0, len);					// Write bytes into new file
			}
			
			in1.close();									// Close in1
			in2.close();									// Close in2
			out.close();									// Close Out
			
			System.out.println("File Copied!");				// Confirms file is copied
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
