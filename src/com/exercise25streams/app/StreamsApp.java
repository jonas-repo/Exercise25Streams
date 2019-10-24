package com.exercise25streams.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class StreamsApp {

	public static void main(String[] args) 
	{
		//objects declaration
		File myFile = null;
		FileReader myReader = null; //good practice to make my reader executable in the main to close it after use it
		BufferedReader myBufferReader = null;
		String line = "";
		
		try 
		{
			//objects initialization
			myFile = new File("C:\\a\\a.txt");
			myReader = new FileReader(myFile);
			myBufferReader = new BufferedReader(myReader);
			
			line = myBufferReader.readLine();
			System.out.println(line);
			
			line = myBufferReader.readLine();
			System.out.println(line);
			
			
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}		
		finally
		{
			try {
				myBufferReader.close();
				myReader = null;
				myFile = null;
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
