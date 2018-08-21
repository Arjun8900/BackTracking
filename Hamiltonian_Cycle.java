import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hamiltonian_Cycle {
	public static void main(String[] args) {
		int G1[][]={{0,1,0, 1,0},
					{1,0,1, 1,1},
					{0,1,0, 0,1},
					{1,1,0, 0,1},
					{0,1,1, 1,0}};
		
		int G2[][]={{0,1,0, 1,0},
					{1,0,1, 1,1},
					{0,1,0, 0,1},
					{1,1,0, 0,0},
					{0,1,1, 0,0}};
		ArrayList<ArrayList<Integer>> s=new ArrayList<ArrayList<Integer>>();
		
		System.out.println(s.size()-1);
		HashMap<Integer, Integer> hmap=new HashMap<Integer, Integer>();
		Hamiltonian_Cycle h =new Hamiltonian_Cycle();
		for(int i=0;i<G1.length;i++) {
			hmap.put(i, 0);
		}
		boolean b=h.HCycleUtil(G1,hmap,0);
		System.out.println(b);
		
	}
	public boolean HCycleUtil(int A[][], HashMap<Integer, Integer> hmap, int index) {
		
		hmap.put(index, 1);
		if(!hmap.containsValue(0)) {
			if(A[index][0]==1)
			return true;
		}
		for(int j=0;j<A.length;j++) {
			if(A[index][j]==1 && hmap.get(j)==0) {
				//System.out.print(j);
				if(HCycleUtil(A,hmap,j)==true) {
					
					return true;
				}
				
			}
		}
		hmap.put(index, 0);
		return false;
	}
}
