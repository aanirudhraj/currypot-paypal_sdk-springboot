package com.currypot.paypal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.currypot.paypal.models.PaymentModel;
import com.currypot.paypal.repository.PaymentDao;

@Service
public class PaymentServiceImpl {
	
	@Autowired
	PaymentDao paymentDao ;
	
	    public List<PaymentModel> getAllPayments() {
	        List<PaymentModel> paymentModelList = paymentDao.findAll();
	        return paymentModelList;
	    }

	    public PaymentModel saveOrUpdate(PaymentModel paymentModel) {
	        return paymentDao.save(paymentModel) ;
	    }


}
