//クラス名が「Studendt」大文字
class Student {
    String name = "kawai";//フィールド

    //合計して平均点を出す＞メソッド
    public void calculateAvg(int math, int english){
        System.out.println((math + english)/2);
    }
}

public class Lesson4 {
    public static void main(String[] args){
        //studentのクラス名　＞　a001オブジェクト名
        Student a001 = new Student();//newでインスタンス化
        Student a002 = new Student();
        a001.name = "kawai";
        a002.name = "togashi";

        //calculateAvgメソッド＝関数
        a001.calculateAvg(90,80);

        System.out.println(a001.name);
        System.out.println(a002.name);
   
    }
}

/*
 * Student＞クラス
 * name＞フィールド
 * calculateAVG＞メソッド(関数)
 */