package org.techcaresinc.techcaresinc_obr.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techcaresinc.techcaresinc_obr.entities.Certificate;
import org.techcaresinc.techcaresinc_obr.repositories.CertificateRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class CertificateService {

    @Autowired
    private CertificateRepository repository;

    public void save(Certificate certificate){
        repository.save(certificate);
    }

}
