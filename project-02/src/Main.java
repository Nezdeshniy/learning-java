import processing.core.PApplet;

public class Main extends PApplet {

    int count = 40;

    float[] x;
    float[] y;
    float[] speed;
    float[] angle;
    float[] R;

    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        x = new float[count];
        y = new float[count];
        speed = new float[count];
        angle = new float[count];
        R = new float[count];

        for (int i = 0; i < count; i++) {
            x[i] = random(0, width);
            y[i] = random(-height, 0);
            speed[i] = random(0.5f, 3.5f);
            angle[i] = random(0, TWO_PI);
            R[i] = random(10, 40);
        }
    }

    @Override
    public void draw() {
        background(0);
        stroke(255);

        for (int i = 0; i < count; i++) {
            pushMatrix();
            translate(x[i], y[i]);
            rotate(angle[i]);

            float r = R[i];
            line(-r, 0, r, 0);
            line(0, -r, 0, r);

            float d = r / sqrt(2);
            line(-d, -d, d, d);
            line(-d, d, d, -d);

            popMatrix();

            angle[i] += 0.03f;
            y[i] += speed[i];

            if (y[i] > height + R[i]) {
                y[i] = -R[i];
                x[i] = random(0, width);
                speed[i] = random(0.5f, 3.5f);
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
