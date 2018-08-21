
public class Subset_Sum {
	public static void main(String[] args) {
		int A[]= {1,3,4,7};
		Sum_of_Subset s = new Sum_of_Subset();
		boolean out = s.Subset_Util(A, 0, 0,7);
		System.out.print(out);
	}
}
class Sum_of_Subset{
	int s=3;
	boolean Subset_Util(int A[], int sum, int p, int K) {
		if(sum==K) return true;
		if(p>s) return false;
		for(int i=p;i<s;i++) {
			if(sum+A[i]<=K) {
				if(Subset_Util(A,sum+A[i],i+1,K)==true) {
					
					System.out.println(i+" "+(sum+A[i]));
					return true;
				}
			}
		}
		return false;
	}
}

