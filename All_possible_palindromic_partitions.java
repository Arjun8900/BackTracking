import java.util.ArrayList;

public class All_possible_palindromic_partitions {
	public static void main(String[] args) {
		String s="nitin";
		palindrome(s,0,s.length());
		
	}
	public static void PalindromeUtil(String s, int start, int end, ArrayList<String> temp, ArrayList<ArrayList<String>> out) {
		if(start>=end) {
			out.add(new ArrayList<String>(temp));
		}
		for(int i=start; i<end;i++) {
			//System.out.print(i);
			if(isPalindrome(s,start,end-1)) {
				System.out.print(i);
				temp.add(s.substring(i,end));
				PalindromeUtil(s,i+1,end,temp,out);
				temp.remove(temp.size()-1);
			}
		}
	}
	public static void palindrome(String s, int start, int end) {
		ArrayList<ArrayList<String>> out = new ArrayList<ArrayList<String>>();
		ArrayList<String> temp = new ArrayList<String>();
		PalindromeUtil(s,start, end, temp,out);
		int i,j;
		for(i=0;i<out.size();i++) {
			for(j=0;j<out.get(i).size();j++) {
				System.out.print(out.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
	public static boolean isPalindrome(String s, int start, int end) {
		while(start<=end) {
			if(s.charAt(start)!=s.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}
	
}
