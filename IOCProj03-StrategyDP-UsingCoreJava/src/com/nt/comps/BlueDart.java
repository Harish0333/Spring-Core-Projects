//BlueDart.java
package com.nt.comps;

public final class BlueDart implements ICourier {
	
	public BlueDart() 
	{
		System.out.println("BlueDart:: 0-param cosntructor");
	}

	@Override
	public String deliver(int oid) 
	{
		return oid+" order id   order products  are ready to deliver using BlueDart  courier service";
	}

}
