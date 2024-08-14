package hello.descignpattern.strategy.strategydemo.service.v1;

import hello.descignpattern.strategy.strategydemo.service.PaymentMethodType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PaymentServiceV1Test {

    @Autowired
    PaymentServiceV1 paymentServiceV1;

    @Test
    @DisplayName("A Method 를 이용한 결제")
    void pay_A() {
        paymentServiceV1.pay(PaymentMethodType.A);
    }

    @Test
    @DisplayName("A Method 를 이용한 결제 취소")
    void cancel_A() {
        paymentServiceV1.cancel(PaymentMethodType.A);
    }

    @Test
    @DisplayName("B Method 를 이용한 결제")
    void pay_B() {
        paymentServiceV1.pay(PaymentMethodType.B);
    }

    @Test
    @DisplayName("B Method 를 이용한 결제 취소")
    void cancel_B() {
        paymentServiceV1.cancel(PaymentMethodType.B);
    }
}