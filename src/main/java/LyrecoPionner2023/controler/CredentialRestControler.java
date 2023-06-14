package LyrecoPionner2023.controler;

import LyrecoPionner2023.model.Credential;
import LyrecoPionner2023.service.CredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CredentialRestControler {

    @Autowired
    private CredentialService credentialService;

    public CredentialRestControler(CredentialService credentialService) {
        this.credentialService = credentialService;
    }

    @GetMapping( "credential/{id}" )
    public Optional<Credential> findCredentialById(@PathVariable("id") Long id
    ){
        return credentialService.findCredentialById(id);
    }

    @RequestMapping(value = "/credentials", method = RequestMethod.GET)
    public List<Credential> listCredentials(){
        return credentialService.credentials();
    }

    @RequestMapping(value = "/credentials/create", method = RequestMethod.POST)
    public Credential createCredential(@RequestBody Credential credential){
        return credentialService.createCredential(credential);
    }
    @RequestMapping(value = "/credentialrs/{id}", method = RequestMethod.PUT)
    public Credential updateCredential(@RequestBody Credential credential , @PathVariable("id") @NotNull Long id ){
        return credentialService.updateCredential(credential,id);
    }

    @RequestMapping(value = "/credentials/delete", method = RequestMethod.DELETE)
    public Credential credential(@RequestBody Credential credential) {
        return credentialService.deleteCredential(credential);
    }

}
