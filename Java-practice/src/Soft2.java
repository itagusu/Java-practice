import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soft2{
    public static void main( String[] args ) throws IOException{
    	soft2_2();
    }
    public static void soft2_1() throws IOException {
    	BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        String  s = br.readLine();    // 1行分の文字列を入力する
        int	n = Integer.parseInt( s );    // 文字列から数値を得る
        //System.out.println(s);
    }
    public static void soft2_2(){
    	int x =new java.util.Scanner(System.in).nextInt();
    	int y =new java.util.Scanner(System.in).nextInt();
    	System.out.println("和 " + ( x + y ) );
    	System.out.println("差 " + ( x - y ) );
    	System.out.println("積 " + ( x * y ) );
    	System.out.print("商 " + ( x / y ) );
    	System.out.println(" 余り " + ( x % y ) );
    }
}