package com.stockmarketcharting.companyservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "company")
public class Company {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long companyId;
    private String companyName;
    private float companyTurnover;
    private String companyCEO;
    private String boardOfDirectors;
    private String listedExchanges;
    private String sector;
    private String companyDesc;
    private String companyCode;

}
