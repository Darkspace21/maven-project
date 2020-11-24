package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * this is a constructor.
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
