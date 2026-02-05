package backendHospital.hospital.model.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id; 
    private String nombre;
    private String especialidad;
    private String cedulaProfesional;
    private String correo;
}
