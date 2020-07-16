package class1;

// インスタンスを実体化しよう

public class Main {
  public static void main(String[] args) {
      // この下に、インスタンスを実体化し、メソッド呼び出しを記述する
      Greeting greeting1 = new Greeting("paiza");
      // オブジェクトでメソッドの呼び出し
      greeting1.sayHello();

      // 文字列.length()は文字列の文字数を返し、配列.lengthは配列の要素の数を返します。
      // Stringと配列はオブジェクトとして扱える。
      // intとdoubleはオブジェクトとして扱えない。
      String text = new String("hello java");
        //この下に、文字数をテキストとして表示する処理を記述する
        System.out.println(text.length());

        int[] numbers = new int[4];
        for (int item : numbers ) {
            System.out.print(item);
        }
        System.out.println("");
        System.out.println(numbers.length);

        // この下に、合計得点を戻り値として返すsumメソッドを記述する
        // 国語 = 70点、算数 = 43点
        // Gakuseiのsumメソッドにstaticが修飾されているので、
        // オブジェクトを作らなくても呼び出せる。
        int total = Gakusei.sum(70, 43);
        System.out.println("合計は" + total + "点です。");
  }
}

// クラスの先頭は大文字
class Greeting {
  // メンバー変数は、オブジェクトが持つ変数です。
  // privateは定義されたクラス内でしか使用できない。
  private String myName;

  // コンストラクタ
  public Greeting(String name) {
      myName = name;
  }

  public void sayHello() {
      System.out.println("hello " + myName);
  }
}

class Gakusei {
  // staticが付いたメンバー変数やメソッドは、全てのインスタンスで共通して利用できます。また、オブジェクトを作らなくてもアクセスできます。
  // この下に、合計得点を戻り値として返すsumメソッドを記述する
  public static int sum(int kokugo, int sansu) {
      return kokugo + sansu ;
  }
}