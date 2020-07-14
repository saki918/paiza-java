package two_dimensional_array;

// 2次元配列を作成する
public class Main {
  public static void main(String[] args) {
      String[] teamA = {"僧侶", "せんし", "魔法使い"};
      System.out.print(teamA[0] + ", ");
      System.out.print(teamA[1] + ", ");
      System.out.print(teamA[2]);
      System.out.println("");
      System.out.println("---");

      String[] teamB = {"勇者", "戦士", "狩人"};
      String[] teamC = {"盗賊", "忍者", "商人"};
      String[] teamD = {"スライム", "ドラゴン", "魔王"};
      String[][] teams = {teamB, teamC, teamD};
      // String[][] teams = {{"勇者", "戦士", "狩人"},{"盗賊", "忍者", "商人"},{"スライム", "ドラゴン", "魔王"}};でも同じ。

      // 最初の[]は{teamB, teamC, teamD}のインデックス番号
      // 2つめは、{teamB, teamC, teamD}の中のインデックス番号
      // teamB[0] 勇者
      System.out.print(teams[0][0] + ", ");
      // teamC[1] 忍者
      System.out.print(teams[1][1] + ", ");
      // teamD[2] 魔王
      System.out.print(teams[2][2]);
      System.out.println("");
      System.out.println("---");
      // 配列の要素の出力 teamsの要素数
      System.out.println(teams.length);
      // 配列の要素の出力 teamsの中の指定された配列[n]の要素数
      // 下の場合、teamCの要素数
      System.out.println(teams[1].length);

      // この下で、forループで、arrayを出力してみよう
      for (int i = 0; i < teams.length ; i++ ) {
        for (int j = 0; j < teams[i].length ; j++ ) { 
        System.out.println(teams[i][j]);
        }
      }
      // ２通り目
      for ( String[] team : teams ) {
        for (String player : team ) {
          System.out.println(player);
        }
      }
      // この下で、配列を作成しよう
      int[][] array = new int[2][3];

      for (int[] item : array) {
          for (int num : item) {
              System.out.print(num);
          }
          System.out.println("");
      }
      // ２通り目
      for (int i = 0; i < array.length; i++) {
        for (int j = 0;  j < array[i].length; j++) {
            //この下で、初期値を指定する
            array[i][j] = 1;
            System.out.print(array[i][j]);
        }
        System.out.println("");
    }
    // 三次元配列
    int[][][] letters =
    {{{0,0,1,1,0,0},
     {0,1,0,0,1,0},
     {1,0,0,0,0,1},
     {1,1,1,1,1,1},
     {1,0,0,0,0,1},
     {1,0,0,0,0,1}},
    {{1,1,1,1,1,0},
     {1,0,0,0,0,1},
     {1,1,1,1,1,0},
     {1,0,0,0,0,1},
     {1,0,0,0,0,1},
     {1,1,1,1,1,0}},
    {{0,1,1,1,1,0},
     {1,0,0,0,0,1},
     {1,0,0,0,0,0},
     {1,0,0,0,0,0},
     {1,0,0,0,0,1},
     {0,1,1,1,1,0}}};

    // ここに、ドットを表示するコードを記述する
    for ( int[][] img : letters ) {
        for (int[] line : img) {
            for (int dot : line) {
                if (dot == 1) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            // 横の列 例{0,0,1,1,0,0}まで表示したら改行
            System.out.println("");
        }
        // 二次元配列のデータが終了したら改行
        /* {{0,0,1,1,0,0},
            {0,1,0,0,1,0},
            {1,0,0,0,0,1},
            {1,1,1,1,1,1},
            {1,0,0,0,0,1},
            {1,0,0,0,0,1}} */
        System.out.println("");
    }
  }
}