
public class selection {
    public void sort(int[] arr){
        int size = arr.length;  //배열의 사이즈 크기 .
        int min;         // 최소값 구하기 
        int temp; //배열의 움직일시 일시적으로 저장해주는 부분 
    
        for(int i=0; i<size-1; i++){ 
            min = i;
            for(int j=i+1; j<size; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
            
        selection selection = new selection();
        
        int arr[]={69,15,14,32,17,16,15};
 
        selection.sort(arr);

        for(int i=0; i<arr.length;i++){
            //  arr 배열의 데이터의 정렬을 하면서 순사적으로 출력하기 
                System.out.print("["+arr[i]+"]");
        }
    }
}


