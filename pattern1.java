package pattern;

public class program1 {
	public static void main(String[] args) {
		exer33(5);
	}
	static void exer36(int n)
	{
	    int st=0;
		for(int i=n;i>=1;i--)
		{
		    for(int k=1;k<=st;k++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=i;j>=1;j--)
		    {
		       
		       System.out.print((char)(j+96)+"");
		    }
		    st++;
		    if(st==n)
		    	break;
		   System.out.println();
		}
	}
static void exer35(int n) {
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("-");
			}
			
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
				
			}
			for(int k=2 ;k<=i;k++)
			{
				System.out.print(k);
			}
			
			System.out.println();
		}
	}
	static void exer34(int n) {
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("-");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k);
			}
			
			System.out.println();
		}
	}
	static void exer33(int n)
	{
		int st=n,sp=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("-");
			}
			for(int j=1;j<=st;j++)
			{
				System.out.print("x");
			}
			if(i<=n/2)
			{
				st-=2;
				sp++;
			}
			else
			{
				st+=2;
				sp--;
			}
			System.out.println();
		}
	}
	static void exer32(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(i%2==0)
					System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.println();
		}
	}
	static void exer31(int n)
	{
		int st=0;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=st;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(j+96));
			}
			st++;
			if(st==n)
				break;
			System.out.println();
		}
	}
	static void exer30(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(j%2==0)
					System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.println();
		}
	}
	

	static void exer29(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

	static void exer28(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("x");
			}
			System.out.println();
		}
	}
	
	static void exer27(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("0");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("x");
			}
			System.out.println();
		}
		
	}
	static void exer26(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(j+96)+" ");
			}
			System.out.println();
		}
	}
	static void exer25(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(j+96)+" ");
			}
			System.out.println();
		}
	}
	static void exer24(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(i+96)+" ");
			}
			System.out.println();
		}
	}
	static void exer23(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	static void exer22(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	static void exer21(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				if(i%2==0) {
					if(j%2==0)
						System.out.print("0");
					else
						System.out.print("1");
				}
				else {
					if(j%2==0)
						System.out.print("0");
					else
						System.out.print("1");
				}
					
			}
			System.out.println();
		}
	}
	static void exer20(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	static void exer19(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	static void exer18(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	static void exer17(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	static void exer16(int n)
	{
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(k+96)+" ");
				k++;
			}
			System.out.println();
		}
	}
	static void exer15(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print((char)(j+96)+" ");
			}
			System.out.println();
		}
	}
	static void exer14(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(i+96)+" ");
			}
			System.out.println();
		}
	}
	static void exer13(int n)
	{
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(k+" ");
				k++;
				if(k==10)
					k=1;
			}
			System.out.println();
		}
	}
	static void exer12(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("0");
			}
			System.out.println();
		}
	}
	static void exer11(int n)
	{
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(k%2==0)
					System.out.print("0");
				else
					System.out.print("1");
				k++;
			}
			System.out.println();
		}
	}
	static void exer10(int n)
	{
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
	static void exer9(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(i+96)+" ");
			}
			System.out.println();
		}
	}
	static void exer8(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(j+96)+" ");
			}
			System.out.println();
		}
	}
	static void exer7(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i%2==0)
				{
					System.out.print("0");
				}
				else
					System.out.print("1");
			}
			System.out.println();
		}
	}
	static void exer6(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j%2==0)
					System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.println();
		}
	}
	static void exer5(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	static void exer4(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	static void exer3(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	static void exer2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	static void exer1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("$");
			}
			System.out.println();
		}
	}
}
