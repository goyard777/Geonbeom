interface teachable{
String job="가르치는사람";
void teach();
}
interface learnable{
    String task="배우는사람";
    void learn();
}

class professor implements teachable{

    public void teach(){
        System.out.println("교수는 학생을 가르친다");

    }
}
class Student1 implements learnable {
    public void learn(){
        System.out.println(" 학생은 배운다");
    }
}

class PostGraduate implements teachable,learnable{
    String courseName;
    void Course(){
        System.out.println("전산학부 대학원생");
    }
    public void learn(){
        System.out.println("대학원생이 학생을 가르친다");
    }
    public void teach(){
        System.out.println("대학원생은 배우기도 한다.");
    }
}



public class interfaces {
public static void main(String[] args) {
    teachable t1 =new professor();
    teachable t2 =new PostGraduate();
  

    t1.teach();;
    t2.teach();


}
    


}
