public class TrapezoidMethod {
    Functions functions = new Functions();
    DrawChart drawChart = new DrawChart();
    OutputFunctions outputFunctions = new OutputFunctions();

    public void startMethod(double down, double up, double e, int number) {
        if (down > up) {
            double tmp = down;
            down = up;
            up = tmp;
        }
        drawChart.draw(down, up, number);
        double I = functions.getI(down, up, number), step, save_down = down, y0, yn, sum, r = e + 1, answer = 0;
        long n = 2;
        //double R = fun.IfMax(down,up,number)*Math.pow((up-down),3)/12/Math.pow(n,2);

        while (r > e) {
            n *= 2;
            step = (up - down) / n;
            y0 = functions.f(down, number);
            down += step;
            yn = functions.f(up, number);
            sum = 0;

            for (int i = 1; i < n; i++) {
                sum += functions.f(down, number);
                down += step;
            }

            answer = step * ((y0 + yn) / 2 + sum);
            r = Math.abs(I - answer);
            down = save_down;
        }

        System.out.println("Решение методом трапеций:");
        outputFunctions.outAnswer(e, answer, I, r, n);
    }
}
