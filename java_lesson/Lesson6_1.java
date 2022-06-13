class Lesson6_1 {
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        switch(num){
            case 1:
                System.out.println("入場料金:8700円");
                break;  //breakがないとすべて実行される
            case 2:
                System.out.println("入場料金:7700円");
                break;
            case 3:
                System.out.println("入場料金:5000円");
                break;
            default:
                System.out.println("1:一般, 2:中・高校生, 3:小学生以下");
        }
    }
}
