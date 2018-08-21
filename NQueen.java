
public class NQueen {
	public static void main(String[] args) {
		int s=4,i,j;
		int out[][]=new int[s][s];
		NQueenUtil n = new NQueenUtil();
		
		n.find_Pos(out,0);
		for(i=0;i<s;i++) {
			System.out.println();
			for(j=0;j<s;j++) {
				System.out.print(out[i][j]+" ");
			}
		}
	}
}
class NQueenUtil{
	int s=4;
	boolean find_Pos(int out[][], int Q) {
		if(Q>=s) return true;
		for(int i=0;i<s;i++) {
			if(isSafe(out,Q,i)) {
				out[Q][i]=1;
			
				if(find_Pos(out, Q+1)==true)
					return true;
					
				out[Q][i]=0;
			}
		}
		return false;
	}
	boolean isSafe(int out[][], int x, int y) {
		int i,j;
		if(x<0 || x>=s || y<0 || y>=s) return false;
		for(i=x,j=y; i>=0;i--) {
			if(out[i][j]==1) return false;
		}
		for(i=x,j=y; j>=0;j--) {
			if(out[i][j]==1) return false;
			
		}
		for(i=x,j=y; i>=0 && j>=0; i--,j--) {
			if(out[i][j]==1) return false;
			
		}
		return true;
	}
}
