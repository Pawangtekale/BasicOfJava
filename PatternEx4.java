class PatternEx4{
	public static void main(String[] args) {
		int n=4;
		int num=1;
		char ch='a';
		for (int i=1;i<=n ;i++ ) {
			for (int j=1;j<=n ;j++ ) {
				
				if (i%2==0) {
					System.out.print((ch++)+" ");
				}
				else{
					System.out.print((num++)+" ");
				}
			 	
			}
			
			System.out.println();
		}
	}
}
/* Output of this code is:
1 2 3 4
a b c d
5 6 7 8
e f g h

*/