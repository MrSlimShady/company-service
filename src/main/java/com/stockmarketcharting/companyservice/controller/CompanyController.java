package com.stockmarketcharting.companyservice.controller;

//import com.stockmarketcharting.companyservice.entity.Company;
//import com.stockmarketcharting.companyservice.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class CompanyController {

//    @Autowired
//    CompanyService companyService;
//    @GetMapping("/details/")
//    public Company getCompanyDetails(){
//
//
//
//        return companyService.getCompanyDetails(1);
//    }

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
