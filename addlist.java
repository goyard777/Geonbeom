//
interface queue{
boolean isEmpty();
void enqueue(char item);
char dequeue();
void delete();
char peek();
}
//

class QNode{

    char data;
    QNode link ;
}

class addlist implements queue{
        Qnode front ;
        Qnode  rear;

        public addlist (){
            rear=null;
            front =null;
        }
        @Override
        public boolean isEmpty() {
            // TODO Auto-generated method stub
                return(front==null);

        }
        @Override
        public void enqueue(char item) {
            // TODO Auto-generated method stub
            Qnode newnode = new Qnode();
   

            if(isEmpty()){
           
              
            }
        }
        @Override
        public char dequeue() {
            // TODO Auto-generated method stub
            return 0;
        }
        @Override
        public void delete() {
            // TODO Auto-generated method stub
            
        }
        @Override
        public char peek() {
            // TODO Auto-generated method stub
            return 0;
        }

}
















	
	



//3월 30일  addlist  made kimGeonbeom
