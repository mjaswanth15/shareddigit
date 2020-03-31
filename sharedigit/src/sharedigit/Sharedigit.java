package sharedigit;

public class Sharedigit {

	public static void main(String[] args) {
    System.out.println(sharedDigit(12,23));
    System.out.println(sharedDigit(9,99));
    System.out.println(sharedDigit(-12,22));
    System.out.println(sharedDigit(12,22));
    System.out.println(sharedDigit(-12,22));
    System.out.println(sharedDigit(40,30));
    System.out.println(sharedDigit(0,0));
	}
	public static boolean sharedDigit(int n1, int n2) {
		int a, b, c, d;
		boolean result=false;
	   if((n1 >= 10 && n1 <= 99) && (n2 >= 10 && n2 <= 99) ) { 
	   a = n1 % 10;
		 b = n1/10;
		 c = n2 % 10;
		 d = n2/10;
		 if(((a == c)||(a == d)) || ((b == c)||(b == d))) {
			result = true;
		}
	   }
        return result;
	
	}
}
