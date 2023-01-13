
public class TwoD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int twoD[] []=new int[7][];
		
		twoD[0]=new int[1];
		twoD[1]=new int[2];
		twoD[2]=new int[3];
		twoD[3]=new int[4];
		twoD[4]=new int[5];
		twoD[5]=new int[6];
		twoD[6]=new int[7];
		
		
		int i,j,k=1;
		
		for(i=1;i<7;i++) 
			for(j=1;j<i+1;j++) {
			twoD[i][j]=k;
			k++;
		}
		for(i=1;i<7;i++) {
			for(j=1;j<i+1;j++)
				System.out.print(twoD[i][j]+" ");
			System.out.println();
		}

	}

}
