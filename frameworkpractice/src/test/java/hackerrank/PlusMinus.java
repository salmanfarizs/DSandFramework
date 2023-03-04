package hackerrank;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

import org.junit.Test;

public class PlusMinus {
	
	
	@Test
	public void method() {
		
		List<Integer> arr = new ArrayList<>();
		
		arr.add(1);
		arr.add(1);
		arr.add(0);
		arr.add(-1);
		arr.add(-1);
		posNeg(arr);
		
	}
	
	
	public void posNeg(List<Integer> list) {
		
		
		
		double positive =0;
		double negative = 0;
		double zero = 0;
		
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i)==0) {
				zero++;
			}else if(list.get(i)>0) {
				
				positive++;
			}else if(list.get(i)<0) {
				negative++;
			}
			
		}
		
		
		
		System.out.println(new Formatter().format("%.6f",positive/list.size() ));
		System.out.println(new Formatter().format("%.6f",negative/list.size() ));
		System.out.println(new Formatter().format("%.6f",zero/list.size() ));
		
		
	}

}
