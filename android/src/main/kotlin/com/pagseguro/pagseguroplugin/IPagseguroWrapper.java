package com.pagseguro.pagseguroplugin;

import com.pagseguro.pagseguroplugin.domain.PaymentRequestData;
import com.pagseguro.pagseguroplugin.domain.PaymentResult;

public interface IPagseguroWrapper {

    PaymentResult createPayment(PaymentRequestData paymentRequestData);

}
