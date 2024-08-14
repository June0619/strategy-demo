package hello.descignpattern.strategy.strategydemo.service.origin;

public class AddStrategy implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
