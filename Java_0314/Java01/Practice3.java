public class Practice3 {
  public static void main(String[] args) {
    // 3_6
    System.out.println("[数当てゲーム]");
    int ans = new java.util.Random().nextInt(10);
    System.out.println("0~9の数字を入力してください");
    for (int i = 0; i < 5; i++) {
      int num = new java.util.Scanner(System.in).nextInt();
      if (num == ans) {
        System.out.println("あたり");
        break;
      } else {
        System.out.println("はずれ");
        System.out.println("もう一度入力してください");
      }
    }
    System.out.println("ゲームを終了します");
    

    // 3_5
    // System.out.print("1検索:2:登録3:変更4:削除 ");
    // int selected = new java.util.Scanner(System.in).nextInt();
    // switch (selected) {
    // case 1:
    // System.out.println("検索");
    // break;
    // case 2:
    // System.out.println("登録");
    // break;
    // case 3:
    // System.out.println("変更");
    // break;
    // case 4:
    // System.out.println("削除");
    // break;
    // default:
    // System.out.println("ありません");
    // break;
    // }

    // 3_3
    // int isHungry = 1;
    // String food = "焼肉";
    // System.out.println("こんにちは");
    // if (isHungry == 0) {
    // System.out.println("お腹いっぱいです");
    // } else {
    // System.out.println("お腹空きました" + food + "食べたいです");
    // }
    // System.out.println("ご馳走様でした");
  }
}

// ３−１
/*
 * weight == 60;
 * age1 + age2 >= 60;
 * age % 2 == 1;
 * name.equals("湊")
 */
