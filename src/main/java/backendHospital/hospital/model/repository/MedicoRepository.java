package backendHospital.hospital.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import backendHospital.hospital.model.entity.Medico;

public interface MedicoRepository extends JpaRepository<Medico,Integer>{
    
}
