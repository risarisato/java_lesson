class Lesson5 {
    public static void main(String[] args){

        int price = Integer.parseInt(args[0]);
        double rate = 0.08;
        int amount;

        //ここで型変換している
        amount = (int)(price * (1 + rate));
        System.out.println("型変換した税込価格は：" + amount + "円");

        /*
        コマンドラインから入力した文字データをint型に変換
        「aとb」がString[]のargs配列に入る
        */

        //文字列を四則演算できるint型に変換
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        System.out.println("a= " + a + ", b =" +b);
        System.out.println("a + b=" + (a + b));
        System.out.println("a - b=" + (a - b));
        System.out.println("a * b=" + (a * b));
        System.out.println("a / b=" + (a / b));
        System.out.println("a % b=" + (a % b));
    }
}
