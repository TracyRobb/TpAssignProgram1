/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.test1.service.Impl;

import com.tracy.test1.service.CalcService;

/**
 *
 * @author student
 */
public class CalcServiceImpl implements CalcService{

    public int add(int a, int b) {
        return a + b;
    }

    public double divi(double a, double b) {
        return a / b;
    }

    public int multi(int a, int b) {
        return a * b;
    }
    
    public Object myObject(Object a){
        return a;
    }
    
    public boolean greater(int a, int b)
    {
        return a > b;
    }
    
    public Object checkNull(Object a)
    {
        return a;
    }

}
