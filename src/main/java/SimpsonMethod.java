public class SimpsonMethod {
    Functions functions = new Functions();
    DrawChart drawChart = new DrawChart();
    OutputFunctions outputFunctions = new OutputFunctions();

    public void startMethod(double down, double up, double e, int number) {
        if (down > up) {
            double tmp = down;
            down = up;
            up = tmp;
        }
        double a, answer, r, I, step, x0, xn, sum_1, sum_2;
        long n = 2;
        a = down;
        answer = 0;
        r = e + 1;
        I = functions.getI(down, up, number);

        while (r > e) {
            n *= 2;
            step = (up - down) / n;

            x0 = functions.f(down, number);
            a += step;
            xn = functions.f(up, number);
            sum_1 = 0;
            sum_2 = 0;

            for (int i = 1; i < n; i++) {
                if (i % 2 == 0)
                    sum_2 += functions.f(a, number);
                else
                    sum_1 += functions.f(a, number);
                a += step;
            }
            answer = step * (x0 + xn + 2 * sum_2 + 4 * sum_1) / 3;
            r = Math.abs(I - answer);
            a = down;
        }
        System.out.println("Решение методом Симпсона:");
        outputFunctions.outAnswer(e, answer, I, r, n);
        drawChart.draw(down, up, number);
    }
}
