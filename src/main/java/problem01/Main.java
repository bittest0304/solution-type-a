package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		
		int r; 
		int cnt = 0;
		
		while(number > 0 ) {
			r = number % 10;
			if(r == 3) {
				cnt++;				
			}else if(r == 6) {
				cnt++;				
			}else if(r == 9) {
				cnt++;				
			}
			number = number / 10;			
		}
		
		return cnt;
	}
}
