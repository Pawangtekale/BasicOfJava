class PatternEx6{
	public static void main(String[] args) {
		int n=4;
		int num=1;
		for (int i=1;i<=n ;i++) {
			num=i;
			System.out.print(i+" ");
			for (int j=1;j<n ;j++,num+=4 ) {
				System.out.print((num+4)+" ");
			}
			System.out.println();
		}
	}
}
/* output of this code is:
1 5 9 13
2 6 10 14
3 7 11 15
4 8 12 16
*/