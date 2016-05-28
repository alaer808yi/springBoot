package com;



public final class Equalsy {
	private  String s ;
	
	public Equalsy(String s){
		this.s = s;
	}
	
	public void speak(){
		
	}
	


	@Override
	public boolean equals(Object obj) {
		boolean a = obj instanceof Equalsy ;
		String c = ((Equalsy)obj).s;
 		return c.equalsIgnoreCase(s);
	}


	public static void main(String args[]){
	
		Equalsy test = new Equalsy("a");
		Equalsy test2 = new Equalsy("AF");
		System.out.println(test.equals(test2));
		System.out.println(test2.equals(test) );
	
		
	}

}
