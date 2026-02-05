package backendHospital.hospital.service;

import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import backendHospital.hospital.dto.DashboardStats;
import backendHospital.hospital.model.repository.ExpedienteRepository;
import backendHospital.hospital.model.repository.MedicoRepository;

@Service
public class DashboardService {

    private final ExpedienteRepository expedienteRepository;
    private final MedicoRepository medicoRepository;

    public DashboardService(ExpedienteRepository expedienteRepository, 
                            MedicoRepository medicoRepository) {
        this.expedienteRepository = expedienteRepository;
        this.medicoRepository = medicoRepository;
    }

    public DashboardStats getDashboardStats() {
        long totalExpedientes = expedienteRepository.count();
        long totalMedicos = medicoRepository.count();
        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String lastUpdated = now.format(formatter);
        
        String hospitalStatus = "OPERATIONAL";

        return new DashboardStats(
            totalExpedientes,
            totalMedicos,
            lastUpdated,
            hospitalStatus
        );
    }
}
