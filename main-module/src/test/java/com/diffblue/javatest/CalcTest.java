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

  // Generated in python with the following code:

  // import random
  //
  // template = """  @Test
  //   public void calcRandom%s() {
  //     int r = Calc.calc("%s");
  //     Assert.assertEquals(%s, r); // %s
  //   }
  // """
  //
  // for i in range(10):
  //     testString = ''.join([str(random.randint(0,30)) + random.choice("-+*/") for j in range(10)])[:-1]
  //     try:
  //        print template % (i, testString, testString, eval(testString))
  //     except ZeroDivisionError:
  //        print "// %s gives division by 0" % testString


  @Test
  public void calcRandom1() {
    int r = Calc.calc("29*11-2*27/10-16*28+3/2/8");
    Assert.assertEquals(29*11-2*27/10-16*28+3/2/8, r); // -134
  }

  @Test
  public void calcRandom2() {
    int r = Calc.calc("1*30+10+8+1*7-7*7+28/2");
    Assert.assertEquals(1*30+10+8+1*7-7*7+28/2, r); // 20
  }

  @Test
  public void calcRandom3() {
    int r = Calc.calc("6/21*24+15/26+8*18+25+4+12");
    Assert.assertEquals(6/21*24+15/26+8*18+25+4+12, r); // 185
  }

  @Test
  public void calcRandom4() {
    int r = Calc.calc("5*19*16-28*24*23-7+14-3*24");
    Assert.assertEquals(5*19*16-28*24*23-7+14-3*24, r); // -14001
  }

  @Test
  public void calcRandom5() {
    int r = Calc.calc("26/14/29-29*4/7+20*29*14/18");
    Assert.assertEquals(26/14/29-29*4/7+20*29*14/18, r); // 435
  }

  @Test
  public void calcRandom6() {
    int r = Calc.calc("26*16-21+26/24/27*4*21/30+2");
    Assert.assertEquals(26*16-21+26/24/27*4*21/30+2, r); // 397
  }

  @Test
  public void calcRandom7() {
    int r = Calc.calc("23+26-5-27/8/24/10+9+23*14");
    Assert.assertEquals(23+26-5-27/8/24/10+9+23*14, r); // 375
  }

  @Test
  public void calcRandom8() {
    int r = Calc.calc("1-7/22/26*24-25+11+22+19*14");
    Assert.assertEquals(1-7/22/26*24-25+11+22+19*14, r); // 275
  }

  @Test
  public void calcRandom9() {
    int r = Calc.calc("15-1-16/20*29/29+11/5/28*11");
    Assert.assertEquals(15-1-16/20*29/29+11/5/28*11, r); // 14
  }
}
