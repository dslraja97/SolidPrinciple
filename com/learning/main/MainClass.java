package com.learning.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.learning.SingletonClass;

public class MainClass {

	public static void main(String[] args) throws Exception {

		//approach 1 sing static methoud restricting new Object
		SingletonClass singe= SingletonClass.getInstance();
		System.out.println("Using static Methoud:"+singe.hashCode());
		SingletonClass double1= SingletonClass.getInstance();
		System.out.println("Using static Methoud:"+ double1.hashCode());
		
//		//Using reflection API we are Restricting the Singleton to create new object
//		Constructor<SingletonClass> constructor = SingletonClass.class.getDeclaredConstructor();
//		constructor.setAccessible(true);
//		SingletonClass three=constructor.newInstance();
//		System.out.println(three.hashCode());
		
		//serilization
		FileOutputStream fileOutputStream= new FileOutputStream("C:\\Users\\91904\\new.txt");
		ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(singe);
		
		//deserilization
		FileInputStream fileInputStream= new FileInputStream("C:\\Users\\91904\\new.txt");
		ObjectInputStream inputStream= new ObjectInputStream(fileInputStream);
		SingletonClass readObject = (SingletonClass)inputStream.readObject();
		System.out.println("Using Deseraliabale Interface:"+readObject.hashCode());
		
		
		SingletonClass clone = (SingletonClass)readObject.clone();
		System.out.println("Using Cloneable Interface:"+clone.hashCode());
	}

}
