package LyrecoPionner2023.service;

import LyrecoPionner2023.model.HistoCredential;

import java.util.List;
import java.util.Optional;

public interface HistoCredentialService {

    Optional<HistoCredential> findHistoCredentialById(Long id);

    List<HistoCredential> histoCredentials();

    HistoCredential createHistoCredential(HistoCredential histoCredential);

    HistoCredential updateHistoCredential(HistoCredential histoCredential , Long id);

    HistoCredential deleteHistoCredential(HistoCredential histoCredential);

}
