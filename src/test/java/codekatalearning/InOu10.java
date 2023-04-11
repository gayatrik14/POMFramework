package codekatalearning;
import java.util.*;

import org.testng.annotations.Test;
public class InOu10 {
	    @Test
	    public void assi(){
	        Scanner sc= new Scanner(System.in);
	        String s = sc.next();
	        char[] ch = s.toCharArray();
	        for(int i=0;i<=ch.length;i++){
	        	if(i==ch.length-1) {
	        		System.out.println(ch[i]);
	        	}
	        	else 
	        		System.out.print(ch[i] +",");
	        	            
	        }
	    }
	}



