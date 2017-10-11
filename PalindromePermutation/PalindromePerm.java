package Vai.PalindromePermutation;

import java.util.HashMap;
import java.util.Map;

public class PalindromePerm {
	boolean isPalindromePermutation(String s){
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++){
			if(map.containsKey(s.charAt(i))){
				int count = map.get(s.charAt(i));
				map.put(s.charAt(i), ++count);
			} else
				map.put(s.charAt(i), 1);
		}
		
		int count = 0;
		for(Map.Entry<Character, Integer> m : map.entrySet()){
			count += m.getValue()%2;
		}
		return count <= 1;
	}

}
