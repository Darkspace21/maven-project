package com.example;

/**
* petite class des familles
*/

public class Greeter {

  /**
  * this is a class
  */
  public Greeter() {

  }

  /**
  * @param someone name of a person
  * @return greeting string
  */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
