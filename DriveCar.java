class DriveCar {
    public static void main(String[] args){
    // Carクラスのオブジェクトc1を生成
    Car c1 = new Car();
    
    // 自動車c1のナンバーを2525に設定
    c1.setNo(2525);

    // 速度を30に設定
    c1.run(30);

    // ナンバー、「30」速度を表示
    c1.display();

    // 速度を0に設定
    c1.stop();

    // ナンバー、「0」速度を表示
    c1.display();
    }
}