package dev.sandeep.EcomPaymentService.service;

import com.razorpay.RazorpayException;
import dev.sandeep.EcomPaymentService.dto.PaymentResponse;

public interface PaymentService {
    String  doPayment(String email, String phone, Long amount, String orderId) throws RazorpayException;
}
