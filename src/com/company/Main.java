package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	String varFour = "this is private to main()";
//
//	ScopeCheck scopeInstance = new ScopeCheck();
//	scopeInstance.useInner();
//
//	ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        System.out.println("VarThree is not accesible here " + innerClass.varThree);

//        System.out.println("scopeInstance varOne is = " + scopeInstance.getVarOne());
//        System.out.println(varFour);
//        scopeInstance.timestwo();
//
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        innerClass.timestwo();

//        Scanner in = new Scanner(System.in);
//        X x = new X(in);

        X x = new X(new Scanner(System.in));
        x.x();


    }

}
