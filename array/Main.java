package array;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> weapon = new ArrayList<String>();
    // ここに、要素を追加するコードを記述する
    weapon.add("木の棒");
    weapon.add("鉄の剣");
    weapon.add("杖");
    // ここに、要素を上書きするコードを記述する
    weapon.set(1,"石斧");
    // ここに、要素を削除するコードを記述する
    weapon.remove(2);
    // 要素数を確認
    weapon.size();
    // 要素のn番目の配列を取得
    weapon.get(1);
    for (String item : weapon) {
        System.out.println(item);
    }
  }
}