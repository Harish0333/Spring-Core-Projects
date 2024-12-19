package com.nt.sbeans;


/*@Component("prn")
@Scope("prototype")*/
public class Printer {
	//static  ref variable  of singleton class  to ref that single object that will be created
  private static Printer  INSTANCE;
  
   // private  constructor  (closes the door of creating objects outside of the class using new constructor)
  private  Printer() {
	  System.out.println("Printer:: 0-param constructor (private)");
  }
  
  //public static factory method
  public static  Printer  getInstance() {
	    if(INSTANCE==null)
	    	INSTANCE=new  Printer();
	    
	    return INSTANCE;
  }
  
  // b.method  (to print the messages)
  public void print(String msg) {
	  System.out.println(msg);
  }	
}
