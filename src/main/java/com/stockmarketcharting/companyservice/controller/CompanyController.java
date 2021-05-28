package com.stockmarketcharting.companyservice.controller;

import com.stockmarketcharting.companyservice.entity.Company;
import com.stockmarketcharting.companyservice.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class CompanyController {

    @Autowired
    CompanyService companyService;
    @GetMapping("/details/{id}")
    public Company getCompanyDetails(@PathVariable("id") Long id){
        return companyService.getCompanyDetails(id);
    }

    @GetMapping("/price")
    public String getCompanyStockPrice(){

        return "BTC-Bitcoin 29L";
    }

    @GetMapping("/matching")
    public String getMatchingCompanies(){
        return "BTC";
    }

    @GetMapping("/ipo")
    public String getCompanyIPODetails(){
        return "BTC launch-2008";
    }



}
