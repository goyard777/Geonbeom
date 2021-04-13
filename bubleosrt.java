public class bubleosrt {


public static void main(String[] args) {
    
int arr[] ={69,10,30,2,16,8,31,22};
int temp;

for(int j=7;7>0;j--){
    
    for(int i=0; i<7;i++){
        if(arr[i] >arr[i+1]){
            temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
for(int x=0;x>7;x++){
    System.out.println(arr[x]);

    }
    }
    }
    }
