package LyrecoPionner2023.service.impl;

import LyrecoPionner2023.model.Company;
import LyrecoPionner2023.repository.CompanyRepository;
import LyrecoPionner2023.service.CompanyService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;


    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Optional<Company> findCompanyById(Long id) {
        final Optional<Company> optionalCompany = this.companyRepository.findById(id);

        if (optionalCompany.isPresent()) {
            final Company company = optionalCompany.get();
            return companyRepository.findById(id);
        }
        return optionalCompany;
    }

    @Override
    public List<Company> companys() {
        return companyRepository.findAll();

    }

    @Override
    public Company createCompany(Company company) {
        companyRepository.save(company);
        return company;
    }
    @Override
    public Company updateCompany(Company company, Long id) {
        company.setId(id);
        return  companyRepository.save(company);
    }

    @Transactional
    public Company deleteCompany(Company company) {
        companyRepository.delete(company);
        return company;
    }


}











