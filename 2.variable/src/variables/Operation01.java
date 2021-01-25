package variables;

public class Operation01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 6;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);//몫
		System.out.println(a%b);//나머지
		System.out.println();
		
		double da = 10.0;
		double db = 6.1;
		System.out.println(da+db);
		System.out.println(da-db);
		System.out.println(da*db);
		System.out.println(da/db);//실수연산 나누기
		System.out.println(da%db);//나머지???
		System.out.println();
		
		int x = 10;
		int y = 10;
		x = x+1; //11
		System.out.println(x);
		x++;
		System.out.println(x);
		++x;
		System.out.println(x);
		
		System.out.println(x++);
		System.out.println(++x);
		System.out.println();
		
		x = 11;
		y = 13;
		
		++x;//   12
		System.out.println(x++);//12 13
		System.out.println(--x);//12 12
		System.out.println(--x);//11 11
		x++;                    //   12
		System.out.println(x++);//12 13
		System.out.println(-(-x));// 13
		System.out.println();
		//F11 자동실행
		
		x = 10;
		y = 10;
		int z = ++x + ++y; //z = ? 22
		System.out.println(z);//?
		
		x = 10;
		y = 10;
		z = x++ + ++y;
		System.out.println(z);//??

//		x = 10;
//		y = 10;
//		z = ++x + ++y; 
//		System.out.println(z);//x=11, y=11
//		
//		x = 10;
//		y = 10;
//		System.out.println(++x + ++y);
//		
//		x = 10;
//		y = 10;
//		z = x++ + y++;
//		System.out.println(z); 
//		
//		x = 10;
//		y = 10;
//		System.out.println(x++ + y++);


	}
}
