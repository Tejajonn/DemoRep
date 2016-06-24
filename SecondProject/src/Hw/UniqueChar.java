package Hw;

import java.util.HashMap;
import java.util.Set;

public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String s="Unique characters";
        char[] ch =s.toCharArray();
		
		for(Character c:ch)
		{
			if(c!=' ')
			{
		      if(map.containsKey(c))
		      {
		         map.put(c, map.get(c)+1);
		      } else 
		      {
		         map.put(c, 1);
		        }
			}
		    }
		Set<Character> keys = map.keySet();
		 
		for(Character c :keys)
		{
		      if(map.get(c) ==1)
		      {
		        System.out.println(c+" "+map.get(c));
		      }
	    
	    

	}
	}
}
