import java.io.*;
// Interface Declared

interface testInterface {
    // public static, static and final variable
    final int a = 10;
    // public and abstract method
    void display();
}

// Class implementing interface 
class TestOOP implements testInterface 
{
 // Implementing the capabilities of Interface
public void display(){ 
    System.out.println("OOP"); 
    }
}

class interfaces {
    public static void main(String[] args){
    TestOOP t = new TestOOP();
    t.display();
    System.out.println(t.a);
    }
}

