# 261200-Lab01
public class Julylab1{
    public static void main(String[] args) {
        Turtle ice = new Turtle();
        //โค้งขวา
        for (int i = 0; i < 90; i++) {
            ice.speed(1);
            ice.forward(2);
            ice.right(2);
        }
        //เส้นลำตัวล่าง
        ice.forward(90);

        //โค้งซ้าย
        for (int i = 0; i < 90; i++) {
            ice.speed(1);
            ice.forward(2);
            ice.right(2);
        }

        //เส่้นตา
        ice.left(90);
        ice.forward(50);

        //ตาปูซ้าย
        for (int i = 0; i < 72 ; i++) {
            ice.speed(1);
            ice.forward(1);
            ice.left(5);
        }

        //กลับมาวาดตาขวา
        ice.up();
        ice.home();
        ice.down();
        ice.left(90);
        ice.forward(50);

        //ตาขวา
        for(int i = 0; i < 72; i++) {
            ice.speed(1);
            ice.forward(1);
            ice.right(5);
        }

        //เส้นลำตัวบน
        ice.home();
        ice.right(180);
        ice.forward(90);

        //วาดเเขนซ้าย
        for(int i = 0; i < 25; i++) {
            ice.speed(1);
            ice.forward(2);
            ice.left(2);
        }

        //กล้ามปูซ้าย
        ice.right(70);
        ice.forward(50);

        ice.left(35);
        ice.forward(40);
        ice.right(160);
        ice.forward(30);
        ice.left(60);
        ice.forward(30);
        ice.right(160);
        ice.forward(40);

        ice.up();
        ice.left(45);
        ice.forward(50);

        ice.right(90);
        ice.forward(30);

        ice.down();
        ice.right(60);
        ice.forward(50);

        ice.up();
        ice.left(90);
        ice.forward(50);

        //วาด-ขาอันที่ 3 ซ้าย
        ice.left(100);
        ice.down();
        ice.forward(50);

        //กลับมาที่ขาขวา
        ice.up();
        ice.home();
        ice.down();

        for(int i = 0; i < 25; i++) {
            ice.speed(1);
            ice.forward(2);
            ice.right(2);
        }

        //กล้ามปูขวา
        ice.left(70);
        ice.forward(50);

        ice.right(35);
        ice.forward(40);
        ice.left(160);
        ice.forward(30);
        ice.right(60);
        ice.forward(30);
        ice.left(160);
        ice.forward(40);

        ice.up();
        ice.right(45);
        ice.forward(50);

        ice.left(90);
        ice.forward(30);

        ice.down();
        ice.left(60);
        ice.forward(50);

        ice.up();
        ice.right(90);
        ice.forward(50);

        //วาดขาอันที่ 3 ขวา
        ice.right(100);
        ice.down();
        ice.forward(50);

}
}
