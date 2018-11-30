
package variable_type;

public class Operation_Ex2 {
//단항 연상자
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; // x=x+1
//		System.out.println(x);
//		++x; // x=1+x
//		System.out.println(x);
//		
//		System.out.println(x++);
//		System.out.println(++x);
		
		
		
		
//		x = 10;
//		y = 10;
//		z = ++x + ++y; //시점 z?
//		System.out.println(z);//x=11, y=11
//		
//		x = 10;
//		y = 10;
//		System.out.println(++x + ++y);//시점 z?//x=11, y=11
//		
//		x = 10;
//		y = 10;
//		z = x++ + y++;
//		System.out.println(z); //시점 z?//x=11, y=11
//		
//		x = 10;
//		y = 10;
//		System.out.println(x++ + y++);//시점 z?//x=11, y=11
		
		
		x = 11;
		y = 13;
		++x;
		System.out.println(x++);//1 12
		System.out.println(--x);//2 12
		System.out.println(--x);//3 11
		x++;
		System.out.println(x++);//4 12
		
		System.out.println(-(-x));
	}

}
