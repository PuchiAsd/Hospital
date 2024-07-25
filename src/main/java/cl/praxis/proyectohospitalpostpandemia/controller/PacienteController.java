package cl.praxis.proyectohospitalpostpandemia.controller;

import cl.praxis.proyectohospitalpostpandemia.entity.Paciente;
import cl.praxis.proyectohospitalpostpandemia.service.IPacienteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PacienteController {
    public static final Logger LOGGER = LoggerFactory.getLogger(PacienteController.class);
    @Autowired
    private IPacienteService pacienteService;

    @GetMapping("/")
    public String getAllPacientes(Model model){
        List<Paciente> pacientes = pacienteService.getAllPacientes();
        LOGGER.info("Obtiene todos los pacientes " + pacientes);
        model.addAttribute("ListaPacientes",pacientes);
        return "index";
    }
}
