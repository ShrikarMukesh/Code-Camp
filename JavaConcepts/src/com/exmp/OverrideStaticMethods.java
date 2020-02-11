package com.exmp;
class Parent 
{
    public static void display()
    {
        System.out.println("Welcome to Parent Class");
    }
}
class OverrideStaticMethods extends Parent
{
    public static void display()
    {
        System.out.println("Welcome to Child class");
    }
    public static void main(String args[]) 
    {
        //Assign Child class object to Parent reference
        //Parent pc = new OverrideStaticMethods();
        display();
     }
}
