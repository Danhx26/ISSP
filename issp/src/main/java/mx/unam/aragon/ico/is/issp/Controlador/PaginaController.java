package mx.unam.aragon.ico.is.issp.Controlador;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/issp")
public class PaginaController {
    @GetMapping({"/principal", "/principal/"})
    public String mostrarPaginaPrincipal() {
        return "pagina_principal";
    }

    @GetMapping({"/Teoria-Basica", "/Teoria-Basica/"})
    public String mostrarTeoriaBasica() {
        return "apartado1";
    }

    @GetMapping({"/Patrones-de-Diseño", "/Patrones-de-Diseño/"})
    public String mostrarPatronesDeDiseno() {
        return "apartado2";
    }

    @GetMapping({"/scrum", "/scrum/"})
    public String mostrarScrum() {
        return "apartado3";
    }

    @GetMapping({"/Integrantes", "/Integrantes/"})
    public String mostrarIntegrantesDelEquipo() {
        return "apartado4";
    }
    
}
