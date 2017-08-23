
package com.mycompany.hellomaven;

public class HelloMaven {
    public static void main(String[] args) {
        int k;
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