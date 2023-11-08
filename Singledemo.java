package com.parthu;

public class Singledemo {
	
	static Singledemo sd=null;
	
	private Singledemo() throws Exception{
		
	}
	
	{
		if(sd!=null) {
			throw new Exception("Already obj is created");
		}
	}
	
	static Singledemo getInstance() throws Exception {
		if(sd==null) {
			sd=new Singledemo();
		}
		return sd;
		
	}
}
