/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hellomaven;

/**
 *
 * @author tharaka_ra
 */
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
class Fruit {
  @NotNull
  private Season ripe;

  private String color;

  public Fruit() {  // Noncompliant; ripe is left null
  }

  public void setColor(@NotNull String color) {
    this.color = color;
  }

  public @NotNull Integer getProtein() {
    return null;  // Noncompliant
  }
}

class MyClass {

  public void doSomething() {

    Fruit fruit = new Fruit();
    fruit.setColor(null);  // Noncompliant
  }
}

