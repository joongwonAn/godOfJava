package com.sprint.jw.godofjava.Volume1.Chapter08;

public class ReferenceStaticVariable {
//    static String name;
    String name;
    public ReferenceStaticVariable() {}
    public ReferenceStaticVariable(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ReferenceStaticVariable reference1 = new ReferenceStaticVariable("jw");
        System.out.println(reference1.name);

        ReferenceStaticVariable reference2 = new ReferenceStaticVariable("ja");
        System.out.println(reference1.name);
    }
}
