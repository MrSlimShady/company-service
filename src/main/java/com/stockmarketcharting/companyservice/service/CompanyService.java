package com.stockmarketcharting.companyservice.service;

import com.stockmarketcharting.companyservice.entity.Company;
import com.stockmarketcharting.companyservice.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public Company getCompanyDetails(long id) {
        return companyRepository.getById(id);
    }

    public void save(Company company){
        companyRepository.save(company);
    }
}
