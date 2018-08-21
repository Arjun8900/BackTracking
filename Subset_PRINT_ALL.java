import java.util.ArrayList;

public class Subset_PRINT_ALL {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		ArrayList<ArrayList<Integer>> out = new ArrayList<>();
		out.add(new ArrayList<Integer>());
		Subset_PRINT_ALL s=new Subset_PRINT_ALL();
		s.Subset_Print(a,out);
		
		for(int i=0;i<out.size();i++) {
			System.out.println();
			for(int j=0;j<out.get(i).size();j++) {
				System.out.print(out.get(i).get(j)+" ");
			}
		}
	}
	public void Subset_Print(int[] A, ArrayList<ArrayList<Integer>> out){
		ArrayList<Integer> temp = new ArrayList<Integer>();
		out.add(temp);
		Subset_Print_UTIL(A,out, temp,0);
		
	}
	public void Subset_Print_UTIL(int A[], ArrayList<ArrayList<Integer>> out, ArrayList<Integer> temp, int index){
		for(int i=index;i<A.length;i++) {
			temp.add(A[i]);
			out.add(new ArrayList<Integer>(temp));
			
			Subset_Print_UTIL(A,out,temp,i+1);
			
			temp.remove(temp.size()-1);
		}
		
	}
	
}
