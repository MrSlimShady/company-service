package com.stockmarketcharting.companyservice.repository;

import com.stockmarketcharting.companyservice.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CompanyRepository extends JpaRepository<Company,Long> {


//    Company getByName(String name);

}
