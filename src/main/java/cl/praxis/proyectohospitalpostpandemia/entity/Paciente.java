package cl.praxis.proyectohospitalpostpandemia.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente",nullable = false, unique = true)
    private long id;
    @Column(name= "run",nullable = false,unique = true,length = 12)
    private String run;
    @Column(name = "nombre",nullable = false, length = 50)
    private String nombre;
    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;
    @Column(name = "edad",nullable = false)
    private int edad;
    @Column(name = "prevision", nullable = false,length = 25)
    private String prevision;

}
