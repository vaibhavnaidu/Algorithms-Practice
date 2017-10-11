
public class OneAway {
	
	boolean oneAway(String s1, String s2){
		if(s1.length()==s2.length()) 
			return oneReplace(s1,s2);
		if(s1.length()+1 == s2.length())
			return oneEdit(s1,s2);
		if(s2.length()+1 == s1.length())
			return oneEdit(s2,s1);
		return false;
	}
	
	boolean oneReplace(String s1, String s2){
		boolean differenceFound = false;
		for(int i=0;i<s1.length();i++)
			if(s1.charAt(i) != s2.charAt(i))
				if(differenceFound)
					return false;
				else
					differenceFound=true;
		return true;
	}
	
	boolean oneEdit(String s1, String s2){
		int index1 = 0, index2 = 0;
		while(index1 < s1.length() && index2 < s2.length())
			if(s1.charAt(index1)!=s2.charAt(index2)){
				if(index1 != index2)
					return false;
				index2++;
			} else {
				index1++;
				index2++;
			}
			
		return true;
	}

}
