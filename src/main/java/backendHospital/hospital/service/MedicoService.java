package backendHospital.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backendHospital.hospital.model.repository.MedicoRepository;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository repo;
    
}
