/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.song.example;

/**
 *
 * @author tharaka_ra
 */
public class MyClass {

  public void doSomething() {

    Fruit fruit = new Fruit();
    fruit.setColor(null);  // Noncompliant
  }
}