/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09Example02;

/**
 *
 * @author S542047
 */
public class UncheckedExceptions {
   private int a;
   private int b;
   private String s;

    public UncheckedExceptions(int a, int b, String s) {
        this.a = a;
        this.b = b;
        this.s = s;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
   
   public int arithmetic() throws ArithmeticException{

            int result = a / b;
           return  result;

        }

    public void stringIndexOutOfBound() throws StringIndexOutOfBoundsException {
        
       System.out.println(s.charAt(99));
    }
}

  

