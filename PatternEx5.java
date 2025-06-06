class PatternEx5{
	public static void main(String[] args) {
		int n=4;
		int num=1;
		char ch='a';
		for (int i=1;i<=n ;i++ ) {
			for(int j=1;j<=n;j++){
				if (i==j||i+j==n+1){
					System.out.print((ch)+" ");
					
				}
				else
					System.out.print(j+" ");
			}
			ch++;
			System.out.println();
			
		}
	}
}
/* Output of this program is:
a 2 3 a
1 b b 4
1 c c 4
d 2 3 d
*/