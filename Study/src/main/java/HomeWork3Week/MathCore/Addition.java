package HomeWork3Week.MathCore;

public class Addition extends Operations implements PrintResult {


    @Override
    public float calculate(float a, float b) {
        return a + b;
    }

    public String getSign() {
        String sign = "+";
        return String.valueOf(sign);
    }

}
