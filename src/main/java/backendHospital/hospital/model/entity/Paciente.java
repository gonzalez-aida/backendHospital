package backendHospital.hospital.model.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaciente;

    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String tipoSangre;

    // Relación: Un paciente tiene muchos expedientes
    @OneToMany(mappedBy = "paciente")
    private List<Expediente> expedientes;

    // Constructor vacío
    public Paciente() {
    }

    // Getters y Setters

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}