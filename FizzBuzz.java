public class FizzBuzz {
  public static void main(String[] args) {
    int i = 0;
    int loopCount = 100;
    int numFizz = 3;
    int numBuzz = 5;
    String strFizz = "Fizz";
    String strBuzz = "Buzz";
    
    // 問１
    for (i = 1; i <= loopCount; i++ ) {
    // 問２
      if (i % (numFizz * numBuzz) == 0 ) {
        System.out.println(strFizz + strBuzz);
    // 問３
      } else if (i % numFizz == 0) {
        System.out.println(strFizz);
    // 問４
      } else if (i % numBuzz == 0) {
        System.out.println(strBuzz);
      } else {
        System.out.println(i);
      }
    }
  }
}


// ～解説～

// 'FizzBuzz'という名前のクラスを定義しています。
// public class FizzBuzz {
// 'main'メソッドを定義しています。
//   public static void main(String[] args) {
// 'i'に0　'loopCount'に100　'numFizz'に3　'numBuzz'に5　'strFizz'にFizz　'strBuzz'にBuzzを代入します。　*strとはstringの略で文字列という意味
//     int i = 0;
//     int loopCount = 100;
//     int numFizz = 3;
//     int numBuzz = 5;
//     String strFizz = "Fizz";
//     String strBuzz = "Buzz";
// forでループを開始します。ループは、i が1から loopCount まで1ずつ増加しながら繰り返されます。
//     for (i = 1; i <= loopCount; i++ ) {
//       if 文を使用して、FizzBuzzのルールに従って処理を行います。
//       最初に、i が3と5の両方で割り切れる場合、 strFizz と strBuzz を連結して "FizzBuzz" を出力します。
//       次に、i が3で割り切れる場合、strFizz を出力します。
//       その次に、i が5で割り切れる場合、strBuzz を出力します。
//       最後に、いずれの条件にも当てはまらない場合は、 i をそのまま出力します。
//       if (i % (numFizz * numBuzz) == 0 ) {
//         System.out.println(strFizz + strBuzz);
//       } else if (i % numFizz == 0) {
//         System.out.println(strFizz);
//       } else if (i % numBuzz == 0) {
//         System.out.println(strBuzz);
//       } else {
//         System.out.println(i);
//       }
//     }
//   }
// }