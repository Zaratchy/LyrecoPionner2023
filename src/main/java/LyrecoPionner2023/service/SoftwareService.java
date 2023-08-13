package LyrecoPionner2023.service;

import LyrecoPionner2023.model.Software;

import java.util.List;
import java.util.Optional;
public interface SoftwareService {

    Optional<Software> findSoftwareById(Long id);

    List<Software> softwares();

    Software createSoftware(Software software);

    Software updateSoftware(Software software , Long id);

    Software deleteSoftware(Software software, Long id);


    void deleteSoftware(Long id);
}
