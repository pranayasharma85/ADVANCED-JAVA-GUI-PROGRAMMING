import java.io.Serializable;

public class runtimeJavabean implements Serializable {
    private double principal;
    private double rate;
    private double time;

    public runtimeJavabean() {}

    public runtimeJavabean(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double calculate() {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        runtimeJavabean calculator = new runtimeJavabean(1000, 5, 2);
        System.out.println("Simple Interest: " + calculator.calculate());
    }
}
