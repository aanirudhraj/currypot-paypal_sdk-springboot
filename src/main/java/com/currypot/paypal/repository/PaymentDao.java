package com.currypot.paypal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.currypot.paypal.models.PaymentModel;

public interface PaymentDao extends JpaRepository<PaymentModel, Long> {

}