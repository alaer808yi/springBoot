package com;


public class EqualTrans {
	private int x;
	private int y;
	
	public EqualTrans (int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof EqualTrans)){
			return false;	
		}
		EqualTrans eTrans = (EqualTrans)obj;
		return eTrans.x ==x && eTrans.y ==y;
	}

}
