class man{
    String name;
        public void tellyourname(){ 
        System.out.println("my name is " +name);
        
        } 
}
        class businessman extends man{
            String company;
            String position;
            
    public businessman (String name ,String company,String position){ 
        
        this.name=name;
        this.company= company;
        this.position =position;
    
    } 
            
            public void tellyourINFO(){ 
                System.out.println("my comany is " +company);
                System.out.println("my position is " +position);
                tellyourname();
                
            } 
            
        }  
        
        class mybusinessman{ 
            public static void main (String[] args){ 
                businessman man =new businessman("yoon","hybird led","hello");
                man.tellyourINFO();
                
            }
            
            
        }