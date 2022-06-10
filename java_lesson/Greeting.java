class Greeting{
    public static void main(String args[]){
        int x = 10;
        int y = 2000;

        System.out.println(x +=99);

        System.out.println(y ==10 || y== 1000);
        System.out.println(y >=10 && x<= 1000);
        System.out.println(y >=5 && x<= 10);
        System.out.println(x > y);
        System.out.println(y > x);
        System.out.println(y == x);
        System.out.println(y != x);

        String[][] arr222 = {{"ABC","DNA"},{"JAVA","python"}};

        System.out.println(arr222[0][0]);
        System.out.println(arr222[0][1]);
        System.out.println(arr222[1][0]);
        System.out.println(arr222[1][1]);



        //2次元配列の面倒くさい書き方
        String[][] arr22;
        arr22 = new String[2][2];

        arr22[0][0] = "hosi";
        arr22[0][1] = "sukai";
        arr22[1][0] = "eiho";
        arr22[1][1] = "hoge";


        System.out.println(arr22[0][0]);
        System.out.println(arr22[0][1]);
        System.out.println(arr22[1][0]);
        System.out.println(arr22[1][1]);


        
        //配列
        String[] arr00 = {"斎藤","神奈川","同病相憐れむ"};

        System.out.println(arr00[0]);
        System.out.println(arr00[1]);
        System.out.println(arr00[2]);

        // 面倒くさい配列の書き方
        String[] arr;           //配列をString型で宣言する
        arr = new String[3];    //newで格納するイメージ

        arr[0]="asdf";
        arr[1]="jkl;";
        arr[2]="ジャヴァグループ";

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int var_a = 10;
        int var_b = 11111;
        boolean var_bool;

        var_bool = (var_a < var_b);

        System.out.println(var_bool);


        int var = 9999;
        System.out.println(var);

        char varA = 'A'; //文字1つだけはchar
        String varB = "hello world"; //Stringはダブルコーテで大文字

        System.out.println(varA);
        System.out.println(varB);


        double var009 = 1.23456789;
        float var008 = 1.23456F;

        System.out.println(var009);
        System.out.println(var008);

        byte var001 = 100;
        short var002 = 12345;
        int var003 = 1234567890;
        long var004 = 123456789000002L;

        System.out.println(var001);
        System.out.println(var002);
        System.out.println(var003);
        System.out.println(var004);

        System.out.println("test");
        System.out.println("abc");
        System.out.println("hoge");
        
    }
}