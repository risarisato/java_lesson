// 設計図をつくるコンパイルして終わりになる
class Car {
    // メンバ変数(データ型・変数名)
    int no;
    int speed;

    // メソッド関数(操作・処理)
    void setNo(int n) {
        no = n;
    }

    void run(int s) {
        speed = s;
    }

    void stop() {
        speed = 0;
    }

    void display() {
        System.out.println("ナンバー" + no + "の速度は" + speed + "です");
    }
}
