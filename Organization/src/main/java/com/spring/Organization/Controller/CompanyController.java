package com.spring.Organization.Controller;

import com.spring.Organization.Model.Company;
import com.spring.Organization.Services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    private int nextId = 1;
    @PostMapping("/company")
    public ResponseEntity<Company> saveCompany(@RequestBody Company company) {
        company.setCId(nextId++);
        Company savedComp = companyService.saveCompany(company);
        return new ResponseEntity<>(savedComp, HttpStatus.CREATED) ;
    }
}
