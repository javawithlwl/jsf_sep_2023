package com.careerit.cj.day27;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

enum PaymentMethod{
    CREDIT_CARD,UPI,AUTO_DEBIT
}
record PaymentInitiator(String accNumber,  PaymentMethod paymentMethod){}
record AccountPaymentProfile(String accNumber, String name, String city){}
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Payment{
    private String accNumber;
    private double amount;
}
public class PaymentExample {

    public static void main(String[] args) {
        PaymentInitiator initiator1 = new PaymentInitiator("SB1001", PaymentMethod.AUTO_DEBIT);
        PaymentInitiator initiator2 = new PaymentInitiator("SB1002", PaymentMethod.UPI);
        PaymentInitiator initiator3 = new PaymentInitiator("SB1003", PaymentMethod.CREDIT_CARD);

        List<PaymentInitiator> initiators = List.of(initiator1,initiator2,initiator3);

        AccountPaymentProfile profile1 = new AccountPaymentProfile("SB1001", "Krish", "HYD");
        AccountPaymentProfile profile2 = new AccountPaymentProfile("SB1002", "Manoj", "BLR");
        AccountPaymentProfile profile3 = new AccountPaymentProfile("SB1003", "Charan", "HYD");
        AccountPaymentProfile profile4 = new AccountPaymentProfile("SB1004", "Manoj", "BLR");
        List<AccountPaymentProfile> profiles = List.of(profile1,profile2,profile3,profile4);

        Payment payment1 = new Payment("SB1001", 5000);

        PaymentInitiator paymentInitiator = initiators.stream()
                                          .filter(e->e.accNumber().equals(payment1.getAccNumber()))
                                          .findAny()
                                          .orElseThrow();
        AccountPaymentProfile accountPaymentProfile = profiles.stream()
                .filter(e->e.accNumber().equals(payment1.getAccNumber()))
                .findAny()
                .orElseThrow();

        makePayment(payment1,paymentInitiator,accountPaymentProfile);

       /* Payment payment2 = new Payment("SB1004", 5000);*/

    }

    private static void makePayment(Payment payment1, PaymentInitiator paymentInitiator, AccountPaymentProfile accountPaymentProfile) {
        System.out.println("Payment is initiated for :"+payment1.getAccNumber());
        System.out.println("Payment is initiated by :"+paymentInitiator.paymentMethod());
        System.out.println("Payment is made by :"+accountPaymentProfile.name());
        System.out.println("Payment is made for :"+payment1.getAmount());
    }
}
