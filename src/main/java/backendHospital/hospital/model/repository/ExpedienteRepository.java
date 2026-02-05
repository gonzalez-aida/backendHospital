package backendHospital.hospital.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backendHospital.hospital.model.entity.Expediente;
@Repository
public interface ExpedienteRepository extends JpaRepository<Expediente,Long>{
    List<Expediente> findByAlergiasContaining(Long paciente);    
}
