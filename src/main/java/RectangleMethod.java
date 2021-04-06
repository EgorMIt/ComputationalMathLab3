public class RectangleMethod {
    Functions functions = new Functions();
    DrawChart drawChart = new DrawChart();
    OutputFunctions outputFunctions = new OutputFunctions();

    public void startMethodMid(double down, double up, double e, int number) {
        if (down > up) {
            double tmp = down;
            down = up;
            up = tmp;
        }
        double a = down, step, sum = 0, r = e + 1, I = functions.getI(down, up, number);
        long n = 2;

        while (r > e) {
            n *= 2;
            step = (up - a) / n;
            sum = 0;
            for (int i = 0; i < n; i++) {
                sum += functions.f(a + step / 2, number);
                a += step;
            }
            sum = sum * step;
            r = Math.abs(I - sum);
            a = down;
        }

        System.out.println("Решение методом средних прямоугольников:");
        outputFunctions.outAnswer(e, sum, I, r, n);
    }

    public void startMethodLeft(double down, double up, double e, int number) {
        if (down > up) {
            double tmp = down;
            down = up;
            up = tmp;
        }
        double a = down, step, sum = 0, r = e + 1, I = functions.getI(down, up, number);
        long n = 2;

        while (r > e) {
            n *= 2;
            step = (up - a) / n;
            sum = 0;
            for (int i = 0; i < n; i++) {
                sum += functions.f(a, number);
                a += step;
            }
            sum = sum * step;
            r = Math.abs(I - sum);
            a = down;
        }

        System.out.println("Решение методом левых прямоугольников:");
        outputFunctions.outAnswer(e, sum, I, r, n);
    }

    public void startMethodRight(double down, double up, double e, int number) {
        if (down > up) {
            double tmp = down;
            down = up;
            up = tmp;
        }
        double a = down, step, sum = 0, r = e + 1, I = functions.getI(down, up, number);
        long n = 2;

        while (r > e) {
            n *= 2;
            step = (up - a) / n;
            a += step;
            sum = 0;
            for (int i = 0; i < n; i++) {
                sum += functions.f(a, number);
                a += step;
            }
            sum = sum * step;
            r = Math.abs(I - sum);
            a = down;
        }

        System.out.println("Решение методом правых прямоугольников:");
        outputFunctions.outAnswer(e, sum, I, r, n);
    }
}
