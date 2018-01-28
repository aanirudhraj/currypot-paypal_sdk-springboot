package com.currypot.paypal.service;

import java.util.List;

import com.currypot.paypal.models.PaymentModel;

public interface PaymentService {
	List<PaymentModel> get();
	PaymentModel saveOrUpdate(PaymentModel paymentModel);
}
