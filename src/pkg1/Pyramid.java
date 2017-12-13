package pkg1;

public class Pyramid {

	public static void main(String[] args) {
		int sizeOfPyramid = 8;

        

        for(int i=1;i<=sizeOfPyramid;i++) {

            // print reduced number of spaces for each new row

            for(int j=i;j<=sizeOfPyramid-1;j++) {

                System.out.print(" ");

            }

             

            // the number of asterisks per row is 2*rownumber-1

            for(int k=1;k<=2*i-1;k++){

                System.out.print("*");

            }

            System.out.println("");

        }

	}

}
