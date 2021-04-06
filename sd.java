class picachu {
   

    public void setOprands() {
      System.out.println("자 이제시작이야 내꿈을");
    }

    public void a1() {
        System.out.println("내꿈을 위한여행 피카추");
    }

    public void a2() {
        System.out.println("걱정따윈없어~~");
    }
}

class corona extends picachu {
    public void substract() {
        System.out.println("피카추~");
    }
}

class Main {

    public static void main(String[] args) {
        corona c1 = new corona();
        c1.setOprands();
        c1.a1();
        c1.a2();
        c1.substract();
    }
}
