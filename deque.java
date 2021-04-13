import java.util.Deque;

class Dqnode{
    char data;
    Dqnode rink;
    Dqnode  link;
}
class Dqueue{
Dqnode front;
Dqnode rear;

public Dqueue(){
    front =null;
    rear =null;
}
public boolean isEmpty(){
return (front==null);
}

public void insertfront(char item){
    Dqnode newnode =newdqnode();
    newnode.data=item;
    if(isEmpty()){
        front =newnode;
        rear=newnode;
        newnode.rink=null;
        newnode.link=null;
    }
}else{
    front.link=newnode;
    newnode.rink=front;
    newnode.link=null;
    front=newnode;


}
System.out.println
}

}







public class deque {

        public static void main(String[] args) {
            
        }
    
}
