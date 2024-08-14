package hello.descignpattern.strategy.strategydemo.service.v1;

import org.springframework.stereotype.Component;

@Component
public class BMethodGatewayV1 {
    public void pay() {
        System.out.println("pay - B Method");
    }

    public void cancel() {
        System.out.println("cancel - B Method");
    }
}
