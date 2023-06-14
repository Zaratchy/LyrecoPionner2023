package LyrecoPionner2023.service.impl;

import LyrecoPionner2023.model.Role;
import LyrecoPionner2023.repository.RoleRepository;
import LyrecoPionner2023.service.RoleService;
import exception.RoleNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Optional<Role> findRoleById(Long id) {
        final Optional<Role> optionalRole = this.roleRepository.findById(id);

        if (optionalRole.isPresent()) {
            final Role role = optionalRole.get();
            return roleRepository.findById(id);
        } else {
            throw RoleNotFoundException.roleNotFound();
        }
    }

    @Override
    public List<Role> roles() {
        return roleRepository.findAll();


    }

    @Override
    public Role createRole(Role role) {
        roleRepository.save(role);
        return role;
    }
    @Override
    public Role updateRole(Role role, Long id) {
        role.setId(id);
        return  roleRepository.save(role);
    }

    @Transactional
    public Role deleteRole(Role role) {
        roleRepository.delete(role);
        return role;
    }

}
