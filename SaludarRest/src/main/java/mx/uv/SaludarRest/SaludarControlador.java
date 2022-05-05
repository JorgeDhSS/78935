package mx.uv.SaludarRest;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludarControlador {
    ArrayList<Saludos> listaSaludos = new ArrayList<Saludos>();
    @RequestMapping("/SaludarRequest")
    public String SaludarRequest(@RequestParam(name="id") Integer id, @PathVariable("nombre") String nombreX)
    {
        Saludos saludo = new Saludos(id, nombreX);
        listaSaludos.add(saludo);
        id ++;
        return "Hola "+nombreX;
    }

    @GetMapping("/BuscarSaludosRequest")
    public ArrayList<Saludos> BuscarSaludosRequest()
    {
        return listaSaludos;
    }

    @GetMapping("/ModificarSaludoRequest")
    public Boolean ModificarSaludoRequest(@RequestParam(name="id") Integer id, @PathVariable("nombre") String nombreX)
    {
        for(Saludos o : listaSaludos)
        {
            if(o.getID() == id)
            {
                o.setID(id);
                o.setNombre(nombreX);
            }
        }
        
        return true;
    }

    @GetMapping("/BorrarSaludoResponse")
    public Boolean BorrarSaludoResponse(@RequestParam(name="id") Integer id)
    {
        for(Saludos o : listaSaludos)
        {
            if(o.getID() == id)
            {
                listaSaludos.remove(o);
            }
        }
        
        return true;
    }
}