package backendHospital.hospital.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import backendHospital.hospital.model.entity.Paciente;
@Entity
@Table(name = "expediente")

public class Expediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id_expediente")
    private Long idExpediente; 
    private String alergias;
    private String antecedentes;
    private String observaciones;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    private Paciente paciente; //cuando mande llamar id_paciente ahora va a ser paciente

    public Expediente() {
    }

    public Long getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(Long idExpediente) {
        this.idExpediente = idExpediente;
    }

    public String getAlergias() {
        return alergias;
    }
    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getAntecedentes() {
        return antecedentes;
    }
    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
