package backendHospital.hospital.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import backendHospital.hospital.model.entity.Expediente;
import backendHospital.hospital.service.ExpedienteService;

@RestController
@RequestMapping("/expediente")
@CrossOrigin(origins = "*")
public class ExpedienteController {

    private final ExpedienteService expedienteService;

    public ExpedienteController(ExpedienteService expedienteService) {
        this.expedienteService = expedienteService;
    } //constructor para inyectar el servicio

    @PostMapping
    public Expediente createExpediente(@RequestBody Expediente expediente) {
        return expedienteService.saveExpediente(expediente);
    } //crear expediente

    @GetMapping
    public List<Expediente> getAllExpedientes() {
        return expedienteService.getAllExpedientes();
    } //obtener todos los expedientes

    @GetMapping("/{id}")
    public Expediente getExpedienteById(@PathVariable Long id) {
        return expedienteService.getExpedienteById(id);
    } //obtener expediente por id

    @DeleteMapping("/{id}")
    public void deleteExpediente(@PathVariable Long id) {
        expedienteService.deleteExpediente(id);
    } //eliminar expediente por id
    
}
