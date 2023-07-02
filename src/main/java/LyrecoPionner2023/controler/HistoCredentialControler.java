package LyrecoPionner2023.controler;

import LyrecoPionner2023.model.HistoCredential;
import LyrecoPionner2023.service.HistoCredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class HistoCredentialControler {

    @Autowired
    private HistoCredentialService histoCredentialService;

    public HistoCredentialControler(HistoCredentialService histoCredentialService) {
        this.histoCredentialService = histoCredentialService;
    }

    @GetMapping( "histoCredential/{id}" )
    public Optional<HistoCredential> findHistoCredentialById(@PathVariable("id") Long id
    ){
        return histoCredentialService.findHistoCredentialById(id);
    }

    @RequestMapping(value = "/histoCredentials", method = RequestMethod.GET)
    public List<HistoCredential> listHistoCredentials(){
        return histoCredentialService.histoCredentials();
    }

    @RequestMapping(value = "/histoCredentials/create", method = RequestMethod.POST)
    public HistoCredential createHistoCredential(@RequestBody HistoCredential histoCredential){
        return histoCredentialService.createHistoCredential(histoCredential);
    }
    @RequestMapping(value = "/histoCredentials/{id}", method = RequestMethod.PUT)
    public HistoCredential updateHistoCredential(@RequestBody HistoCredential histoCredential , @PathVariable("id") @NotNull Long id ){
        return histoCredentialService.updateHistoCredential(histoCredential,id);
    }

    @RequestMapping(value = "/histoCredentials/delete", method = RequestMethod.DELETE)
    public HistoCredential histoCredential(@RequestBody HistoCredential histoCredential) {
        return histoCredentialService.deleteHistoCredential(histoCredential);
    }

}
