
package com.mycompany.hellomaven;

import java.math.BigDecimal;

public class HelloMaven {
    public static void main(String[] args) {
        
        double d = 1.1;

        BigDecimal bd1 = new BigDecimal(d); // Noncompliant; see comment above
        BigDecimal bd2 = new BigDecimal(1.1); // Noncompliant; same result
	
        for(int j=0; j<2; j++){
		for(int i=0; i<=10; i++){
           		System.out.println("Hello Jenkins" + i);
        	}
	}
    }
    
    public String concatenate(String one, String two){
        return one + two;
    }
}