package com.diffblue.javatest;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
  @Test
  public void divideByOne() {
    int result = new Calc().div(2, 1);
    Assert.assertEquals(result, 2);
  }

  @Test
  public void calcAdd() {
    int r = Calc.calc("10+5");
    Assert.assertEquals(10+5, r);
  }

  @Test
  public void calcSub() {
    int r = Calc.calc("10-5");
    Assert.assertEquals(10-5, r);
  }

  @Test
  public void calcSubAdd() {
    int r = Calc.calc("10-5+3");
    Assert.assertEquals(10-5+3, r);
  }

  @Test
  public void calcMul() {
    int r = Calc.calc("10*5");
    Assert.assertEquals(10*5, r);
  }

  @Test
  public void calcDiv() {
    int r = Calc.calc("10*5");
    Assert.assertEquals(10*5, r);
  }

  @Test
  public void calcSubMulti() {
    int r = Calc.calc("10-5-5");
    Assert.assertEquals(10-5-5, r);
  }

  @Test
  public void calcDivMulti() {
    int r = Calc.calc("16/2/2");
    Assert.assertEquals(16/2/2, r);
  }

  @Test
  public void calcSubMul() {
    int r = Calc.calc("10-5*2");
    Assert.assertEquals(10-5*2, r);
  }

  @Test
  public void calcSubMul2() {
    int r = Calc.calc("10-5*2+1-4/2");
    Assert.assertEquals(10-5*2+1-4/2, r);
  }
}
