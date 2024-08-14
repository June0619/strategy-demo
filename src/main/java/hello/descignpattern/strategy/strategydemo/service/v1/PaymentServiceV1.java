package hello.descignpattern.strategy.strategydemo.service.v1;

import hello.descignpattern.strategy.strategydemo.service.PaymentMethodType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceV1 {

    private final AMethodGatewayV1 aMethodGateway;
    private final BMethodGatewayV1 bMethodGateway;

    @Autowired
    public PaymentServiceV1(AMethodGatewayV1 aMethodGateway, BMethodGatewayV1 bMethodGateway) {
        this.aMethodGateway = aMethodGateway;
        this.bMethodGateway = bMethodGateway;
    }

    public void pay(PaymentMethodType method) {
        if (method == PaymentMethodType.A) {
            aMethodGateway.pay();
        } else if (method == PaymentMethodType.B) {
            bMethodGateway.pay();
        }
    }

    public void cancel(PaymentMethodType methodType) {
        if (methodType == PaymentMethodType.A) {
            aMethodGateway.cancel();
        } else if (methodType == PaymentMethodType.B) {
            bMethodGateway.cancel();
        }
    }

}


