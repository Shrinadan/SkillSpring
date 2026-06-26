package cognizant;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   LinkedHashMap<Character, Integer> map =new LinkedHashMap<>();
String string="shrinanadan";
    for(int i=0; i<string.length(); i++)
    {  Character character=string.charAt(i);
    	map.put(character,map.getOrDefault(character, 0)+1);
    }
    for(Map.Entry<Character, Integer>entry:map.entrySet())
    { System.out.println(entry.getKey()+" ------"+ entry.getValue());
    	if(entry.getValue()==3)
    	{
    		System.out.println(entry.getKey());
    	}
    }
	}

}
