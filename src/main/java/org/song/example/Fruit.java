/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.song.example;

import com.sun.istack.internal.NotNull;


public class Fruit{
  @NotNull

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