
public class FindPrime {
	
	public static void main(String[] args) {
		
        int max = 1000;
        
        for(int i = 1; i <= max; i++) {
        	if(isPrime(i)) {
        		System.out.print(i + " ");
        	}
        }
	}
	
	public static boolean isPrime(int N) {
		
		// 找出所有小于N的素数
		if(N < 2) {
			return false;
		}
		
		for(int i = 2; i*i <= N; i++) {
			if(N % i == 0) {
				return false;
			}
		}
		return true;
	}
}

