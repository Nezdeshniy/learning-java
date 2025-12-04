import processing.core.PApplet;

public class Main extends PApplet {

    /// Полями
    /// Глобальными переменными
    public static float initValue;
    public static float deltaY; // null
    public static float y;
    public static float deltaX;
    public static float x;

    /// 1
    @Override
    public void settings() {
        size(800, 600);
    }

    /// 2
    @Override
    public void setup() {
        initValue = PI / 8;
        deltaY = 1;
        y = 0;
        deltaX = 10;
        x = 0;
    }

    /// 3
    @Override
    public void draw() {
        background(0);
        stroke(255);
        translate(width / 2f, y);
        rotate(initValue);
        float R = 30;

        line(-R, 0, R, 0);
        line(0, -R, 0, R);

        float d = R / sqrt(2);

        line(-d, -d, d, d);
        line(-d, d, d, -d);


        initValue += 0.06f;
        y += deltaY;

        if (y > 500) {
            y = 0;
        }
    }


    public static void main(String[] args) {
        PApplet.main("Main");
    }
}