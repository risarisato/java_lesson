public class Student3 extends Person3 {
    private int stuNo;

    public Student3(String name){
        this(name, 999);
    }
    public Student3(String name, int stuNo){
        super(name);
        this.stuNo = stuNo;
    }

    public void display(){
        // スーパクラスのdisplay()が呼び出される
        super.display();
        System.out.println("学籍番号：" + stuNo);
    }
}
