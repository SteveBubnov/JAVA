package HomeWork3Week.MathCore;

public class Division extends Operations implements PrintResult {
    private String sign = "/";

    public String getSign() {
        return sign;
    }

    @Override
    public float calculate(float a, float b) {
        return a / b;
    }
}