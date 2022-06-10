/*
 * voidは戻り値なし
 * Student=Student01＞クラス
 * name＞フィールド
 * calculateAVG・judge>メソッド(関数)
 */

class Student01 {
    String name;

    public double calculateAvg(double[] data){
        double sum = 0;
        for(int i = 0; i<data.length; i++){
            sum += data[i];
        }
        double avg = sum/data.length;
        return avg;//算出して値をreturnで返す
    }

    //judgeメソッドで判定する関数
    public String judge(double avg){
        String result;
        if(avg >= 60){
            result = "合格";
        }else{
            result = "ダメ";
        }
        return result;//代入した値を返す
    }
}


//上記でstudentクラスとフィールドとメソッドの定義は完了です。


//Javaが最初に実行するところは、main()です
public class Lesson4_1{
    public static void main(String[] args){
    //クラス名  ＋　newでインスタンス化で使える  
    Student01 a001 = new Student01();
    a001.name = "sato";
    double[] data = {70, 65, 50, 90, 30};

    double avg = a001.calculateAvg(data);
    String result = a001.judge(avg);

    System.out.println(avg);
    System.out.println(a001.name + " " + result);
    }
}
