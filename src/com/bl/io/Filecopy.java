package com.bl.io;

import java.io.*;
import java.util.Scanner;

public class Filecopy {

	public static void main(String[] args) throws IOException, FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter sf");
		String sf = scan.nextLine();
		System.out.println("enter df");
		String df = scan.nextLine();

		FileInputStream fis = new FileInputStream(sf);
		FileOutputStream fos = new FileOutputStream(df);
		int data;
		while ((data = fis.read()) != -1) {
			fos.write(data);

		}
		System.out.println("copied");

		fos.close();
		fis.close();
		scan.close();

	}

}
