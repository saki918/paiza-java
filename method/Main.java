package method;

  // 九九の表を作成してみよう

public class Main {
  public static void main(String[] args) {
    for (int i = 1; i <= 9; i++) {
      for (int num = 1; num <= 9; num++) {
          System.out.print(multi(i, num));
          if (num < 9) {
              System.out.print(", ");
          } else {
              System.out.println("");
          }
      }
    }
    String[] team = {"勇者", "戦士", "魔法使い"};
    int enemy_hp = 300;
    for (String person : team) {
        // 以下の行を、敵の体力を減少させるコードに書き換える
        enemy_hp -= attack(person);
        System.out.println("敵のHPは残り" + enemy_hp + "です");
    }

    String[] enemies = {"スライム", "モンスター", "ドラゴン"};

        for (String enemy : enemies) {
            String player = "勇者";
            System.out.println(player + "は" + enemy + "を攻撃した");
        }
        // ここのplayerはforのスコープ外なのでエラーになる。
        // System.out.println(player + "はすべての敵を倒した");
    
  }

  public static int multi(int x, int y) {
      return x * y;
  }

  public static int attack(String player) {
    System.out.println(player + "はスライムを攻撃した");
    int hit = (int) (Math.random() * 10 + 1) * 10;
    System.out.println(hit + "のダメージを与えた");
    return hit;
  }
}
