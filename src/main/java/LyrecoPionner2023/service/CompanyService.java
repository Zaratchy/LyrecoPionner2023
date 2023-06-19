package LyrecoPionner2023.service;

import LyrecoPionner2023.model.Company;
import exception.CompanyNotFoundException;

import java.util.List;
import java.util.Optional;

public interface CompanyService {

    Optional<Company> findCompanyById(Long id);

    List<Company> companys();

    Company createCompany(Company company);

    Company updateCompany(Company company , Long id);

    Company deleteCompany(Company company);


}
