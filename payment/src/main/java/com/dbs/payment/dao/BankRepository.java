package com.dbs.payment.dao;

import org.springframework.data.repository.CrudRepository;

import com.dbs.payment.model.Bank;

public interface BankRepository extends CrudRepository<Bank, String> {

}
