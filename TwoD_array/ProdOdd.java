class ProdOdd 
{
	public static void main(String[] args) 
	{
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int prod=1;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i][j]%2!=0){
					prod*=a[i][j];
				}
			}
		}
		System.out.print(prod+" ");
	}
}

