
public class m_Coloring_Problem {
	public static void main(String[] args) {
		int A[][]= {{0,1,1,0,0, 1,0,0,0,0},
					{1,0,0,0,0, 0,1,1,0,0},
					{1,0,0,1,0, 0,0,0,1,0},
					{0,0,1,0,1, 0,0,1,0,0},
					{0,0,0,1,0, 1,1,0,0,0},
					{1,0,0,0,1, 0,0,0,0,1},
					{0,1,0,0,1, 0,0,0,1,0},
					{0,1,0,1,0, 0,0,0,0,1},
					{0,0,1,0,0, 0,1,0,0,1},
					{0,0,0,0,0, 1,0,1,1,0}};
			
		int n=10,i;
		int colors=3;
		int out[]=new int[n];
		for(i=0;i<n;i++) {
			out[i]=-1;
		}
		m_Coloring_Problem m =new m_Coloring_Problem();
		m.m_ColorUtil(A,out,0,colors);
		for(i=0;i<n;i++) {
			System.out.print(out[i]+" ");
		}
	}
	public boolean m_ColorUtil(int A[][], int out[], int node,int colors) {
		if(out[node]!=-1) return true;
		int flag=0;
		for(int t=0;t<colors; t++) {
			flag=0;
			for(int j=0;j<A.length;j++) {
				if(A[node][j]==1) {
					if(out[j]==t) {
						flag=1; break;
					}
				}
			}
			if(flag==0) {
				out[node]=t;break;
			}
		}
		boolean bool=true;
		for(int j=0;j<A.length;j++) {
			if(A[node][j]==1)
			bool=bool & m_ColorUtil(A,out, j,  colors);
		}
		if(bool==true) return true;
		return false;
	}
	
	
}
