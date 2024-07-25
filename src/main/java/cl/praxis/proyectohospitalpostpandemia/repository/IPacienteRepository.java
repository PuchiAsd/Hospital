package cl.praxis.proyectohospitalpostpandemia.repository;

import cl.praxis.proyectohospitalpostpandemia.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPacienteRepository extends JpaRepository<Paciente, Long> {

}
