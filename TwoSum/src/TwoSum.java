
public class TwoSum {

	public static void main(String[] args) {
		int[] a = {2,7,11,15};
		int target = 26;
		TwoSumOnPassHash s = new TwoSumOnPassHash();
		int[] result = s.twoSum(a, target);
		if(result != null)
			System.out.println("Result = " + result[0] + ", " + result[1]);
		else
			System.out.println("No result");
	}

}
