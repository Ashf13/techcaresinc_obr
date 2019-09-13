package org.techcaresinc.techcaresinc_obr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.techcaresinc.techcaresinc_obr.entities.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {
}
