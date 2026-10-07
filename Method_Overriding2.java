package com.polymorphismConcepts;

public class Method_Overriding2 extends Method_Overriding {
    void sound(){
        System.out.println("Animals are friendly");
        System.out.println("Cats");
    }
    void sound(String a, String b){
        System.out.println("Animals: "+a+ b);
    }
    void sound(int c, int d){
        System.out.println("Dog Price: "+c);
        System.out.println("Cat Price: "+d);
    }
    public static void main (String[]args){
        Method_Overriding2 mo2 = new Method_Overriding2();
        mo2.sound();
        mo2.sound("Dogs");
        mo2.sound("Cats", "Cows");
        mo2.sound(10000, 5000);
    }
}
