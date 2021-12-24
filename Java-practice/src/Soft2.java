import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soft2{
    public static void main( String[] args ) throws IOException{
    	soft2();
    }
    public static void soft2() throws IOException {
    	BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        String  s = br.readLine();    // 1行分の文字列を入力する
        int	n = Integer.parseInt( s );    // 文字列から数値を得る
        //System.out.println(s);
    }
}