package LyrecoPionner2023.controler;


import LyrecoPionner2023.model.Licence;
import LyrecoPionner2023.service.LicenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class LicenceRestControler {

    @Autowired
    private LicenceService licenceService;

    public LicenceRestControler(LicenceService licenceService) {
        this.licenceService = licenceService;
    }

    @GetMapping( "licence/{id}" )
    public Optional<Licence> findLicenceById(@PathVariable("id") Long id
    ){
        return licenceService.findLicenceById(id);
    }

    @RequestMapping(value = "/licences", method = RequestMethod.GET)
    public List<Licence> listLicences(){
        return licenceService.licences();
    }

    @RequestMapping(value = "/licences/create", method = RequestMethod.POST)
    public Licence createLicence(@RequestBody Licence licence){
        return licenceService.createLicence(licence);
    }
    @RequestMapping(value = "/licences/{id}", method = RequestMethod.PUT)
    public Licence updateLicence(@RequestBody Licence licence , @PathVariable("id") @NotNull Long id ){
        return licenceService.updateLicence(licence,id);
    }

    @RequestMapping(value = "/licences/delete", method = RequestMethod.DELETE)
    public Licence licence(@RequestBody Licence licence) {
        return licenceService.deleteLicence(licence);
    }

}
