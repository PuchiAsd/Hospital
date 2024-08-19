package cl.praxis.proyectohospitalpostpandemia.service.serviceImpl;

import cl.praxis.proyectohospitalpostpandemia.entity.Paciente;
import cl.praxis.proyectohospitalpostpandemia.repository.IPacienteRepository;
import cl.praxis.proyectohospitalpostpandemia.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("pacienteServiceImpl")
public class PacienteServiceImpl implements IPacienteService {

    @Autowired
    private IPacienteRepository pacienteRepository;

    @Override
    public List<Paciente> obtieneListaPacientes() {
        return pacienteRepository.findAll();
    }

    @Override
    public Optional<Paciente> obtienePacientePorId(long id){
        return pacienteRepository.findById(id);
    }

    @Override
    public Paciente guardarPaciente(Paciente paciente){
        return  pacienteRepository.save(paciente);
    }

    @Override
    public void borrarPaciente(long id){
        pacienteRepository.deleteById(id);
    }
}
