package hello.descignpattern.strategy.strategydemo.service.origin;

public class TemplateCallbackApp {

    public static void main(String[] args) {
        Strategy strategy = (a, b) -> a * 10 + b * 20;
        Context context = new Context();

        context.setStrategy(strategy);
        context.execute(10, 5);
    }
}
