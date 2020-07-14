import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 標準入力の仕方
        Scanner sc = new Scanner(System.in);
        // 文字列の入力 (１つのデータのみ)
        String data = sc.next();
        // 文字列の入力 (１行のみ)
        String name = sc.nextLine();
        // 整数の場合
        int i = sc.nextInt();
        System.out.println("hello " + data + i);
        // ここに文字列を分割するコードを記述する(,で分割されている場合)
        String[] array = data.split(",");
        // ここに文字列を分割するコードを記述する(半角スペースで分割されている場合)
        String[] array1 = data.split(" ");
         // ここに文字列を分割するコードを記述する(/で分割されている場合)
        String[] array2 = data.split("/");
        // hasNextLine()は次に読み込む行があるか確認するメソッド
        while (sc.hasNextLine()) {
            String line = sc.next();
            System.out.println(line + "が現れた");
        }
        // カンマで分割して、配列に代入
        String line = sc.next();
        String lines[] = line.split(",");

        // 配列の要素をランダムに選ぶ
        int num = (int)(Math.random()* lines.length);

        // ランダムに選んだ配列の要素を出力
        System.out.println(lines[num]);
    }
}