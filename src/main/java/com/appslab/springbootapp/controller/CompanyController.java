package com.appslab.springbootapp.controller;

import com.appslab.springbootapp.model.Address;
import com.appslab.springbootapp.model.Company;
import com.appslab.springbootapp.service.CompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CompanyController {
    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("company")
    public void createCompany() {
        Company company = new Company("OpenLab", new Address("Street", "01010 01", "New York", "Zimbabwe"));
        companyService.saveCompany(company);
    }

    @PostMapping("/addCompany")
    public void saveCompany(@RequestBody @Valid Company company) {
        companyService.saveCompany((company));
    }
}
