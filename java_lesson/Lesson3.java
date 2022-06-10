public class Lesson3 {
    public static void main(String[] args){

            //初期値; 4まで;　1個増加
        for(int i= 0; i <=4; i++){
            System.out.println(i);
        }

            //breakで3になったら終わらせる
        for(int A =0; A <= 4; A++){
            if(A==3){
                break;
            }
            System.out.println(A);
        }

            //continueで「3」をスルーさせる
        for(int B =0; B<=4; B++){
            if(B==3){
                continue;
            }
            System.out.println(B);
        }
            //forのネフト
        for(int x=0; x<=2; x++){
            for(int y=0; y<=2; y++){
                System.out.println(x + "-" +y);
            }
        }

            //配列にfor分でどこまで表示させるか
            //sumに加算させて合計値を表示
        int arr[] = {2,4,6,8,10};
        int sum = 0;

        for(int N =0; N<=4; N++){
            sum += arr[N];
            }
            System.out.println(sum);
    }
}
