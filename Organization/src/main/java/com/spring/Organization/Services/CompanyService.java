package com.spring.Organization.Services;

import com.spring.Organization.Model.Company;
import com.spring.Organization.Repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepo companyRepo;

    public Company saveCompany(Company company) {
        return companyRepo.save(company);
    }
}
