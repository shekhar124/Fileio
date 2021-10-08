package com.bl.io;

import java.io.*;

public class FileDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// file write to untitled foulder
		FileWriter w = new FileWriter("Untitled 2");

		String aaa = "this is written";
		w.write(aaa);
		System.out.println("sucess");
		w.close();

		// fileinputStreem class read the file and shows out put in console
		FileInputStream fis = new FileInputStream("Untitled 2");
		int data;
		while ((data = fis.read()) != -1) {
			System.out.println("data  :  " + data + "\t" + (char) data);

		}

		fis.close();
	}

}
