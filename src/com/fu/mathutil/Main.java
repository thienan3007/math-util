/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("5! = 120; actual: " + result);
        
        // thêm code sau lần đầu tiên up code lên sv 
        System.out.println("3! = 6; actual: " + MathUtil.getFactorial(3));
    }
}
