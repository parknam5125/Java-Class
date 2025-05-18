abstract class Calculator {
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public abstract void sum();
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
}

class CalculatorA extends Calculator {
    public void sum(){
        System.out.println("+ sum :" + (this.left + this.right));
    }
    public void avg(){
        System.out.println("+ avg :" + (this.left + this.right) / 2);
    }
}

class CalculatorB extends Calculator {
    public void sum(){
        System.out.println("- sum :" + (this.left + this.right));
    }
    public void avg(){
        System.out.println("- avg :" + 1 / (((1.0 / this.left) + (1.0 / this.right)) / 2));
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorA c1 = new CalculatorA();
        c1.setOprands(10, 20);
        c1.run();

        CalculatorB c2 = new CalculatorB();
        c2.setOprands(10, 20);
        c2.run();
    }
}
