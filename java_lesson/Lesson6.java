class Lesson6 {
    public static void main(String[] args){
        int price = Integer.parseInt(args[0]);
        double rate = 0.10;     //　消費税率10％
        int discount;       // 続けて書く場合int discount, amount;
        int amount;

        //　else-if構文
        if( price >= 5000 ){    //　5000円以上だったら
            discount = 500;    //   500値引
        }else if (price >= 3000) {  // 3000円以上だったら 
            discount = 300;         // 300円値引
        } else {
            discount = 0;
        }

        amount = (int)((price - discount) * (1 + rate));
        System.out.println("値引金額" + discount + "円");
        System.out.println("税込金額" + amount + "円");
    }
}

