package com.usf.training;

import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLExpSimple {

	public boolean isWebConnectionSuccessful(String url) {
		boolean canConnecttoURL = false;
        try {
            URL mySite = new URL(url);
            URLConnection yc = mySite.openConnection();
            Scanner in = new Scanner(new InputStreamReader(yc.getInputStream()));
            int count = 0;
            while (in.hasNext()) {
                System.out.println(in.next());
                count++;
                break;
            }
            //System.out.println("Number of tokens: " + count);
   
            in.close();
            if(count > 0) {
            	canConnecttoURL = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		return canConnecttoURL;
	}
    
    public static void main(String[] args) {
    	boolean canConnecttoURL = new URLExpSimple().isWebConnectionSuccessful("http://www.cs.utexas.edu/~scottm");
    	 System.out.println("canConnecttoURL--"+canConnecttoURL);
    }
}
