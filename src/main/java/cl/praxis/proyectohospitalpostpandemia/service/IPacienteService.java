package cl.praxis.proyectohospitalpostpandemia.service;

import cl.praxis.proyectohospitalpostpandemia.entity.Paciente;

import java.util.List;
import java.util.Optional;

public interface IPacienteService {

    List<Paciente> obtieneListaPacientes();
    Optional<Paciente> obtienePacientePorId(long id);

   Paciente guardarPaciente(Paciente paciente);

   void borrarPaciente(long id);

}
