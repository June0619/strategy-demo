package hello.descignpattern.strategy.strategydemo.service.origin;

public class MainApp {

    public static void main(String[] args) {

        Context context = new Context();
        context.setStrategy(new AddStrategy());
        context.execute(10, 5);

        context.setStrategy(new SubtractStrategy());
        context.execute(10, 5);

    }
}
