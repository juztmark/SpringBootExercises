package com.appslab.springbootapp.service;

import com.appslab.springbootapp.model.Company;
import com.appslab.springbootapp.repository.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public void saveCompany(Company company) {
        companyRepository.save(company);
    }
}
