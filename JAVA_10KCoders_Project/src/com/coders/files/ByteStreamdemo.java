package com.coders.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamdemo {
	public static void main(String[] args) throws Exception {
		FileInputStream sourceStream=null;
		FileOutputStream targetStream=null;
		
		try {
			Object sourcefile;
			sourceStream =new FileInputStream(sourcefile.txt);
			Object targetfile;
			targetStream =new FileOutputStream(targetfile.txt);
			
			
			//Reading source file and writing content to target file byte by byte
			
			boolean temp;
			
			while((temp=sourceStream.read()!=-1))targetStream.write(byte)temp);
			
					
		}
		finally {
			FileInputStream sourceStraem;
			if (sourceStream !=null) sourceStraem.close();
			FileInputStream targetStraem;
			if (targetStream !=null) targetStraem.close();
		
		}
	}

}
//output: Shows content of file "file.txt"