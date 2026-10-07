package com.polymorphismConcepts;

public class Method_Overloading {
    void customer(){
        System.out.println("***Customer Details***");
    }
    void customer(String name){
        System.out.println("Customer Name: "+name);
    }
    void customer (int a , long b){
        System.out.println("Customer ID: "+a);
        System.out.println("Customer MobNum: "+b);
    }
    void customer (char c1, char c2){
        System.out.println("Is Subscribed: "+c1);
        System.out.println("Gender: "+c2);
    }
public static void main (String[] args){
        Method_Overloading mo = new Method_Overloading();
        mo.customer();
        mo.customer("Roma");
        mo.customer(123, 996280753);
        mo.customer('Y','M' );

}
}

