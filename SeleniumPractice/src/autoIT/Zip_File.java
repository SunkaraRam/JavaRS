package autoIT;

import java.io.File;

import org.openqa.selenium.io.Zip;

public class Zip_File {

	public static void main(String[] args) {
		
		Zip zipFolder = new Zip();
		
		//Folder to be zipped source
		
		File sourceFile = new File("D:\\MainProject");
		
		//Zip file Destingation location and ZipFile name
		
		File destinationFile =  new File("e:\\result112233.zip");
		
		//UnzipLocation
		
		File unzipLocation= new File("e:\\Destination");
		
		try {
			
			if(destinationFile.isFile())
				destinationFile.delete();
			//Create a zip file
			
		//	Zip.zip(sourceFile,destinationFile);
			
			//UnZip a File
			
			//zipFolder.unzip(destinationFile, unzipLocation);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
