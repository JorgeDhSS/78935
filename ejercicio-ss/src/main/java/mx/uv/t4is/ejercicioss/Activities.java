package mx.uv.t4is.ejercicioss;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Activities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer ID;
    String nombre;
    String Estado;

    public Activities() {
        ID = 0;
        nombre = "";
        Estado = "Pendiente";
    }

    public Activities(String nombre, String Estado) {
        this.ID = 0;
        this.nombre = nombre;
        this.Estado = Estado;
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

    public String getEstado()
    {
        return Estado;
    }

    public void setEstado(String Estado)
    {
        this.Estado = Estado;
    }
}
