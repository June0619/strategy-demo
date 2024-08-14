package hello.descignpattern.strategy.strategydemo.service.v1;

import org.springframework.stereotype.Component;

@Component
public class AMethodGatewayV1 {
    public void pay() {
        System.out.println("pay - A Method");
    }

    public void cancel() {
        System.out.println("cancel - A Method");
    }
}
