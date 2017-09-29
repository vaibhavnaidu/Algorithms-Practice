
public class LongestSubstringWithoutRepeatingCharsDemo {

	public static void main(String[] args) {
		String s1 = "abcabcbb";
		String s2 = "bbbbb";
		String s3 = "pwwkew";
		
		LongestSubstringBruteForce l = new LongestSubstringBruteForce();
		System.out.println("s1 Brute Force: " + l.longestSubstring(s1));
		System.out.println("s2 Brute Force: " + l.longestSubstring(s2));
		System.out.println("s3 Brute Force: " + l.longestSubstring(s3));
		System.out.println();
		
		LongestSubstringSlidingWindow sl = new LongestSubstringSlidingWindow();
		System.out.println("s1 Sliding Window: " + sl.SlidingWindow(s1));
		System.out.println("s2 Sliding Window: " + sl.SlidingWindow(s2));
		System.out.println("s3 Sliding Window: " + sl.SlidingWindow(s3));

	}

}
