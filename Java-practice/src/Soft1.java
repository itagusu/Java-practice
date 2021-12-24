
public class Soft1 {
	public static void main(String[]args) {
		soft1_1();
		soft1_2();
		soft1_3();
		soft1_5();
		soft1_6();
		soft1_7();
		soft1_9();
		soft1_11();
		soft1_12();
	}
	public static void soft1_1(){
		System.out.println("Hello World");
	}
	public static void soft1_2(){
		int x = 11;
		System.out.println(x);
	}
	public static void soft1_3() {
		int x = 13;
		int y = 17;
		int z = x + y;
		System.out.println("x="+x+",y="+ y);
		System.out.println(z);
	}
	public static void soft1_5() {
		System.out.println(13*17);
	}
	public static void soft1_6() {
		int x;
		x = 7;
		x *= 3;
		System.out.println(x);
		x /= 2;
		System.out.println(x);
	}
	public static void soft1_7() {
		int x = 3;
		int y = 7;
		int z = x;
		x = y;
		y = z;
		System.out.println("x="+x+",y="+y);
	}
	public static void soft1_9() {
		int x = 5;
		System.out.println(x*2);
		System.out.println(x*3);
		System.out.println(x*4);
		System.out.println(x*x);
		System.out.println(x*x*x);
	}public static void soft1_11() {
		int x = 17;
		System.out.println(x/3);
		System.out.println(x%3);
	}
	public static void soft1_12() {
		int x = 10;

        x++;
        System.out.println( x );
        x--;
        x--;
        System.out.println( x );
	}
	
}
