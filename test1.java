public class test1 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
            print(a);
            rotate(a);
            print(a);
                }

                static void rotate(int[][]a){

                    int[][] b=new int[4][4];
                    int x,y;

                    for(x=0;x<4;x++){
                            for(y=0;y<4;y++){
                                b[y][3-x]=a[x][y];
                            }
                    }
                    System.out.println("============");
                    for(x = 0; x < 4; x++) {
                        for(y = 0; y < 4; y++) {
                            a[x][y] = b[x][y];
                        }
                    }
                }
                
                static void print(int[][] a) {
                    int x, y;
                    
                    for(x = 0; x < 4; x++) {
                        for(y = 0; y < 4; y++) {
                            System.out.printf("%3d", a[x][y]);
                        }
                        System.out.println();
                    }
                }
            }
            