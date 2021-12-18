package track;
import java.time.LocalTime;

public class App {
  
  public static void main(String[] args) {
    example1();
//     // このコードは標準入力と標準出力を用いたサンプルコードです。
//     // このコードは好きなように編集・削除してもらって構いません。
//     // ---
//     // This is a sample code to use stdin and stdout.
//     // Edit and remove this code as you like.

//     String[] lines = getStdin();
//     for (int i = 0, l = lines.length; i < l; i++) {
//       String output = String.format("line[%s]: %s", i, lines[i]);
//       System.out.println(output);
//     }
//   }

//   private static String[] getStdin() {
//     Scanner scanner = new Scanner(System.in);
//     ArrayList<String> lines = new ArrayList<>();
//     while (scanner.hasNext()) {
//       lines.add(scanner.nextLine());
//     }
//     return lines.toArray(new String[lines.size()]);
  }
  public static void example1(){
	int a = 1000;
    int b = 600;
    int c = 250;
    int d = 100;
    LocalTime BaseTime = LocalTime.of(22, 00, 00);
    LocalTime time1 = LocalTime.of(10, 25, 00);
    LocalTime time2 = LocalTime.of(23, 40, 00);
    boolean t1 = BaseTime.isBefore(time1);
    boolean t2 = BaseTime.isBefore(time2);
    System.out.println(t1);
    System.out.println(t2);
    
    
    
  }
}
