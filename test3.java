

public class test3 {
    public static void main(String[] args) {
		
	
		int A[][] = new int[6][6]; //1~5 ��� 
		int K=0; 
		int N=5; 
		int SW=1; //(+1)��� ���� ���� , (-1)��� ���� ����
		int I=1,J=0;
		
		//[2] ó��
		do{			
			for(int P=1;P<=N;P++){ // ������ 1~5				
				K=K+1;
				J=J+SW; //����� ����ȭ
				A[I][J] = K;								
			}			
			N=N-1;
			
			if(N>0){				
				for(int P=1;P<=N;P++){				
					K=K+1;
					I=I+SW; //������ �ຯȭ
					A[I][J] = K;								
				}				
				SW = SW*(-1); // ����Ī				
			}else{				
				break; //�ݺ��� ��������.
			}			
		}while(true);
		
		
		
		for(int i = 1; i<A.length;i++){			
			for(int j =1; j< A[i].length;j++){
				System.out.print(A[i][j]+"\t");							
			}
			System.out.println();
		}		}
    }