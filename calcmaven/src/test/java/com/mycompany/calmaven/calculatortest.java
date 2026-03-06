/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcmaven;


import static org.junit.jupiter.api.Assertions.assertEquals;
import  org.junit.jupiter.api.Test;
import com.mycompany.calcmaven.Calculator;

public class calculatortest { 
    @Test
    public void addsTwoNumbers(){
      Calculator calculator = new Calculator();
      assertEquals(2, calculator.add(1, 1));
    }
    @Test
    public void subtractsTwoNumbers(){
      Calculator calculator = new Calculator();
      assertEquals(1, calculator.subtract(2, 1));
    }
    @Test
    public void multiplysTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals( 4, calculator.multiply(2, 2));
    }
    
}

