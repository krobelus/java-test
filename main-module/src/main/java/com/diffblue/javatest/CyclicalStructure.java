package com.diffblue.javatest;

public class CyclicalStructure {
  public CyclicalStructure createCyclicalStructure() {
    CyclicalStructure object = new CyclicalStructure();
    object.contents = object;
    return object;
  }

  public CyclicalStructure contents;
}
