package Vai.PalindromePermutation;

import java.util.HashMap;
import java.util.Map;

public class PalindromePerm {
	boolean isPalindromePermutation(String s){
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		boolean isOdd = s.length()%2==0?false:true;
		for(int i=0;i<s.length();i++){
			if(map.containsKey(s.charAt(i))){
				int count = map.get(s.charAt(i));
				map.put(s.charAt(i), ++count);
			} else
				map.put(s.charAt(i), 1);
		}
		
		boolean odd = false;
		for(Map.Entry<Character, Integer> m : map.entrySet()){
			if(m.getValue()%2 == 1)
				odd = !odd;
		}
		
		if(isOdd == odd)
			return true;
	
		return false;
	}

}
