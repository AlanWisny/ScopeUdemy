package com.company;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ". varOne = " + varOne);
    }

    public void timestwo(){
        int varTwo =2;
        for (int i = 0; i<10; i++) {
            System.out.println(i + "times two is " + i * varTwo);
        }
    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);
    }

    public int getVarOne() {
        return varOne;
    }

    public class InnerClass {
        public int varThree = 3;

        public InnerClass() {
            System.out.println("InnerClass created, varThree is = " + varThree);
        }

        public void timestwo(){
            for (int i = 0; i<10; i++) {
                System.out.println(i + " times two is " + i * varThree);
            }
        }
    }
}
