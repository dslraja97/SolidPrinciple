package com.learning;

import java.io.Serializable;

final public class SingletonClass implements Serializable,Cloneable{
	
	private static final long serialVersionUID = 1L;
	static SingletonClass singletonClass =null;
	
	private SingletonClass() throws Exception{
		
	}
	
	public static SingletonClass getInstance() throws Exception {
		if(singletonClass==null) {
			singletonClass= new SingletonClass();
		}
		return singletonClass;
	}
	
	{
		if(singletonClass!=null) {
			throw new Exception("Object is already created!!");
		}
	}
	
	Object readResolve() {
		return singletonClass;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
//		return super.clone();
		return singletonClass;
	}
	

}
