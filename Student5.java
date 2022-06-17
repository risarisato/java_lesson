// クラスとメソッドはpublic
public class Student5 {

    // メンバ変数はprivate→他から代入されては困る
    private String name;
    private int score;

    // クラスとメソッドはpublic
    public Student5(String n){
        name = n;
    }
    
    // クラスとメソッドはpublic
    public void setScore(int s){
        if(0 <= s && s <=100){
            score = s;
        } else {
            System.out.println(name + "さんの点数が範囲外です");
            score = 0;                      
        }
    }
    void display(){
        System.out.println(name + "さん：" + score + "点"); 
    }
}
