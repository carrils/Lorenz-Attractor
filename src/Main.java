public class Main {
    public static void main(String[] args) {
        StdDraw.clear(StdDraw.LIGHT_GRAY);
        StdDraw.setXscale(-25, 25);
        StdDraw.setYscale(  0, 50);
        StdDraw.enableDoubleBuffering();
        Lorenz lorenz1 = new Lorenz(0.0, 20.00, 25.0, StdDraw.BLUE);
        Lorenz lorenz2 = new Lorenz(0.0, 20.01, 25.0, StdDraw.MAGENTA);

        // Use Euler's method to numerically solve ODE
        double dt = 0.001;
        for (int i = 0; i < 50000; i++) {
            lorenz1.update(dt);
            lorenz2.update(dt);
            lorenz1.draw();
            lorenz2.draw();
            StdDraw.show();
            StdDraw.pause(10);
        }
    }
}