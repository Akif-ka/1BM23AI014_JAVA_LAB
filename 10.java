package apack;

public class A {
    int defaultVar = 10;           // default (package-private)
    protected int protectedVar = 20; // protected
    private int privateVar = 30;     // private
    public int publicVar = 40;       // public
}

package bpack;

import apack.A;

public class B extends A {
    public void display() {
        // System.out.println("Default: " + defaultVar);   
        System.out.println("Protected: " + protectedVar); 
        // System.out.println("Private: " + privateVar);   
        System.out.println("Public: " + publicVar);       
    }
}

package cpack;

import apack.A;

public class C {
    public void display() {
        A obj = new A();
        // System.out.println("Default: " + obj.defaultVar);   
        // System.out.println("Protected: " + obj.protectedVar); 
        // System.out.println("Private: " + obj.privateVar);  
        System.out.println("Public: " + obj.publicVar);      
    }
}
package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        B bObj = new B();
        C cObj = new C();

        System.out.println("From Class B:");
        bObj.display();

        System.out.println("From Class C:");
        cObj.display();
    }
}

output
From Class B:
Protected: 20
Public: 40
From Class C:
Public: 40

