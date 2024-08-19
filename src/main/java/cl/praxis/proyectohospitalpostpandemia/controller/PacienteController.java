package cl.praxis.proyectohospitalpostpandemia.controller;

import cl.praxis.proyectohospitalpostpandemia.entity.Paciente;
import cl.praxis.proyectohospitalpostpandemia.service.IPacienteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.hibernate.id.SequenceMismatchStrategy.LOG;

@Controller
//@RequestMapping("/paciente")
public class PacienteController {
    public static final Logger LOGGER = LoggerFactory.getLogger(PacienteController.class);
    @Autowired
    private IPacienteService pacienteService;

    @GetMapping("/")
    public String obtieneListaPacientes(Model model){
        List<Paciente> pacientes = pacienteService.obtieneListaPacientes();
        LOGGER.info("Obtiene todos los pacientes " + pacientes);
        model.addAttribute("ListaPacientes",pacientes);
        return "index";
    }
    @PostMapping("/paciente/nuevo")
    public String guardarPaciente(@ModelAttribute Paciente paciente){
        Paciente guardar = pacienteService.guardarPaciente(paciente);
        return "redirect:/";
    }
    @GetMapping("/paciente/eliminar/{id}")
    public String borrarPaciente(@PathVariable("id") Long id){
        pacienteService.borrarPaciente(id);
        LOGGER.info("paciente eliminado");
        return "redirect:/";
    }

}
