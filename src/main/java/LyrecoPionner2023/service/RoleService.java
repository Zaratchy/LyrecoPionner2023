package LyrecoPionner2023.service;

import LyrecoPionner2023.model.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {

    Optional<Role> findRoleById(Long id);

    List<Role> roles();

    Role createRole(Role role);

    Role updateRole(Role role , Long id);

    Role deleteRole(Role role);


}
