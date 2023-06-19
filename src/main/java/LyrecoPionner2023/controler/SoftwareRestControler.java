package LyrecoPionner2023.controler;


import LyrecoPionner2023.model.Software;
import LyrecoPionner2023.service.SoftwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SoftwareRestControler {

    @Autowired
    private SoftwareService softwareService;

    public SoftwareRestControler(SoftwareService softwareService) {
        this.softwareService = softwareService;
    }

    @GetMapping( "software/{id}" )
    public Optional<Software> findSoftwareById(@PathVariable("id") Long id
    ){
        return softwareService.findSoftwareById(id);
    }

    @RequestMapping(value = "/softwares", method = RequestMethod.GET)
    public List<Software> listSoftwares(){
        return softwareService.softwares();
    }

    @RequestMapping(value = "/softwares/create", method = RequestMethod.POST)
    public Software createSoftware(@RequestBody Software software){
        return softwareService.createSoftware(software);
    }
    @RequestMapping(value = "/softwares/{id}", method = RequestMethod.PUT)
    public Software updateSoftware(@RequestBody Software software , @PathVariable("id") @NotNull Long id ){
        return softwareService.updateSoftware(software,id);
    }

    @RequestMapping(value = "/softwares/delete", method = RequestMethod.DELETE)
    public Software software(@RequestBody Software software) {
        return softwareService.deleteSoftware(software);
    }

}
