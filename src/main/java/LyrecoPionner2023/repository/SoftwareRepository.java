package LyrecoPionner2023.repository;

import LyrecoPionner2023.model.Software;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface SoftwareRepository extends JpaRepository <Software,Long> {

    Optional<Software> findById(Long id);

}
