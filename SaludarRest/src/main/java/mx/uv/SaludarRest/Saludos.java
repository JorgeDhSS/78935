package mx.uv.SaludarRest;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludos {
    private Integer ID;
    private String nombre;
    
    public Saludos(Integer iD, String nombre) {
        ID = iD;
        this.nombre = nombre;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer iD) {
        ID = iD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
