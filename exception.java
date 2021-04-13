public class exception {

public static void main(String[] args) {
        // int [] arr= {1,2,3,4,5};
        // int index =5;

//     try { 
//         System.out.println(arr[index]);
        
//     } catch (ArrayIndexOutOfBoundsException e) {
//         //TODO: handle exception
//         System.out.println("오류");

//     }   catch(Exception e){
//     System.out.println("오류아님");
//     }
//      }       

// }

/* 예외처리 부분 . */
// System.out.println("프로그램시작");

// try {
//     Thread.sleep(3000);
// }

// catch(InterruptedException e) {

// System.out.println("예외발생");

// }
// System.out.println("프로그램 종료 ");

// 메소드  부분 

// static void method(){

//         submethod();

// }
// static void submethod(){
//     int i ;
//     int a=3,b=0;
//     try {
//         i=a/b;
//     System.out.println(i);
// } catch (Exception e){
//     System.out.println(e.getMessage());
        
//         }
//     }


try{
method ();

}
catch(Exception e){
    System.out.println(e.getMessage());
}
}

static void method() throws Exception{
    throw new Exception("하이");
}




}       
    





