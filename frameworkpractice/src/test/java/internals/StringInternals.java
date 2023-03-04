package internals;

import java.util.HashMap;

import org.junit.Test;

public class StringInternals {

	@Test
	public void main() {
		// TODO Auto-generated method stub
		
		
		
		String str = "salman";
		
		String str3 =str.concat("Fariz");
		
		String str4 = str + "Fariz";
		
		StringBuffer str2 = new StringBuffer("salman");
		
		StringBuffer str5 = new StringBuffer("salman");
		
		StringBuilder str6 = new StringBuilder();
		
		String text = "salman";
		
		String text2 = new String("salman");
		
		//str2.append("Fariz");
		
		System.out.println(str);
		
		System.out.println(str2);
		
		System.out.println(str3);
		
		System.out.println(str4);

		
		System.out.println(Byte.hashCode((byte) 865113938));
		
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text2));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		
		
		
		StringBuilder str7 = new StringBuilder("ab");
		
		System.out.println("str7" + str7.substring(1,str7.length()-1));
	}

}
