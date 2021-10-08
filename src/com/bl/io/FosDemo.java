package com.bl.io;


import java.io.*;

public class FosDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
//		FileReader fr = new FileReader("Untitled 2");
//		int data =fr.read();
//		System.out.println((char)data);
//		fr.close();
		
		//fileoutputstreem class creat foulder and write the value from for.write
		FileOutputStream fos = new FileOutputStream("e.txt");
		fos.write(3456);
		System.out.println("saved");
		fos.close();
	

	}

}
