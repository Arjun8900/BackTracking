
public class Rat_in_Maze {
	public static void main(String[] args) {
		int A[][]= { {1,0,0,0}, {1,1,1,1},{0,1,0,0},{1,1,1,1}};
		int s=A.length;
		int sol[][]=new int[s][s];
		
		Rat r = new Rat();
		if(r.solveMaze(A, 0, 0, sol)==true) {
			for(int i=0;i<s;i++) {
				System.out.println();
				for(int j=0;j<s;j++) {
					System.out.print(sol[i][j]+" ");
				}
			}
		}
		else {
			System.out.println("Solution Doesnt Exist");
		}
	}
}
class Rat{
	int N=4;
	boolean solveMaze(int A[][], int x, int y, int sol[][]) {
		if(x==N-1 && y==N-1) {
			sol[x][y]=1;
			return true;
		}
		sol[x][y]=1;
		if(isSafe(A,x+1,y)==true) {
			return solveMaze(A,x+1,y,sol);
		}
		if(isSafe(A,x,y+1)==true) {
			
			return solveMaze(A,x,y+1,sol);
		}
		sol[x][y]=0;
		
		return false;
	}
	boolean isSafe(int A[][], int x, int y) {
		int s=A.length;
		if(x>=0 && y>=0 && x<s && y<s && A[x][y]==1)
		return true;
		
		return false;
		
	}
}
