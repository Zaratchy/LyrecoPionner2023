package LyrecoPionner2023.controler;

import LyrecoPionner2023.model.Role;
import LyrecoPionner2023.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RoleRestControler {

    @Autowired
    private RoleService roleService;

    public RoleRestControler(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping( "role/{id}" )
    public Optional<Role> findRoleById(@PathVariable("id") Long id
    ){
        return roleService.findRoleById(id);
    }

    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    public List<Role> listRoles(){
        return roleService.roles();
    }

    @RequestMapping(value = "/roles/create", method = RequestMethod.POST)
    public Role createRole(@RequestBody Role role){
        return roleService.createRole(role);
    }
    @RequestMapping(value = "/roles/{id}", method = RequestMethod.PUT)
    public Role updateRole(@RequestBody Role role , @PathVariable("id") @NotNull Long id ){
        return roleService.updateRole(role,id);
    }

    @RequestMapping(value = "/roles/delete", method = RequestMethod.DELETE)
    public Role role(@RequestBody Role role) {
        return roleService.deleteRole(role);
    }



}
