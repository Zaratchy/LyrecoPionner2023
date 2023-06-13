package LyrecoPionner2023.controler;

import LyrecoPionner2023.model.Company;
import LyrecoPionner2023.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CompanyRestControler {

    @Autowired
    private CompanyService companyService;

    public CompanyRestControler(CompanyService companyService) { this.companyService = companyService;}

    @GetMapping( "company/{id}" )
    public Optional<Company> findCompanyById(@PathVariable("id") Long id
    ){
        return companyService.findCompanyById(id);
    }

    @RequestMapping(value = "/companys", method = RequestMethod.GET)
        public List<Company> listCompanys () {
            return companyService.companys();
        }

    @RequestMapping(value = "/companys/create", method = RequestMethod.POST)
        public Company createCompany (@RequestBody Company company){ return companyService.createCompany(company);
        }
    @RequestMapping(value = "/companys/{id}", method = RequestMethod.PUT)
        public Company updateCompany (@RequestBody Company company, @PathVariable("id") @NotNull Long id ){
            return companyService.updateCompany(company, id);
        }

    @RequestMapping(value = "/companys/delete", method = RequestMethod.DELETE)
    public Company company (@RequestBody Company company){ return companyService.deleteCompany(company);}


    }
