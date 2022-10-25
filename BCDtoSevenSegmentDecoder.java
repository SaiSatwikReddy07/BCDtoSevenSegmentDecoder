import java.util.Scanner;
public class BCDtoSevenSegmentDecoder {
       public static int A,B,C,D,a,b,c,d,e,f,g;
      
		  public int First_Segment(int A, int B, int C, int D) {
		      And AND = new And();
		      Not NOT = new Not();
			  Or4input OR4INPUT = new Or4input();
		      a = OR4INPUT.or4input(A,C,AND.and(B,D),AND.and(NOT.not(B),NOT.not(D)));
			  return a ;
		  }
         public int Second_Segment(int A, int B, int C, int D) {
	         And AND = new And();
	         Not NOT = new Not();
			 Or3input OR3INPUT = new Or3input();
		     b = OR3INPUT.or3input(NOT.not(B),AND.and(C,D),AND.and(NOT.not(C),NOT.not(D)));
			 return b ;
		 }
         public int Third_Segment (int A, int B, int C, int D) {
	         Not NOT = new Not();
			 Or3input OR3INPUT = new Or3input();
		     c = OR3INPUT.or3input(B,NOT.not(C),D);
			 return c ;
         }
		 public int Fourth_Segement(int A, int B, int C, int D) {
	         And AND = new And();
	         Not NOT = new Not();
			 Or5input OR5INPUT = new Or5input();
			 And3input AND3INPUT = new And3input();
		     d = OR5INPUT.or5input(A,AND.and(NOT.not(B),NOT.not(D)),AND.and(NOT.not(B), C),
		    		 AND.and(C,NOT.not(D)),AND3INPUT.and3input(B,NOT.not(C),D));
			 return d ;
		 }
		 public int Fifth_Segement(int A, int B, int C, int D) {
		     And AND = new And();
		     Not NOT = new Not();
		     Or OR = new Or();
			 e = OR.or(AND.and(NOT.not(B), NOT.not(D)),AND.and(C, NOT.not(D))) ;
			 return e;
		 }
		 public int Sixth_Segement(int A, int B, int C, int D) {
		     And AND = new And();
		     Not NOT = new Not();
			 Or4input OR4INPUT = new Or4input();
			 f =  OR4INPUT.or4input(A,AND.and(B,NOT.not(C)),AND.and(B,NOT.not(D)),AND.and(NOT.not(C),NOT.not(D)));
			 return f ;
		 }
		 public int Seventh_Segment(int A, int B, int C, int D){
		     And AND = new And();
		     Not NOT = new Not();
			 Or4input OR4INPUT = new Or4input();
			 g = OR4INPUT.or4input(A,AND.and(B,NOT.not(C)),AND.and(NOT.not(B),C),AND.and(C,NOT.not(D)));
			 return g ;
		 }


	public static void main(String [] args){ 
		   Scanner reader = new Scanner(System.in);
			System.out.print("Enter first bit : ");  
			 A = reader.nextInt();  
			 System.out.print("Enter second bit : ");  
			 B = reader.nextInt();  
			 System.out.print("Enter third bit : ");  
			 C = reader.nextInt();  
			 System.out.print("Enter fourth bit : ");  
			 D = reader.nextInt();
		

		BCDtoSevenSegmentDecoder BTSSD = new BCDtoSevenSegmentDecoder();
		
		int a = BTSSD.First_Segment(A, B, C, D);
		int b = BTSSD.Second_Segment(A, B, C, D);
		int c = BTSSD.Third_Segment(A, B, C, D);
		int d = BTSSD.Fourth_Segement(A, B, C, D);
		int e = BTSSD.Fifth_Segement(A, B, C, D);
		int f = BTSSD.Sixth_Segement(A, B, C, D);
		int g = BTSSD.Seventh_Segment(A, B, C, D);
		
		 if(a == 1 && b==1 && c==1 && d==1 && e==1 && f==1 && g==0 ) {
            System.out.println(" _");
            System.out.println("| |");
            System.out.println("|_|");
		 }
		    else if(a==0 && b==1 && c==1 && d==0 && e==0 && f==0 && g==0) {
                System.out.println("  |");
                System.out.println("  |");
		    }
		    else if (a==1 && b==1 && c==0 && d==1 && e==1 && f==0 && g==1 ) {
		        System.out.println(" _");
		        System.out.println(" _|");
		        System.out.println("|_");
		    }
		    else if(a==1 && b==1 && c==1 && d==1 && e==0 && f==0 && g==1 ) {
                System.out.println(" _");
                System.out.println(" _|");
                System.out.println(" _|");
		    }
		    else if(a==0 && b==1 && c==1 && d==0 && e==0 && f==1 && g==1 ) {
                System.out.println("|_|");
                System.out.println("  |");
		    }
            else if(a==1 && b==0 && c==1 && d==1 && e==0 && f==1 && g==1 ) {
		        System.out.println(" _");
		        System.out.println("|_");
		        System.out.println(" _|");
            }
		    else if(a==1 && b==0 && c==1 && d==1 && e==1 && f==1 && g==1 ) {
		        System.out.println(" _");
		        System.out.println("|_");
		        System.out.println("|_|");
		    }
		    else if(a==1 && b==1 && c==1 && d==0 && e==0 && f==0 && g==0 ) {
		        System.out.println(" _");
		        System.out.println("  |");
		        System.out.println("  |");
		    }
		    else if(a==1 && b==1 && c==1 && d==1 && e==1 && f==1 && g==1 ) {
		        System.out.println(" _");
		        System.out.println("|_|");
		        System.out.println("|_|");
		    }
		 else  {
		        System.out.println(" _");
		        System.out.println("|_|");
		        System.out.println(" _|");
		    }
	 }
}

