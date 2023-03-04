package internals;

import org.junit.Test;

public class Child extends Parent {
	
   public Child() {
		
		System.out.println("non parameterized Child consutructor");
	}
   
   
   
   @Test
   public void test() {
	   
	
	   Child ch = new Child();
	   
	   
	   ch.print();
   }
   
   public void print() {
	   
	   System.out.println("print method");
   }

}
