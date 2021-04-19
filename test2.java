public class test2 {

    public static void main(String[] args) {

        int a[][] = new int[5][5];

		int b[][] = new int[5][5];

		int row, col;

		int i=1;

		

		for(row=0;row<=4;row++){

			for(col=0;col<=4;col++){

				a[row][col]=i++;

			}

		}

		

		for(row=0;row<=4;row++){

			for(col=0;col<=4;col++){

				System.out.printf("%3d", a[row][col]);

			}

			System.out.println();

		}

		

		//90도 회전

		for(row=0;row<=4;row++){

			for(col=0;col<=4;col++){

				b[row][4-col]=a[col][row];

			}

		}

		

		//90도 회전 출력

		System.out.println("90");

		for(row=0;row<=4;row++){

			for(col=0;col<=4;col++){

				System.out.printf("%3d", b[row][col]);

			}

			System.out.println();

		}

		

		

		//180도 회전

		for(row=0;row<=4;row++){

			for(col=0;col<=4;col++){

				a[row][4-col]=b[col][row];

			}

		}



		//180도 회전 출력

		System.out.println("180");

		for(row=0;row<=4;row++){

			for(col=0;col<=4;col++){

				System.out.printf("%3d", a[row][col]);

			}

            System.out.println();
		}
        System.out.println("270");
//270도
        for(row=0;row<=4;row++){

			for(col=0;col<=4;col++){

				a[4-row][col]=b[row][4-col];

			}

		}
		//270도 회전 출력

		System.out.println();

		for(row=0;row<=4;row++){

			for(col=0;col<=4;col++){

				System.out.printf("%3d", a[row][col]);

			}

			System.out.println();

		}

        //360도
        for(row=0;row<=4;row++){

			for(col=0;col<=4;col++){

				a[row][col]=b[col][4-row];

			}

		}
		//360도 회전 출력

		System.out.println();

		for(row=0;row<=4;row++){

			for(col=0;col<=4;col++){

				System.out.printf("%3d", a[row][col]);

			}

			System.out.println();

		}






	}

}




