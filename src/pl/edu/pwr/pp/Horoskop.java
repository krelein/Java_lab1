package pl.edu.pwr.pp;

import java.util.EmptyStackException;
import java.util.Random;

import org.junit.Test;

public class Horoskop {
	public int healthIndex(String name){
		return name.length() % 12;
	}
	public int loveIndex(int day){
		int index = (day - 1) % 12;
		if (day > 31 || day < 1){
			throw new EmptyStackException();
		}
		return index;
	}
	public int workIndex(){
		Random rnd = new Random();
		return rnd.nextInt() % 12; 
	}
	
	public static void main(String[] args) {
	try 	(BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in))) {
	String name = bufferRead.readLine();
	System.out.println("Hello " + name);
	} 
	catch
	(
	IOException
	 ex) {
	            System.out.println("Hello World”);
	// ex.printStackTrace();
	}
	}
}



