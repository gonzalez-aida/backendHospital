package backendHospital.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backendHospital.hospital.model.repository.ExpedienteRepository;
import backendHospital.hospital.model.entity.Expediente;

@Service
public class ExpedienteService {

    @Autowired
    private final ExpedienteRepository expedienteRepository;
    
    public ExpedienteService(ExpedienteRepository expedienteRepository) {
        this.expedienteRepository = expedienteRepository;
    } //constructor para inyectar el repositorio
    
    public Expediente saveExpediente(Expediente expediente) {
        return expedienteRepository.save(expediente);
    } //guardar expediente
    
    public List<Expediente> getAllExpedientes() {
        return expedienteRepository.findAll();
    } //obtener todos los expedientes

    public Expediente getExpedienteById(Long id) {
        return expedienteRepository.findById(id).orElse(null);
    } //obtener expediente por id

    public void deleteExpediente(Long id) {
        expedienteRepository.deleteById(id);
    } //eliminar expediente por id
}
