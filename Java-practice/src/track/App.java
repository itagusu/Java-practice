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
	double a = 1000; //基本料金内距離
    int b = 600; //定額料金
    int c = 250; //250mあたり追加料金
    int d = 100; //追加料金(250m毎)
    LocalTime BaseTime = LocalTime.of(22, 00, 00); //料金変動時間
    LocalTime time1 = LocalTime.of(10, 25, 00); //1人目乗車時間
    LocalTime time2 = LocalTime.of(23, 40, 00); //2人目乗車時間
    boolean t2 = BaseTime.isBefore(time2);
    double[] distance = {1500,2001}; //配列で記述
    
    
    double[] AddDistance = distance - a;
    int total = b + (int)Math.ceil(AddDistance/c) * d;
    for(int i =0;i < distance.length; i++) {
    	if(t2 == true) {
    		total * 1.2;
    	}else
    		total;
    	
    }
    	System.out.println(total);
    
//    int distance1 = 1500;
//    double distance2 = 2001;
    // trueの場合1.2倍
    boolean t1 = BaseTime.isBefore(time1);
    boolean t2 = BaseTime.isBefore(time2);
//    System.out.println(t2);
//    double AddDistance1 = distance1 - a;
//    double AddDistance2 = distance2 - a;
//    double AddCharge1 = Math.ceil(AddDistance1/c);
//    double AddCharge2 = Math.ceil(AddDistance2/c);
//    
//    int total1 = b + (int)Math.ceil(AddDistance1/c) * d;
//    int total2 = b + (int)Math.ceil(AddDistance2/c) * d;
//    System.out.println(total1);
//    System.out.println(total2);
//    System.out.println(Math.round(total1 + (total2 * 1.2)));
//    
//    if (t2 == true) {
//    	
//    } else {
//    	
//    }
    	
//    int z = b + 
//    System.out.println(z);
    
    
//    public static void example1(){
//    	double a = 1000;
//        int b = 600;
//        int c = 250;
//        int d = 100;
//        LocalTime BaseTime = LocalTime.of(22, 00, 00);
//        //LocalTime time1 = LocalTime.of(10, 25, 00);
//        LocalTime time2 = LocalTime.of(23, 40, 00);
//        int distance1 = 1500;
//        double distance2 = 2001;
//        // trueの場合1.2倍
//        //boolean t1 = BaseTime.isBefore(time1);
//        boolean t2 = BaseTime.isBefore(time2);
//        double AddDistance1 = distance1 - a;
//        double AddDistance2 = distance2 - a;
//        double AddCharge1 = Math.ceil(AddDistance1/c);
//        double AddCharge2 = Math.ceil(AddDistance2/c);
//        
//        int total1 = b + (int)Math.ceil(AddDistance1/c) * d;
//        int total2 = b + (int)Math.ceil(AddDistance2/c) * d;
//        System.out.println(Math.round(total1 + (total2 * 1.2)));
//        
//        if (t2 == true) {
//        	
//        } else {
//        	
//        }
//      }
    
    
  }
}
