import jdk.dynalink.beans.StaticClass;

class man{
    String name;
    public void tellyourname(){
        System.out.println("my name is " + name);
    }
}


 public class tire extends man {
String company;
String postion;
public void businessman(String name, String company,String postion){
    this.name=name;

    this.company=company;
    this.postion=postion;
}
    public void tellyourINFO() {
        
    System.out.println("my company is "+company);
    System.out.println("my company is "+postion);
    tellyourname();
    }

}
class mybusinessman{
    public static void main(String[] args) {
        tire man= new businessman ("your");
  
        man.tellyourINFO();
 
    }
}

