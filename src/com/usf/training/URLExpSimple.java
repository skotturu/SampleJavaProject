package com.usf.training;

public class URLExpSimple {

	public boolean isWebConnectionSuccessful(String url) {
		boolean canConnecttoURL = false;
		return canConnecttoURL;
	}
    
    public static void main(String[] args) {
    	boolean canConnecttoURL = new URLExpSimple().isWebConnectionSuccessful("http://www.cs.utexas.edu/~scottm");
    	 System.out.println("canConnecttoURL--"+canConnecttoURL);
    }
}
