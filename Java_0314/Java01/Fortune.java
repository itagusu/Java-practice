public class Fortune {
  public static void main(String[] args) {
    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してください");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください");
    String ageString = new java.util.Scanner(System.in).nextLine();
    int age = Integer.parseInt(ageString);
    int fortune = new java.util.Random().nextInt(4);
    fortune++;
    System.out.println(name + "さん(" + age + "歳)の占い結果は");
    if (fortune == 1) {
      System.out.println("大吉です");
    } else if (fortune == 2) {
      System.out.println("中吉です");
    } else if (fortune == 3) {
      System.out.println("吉です");
    } else {
      System.out.println("凶です");
    }
  }

}
