import java.util.HashMap;
import java.util.Map;

public class LongestSubstringSlidingWindow {
	public int SlidingWindow(String s){
		
		int length = 0;
		int n = s.length();
		Map<Character, Integer> map = new HashMap<>();
		
		for(int j=0,i=0;j<n;j++){
			
			if(map.containsKey(s.charAt(j)))
				i = Math.max(map.get(s.charAt(j)), i);
			
			length = Math.max(length, j-i+1);
			map.put(s.charAt(j), j+1);
		}
		return length;
	}
}
