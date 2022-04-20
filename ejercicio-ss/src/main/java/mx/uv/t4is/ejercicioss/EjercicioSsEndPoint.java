package mx.uv.t4is.ejercicioss;
import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.h2.H2ConsoleAutoConfiguration;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.todolist.BorrarActivityRequest;
import https.t4is_uv_mx.todolist.BorrarActivityResponse;
import https.t4is_uv_mx.todolist.CreateActivityRequest;
import https.t4is_uv_mx.todolist.CreateActivityResponse;
import https.t4is_uv_mx.todolist.ListarActivitiesResponse;
import https.t4is_uv_mx.todolist.ModificarActivityRequest;
import https.t4is_uv_mx.todolist.ModificarActivityResponse;

import org.springframework.ws.server.endpoint.annotation.RequestPayload;


@Endpoint
public class EjercicioSsEndPoint
{
    @Autowired
    ActivitiesInterface iActivities;
    @PayloadRoot(localPart = "CreateActivityRequest", namespace = "https://t4is.uv.mx/toDoList")
    @ResponsePayload
    public CreateActivityResponse crearActividad (@RequestPayload CreateActivityRequest peticion)
    {
        CreateActivityResponse respuesta = new CreateActivityResponse();
        Activities activity = new Activities(peticion.getNombre(), peticion.getEstado());
        iActivities.save(activity);
        respuesta.setRespuesta("Se ha creado la actividad con el siguiente nombre:  "+peticion.getNombre());
        return respuesta;
    }

    @PayloadRoot(localPart = "ModificarActivityRequest", namespace = "https://t4is.uv.mx/toDoList")
    @ResponsePayload
    public ModificarActivityResponse modificarActividad (@RequestPayload ModificarActivityRequest peticion)
    {
        ModificarActivityResponse respuesta = new ModificarActivityResponse();
        Activities activity = iActivities.findById(peticion.getId()).get();
        activity.setEstado(peticion.getEstado());

        iActivities.save(activity);
        respuesta.setRespuesta(true);
        return respuesta;
    }

    @PayloadRoot(localPart = "BorrarActivityRequest", namespace = "https://t4is.uv.mx/toDoList")
    @ResponsePayload
    public BorrarActivityResponse borrarActividad(@RequestPayload BorrarActivityRequest peticion)
    {
        BorrarActivityResponse respuesta = new BorrarActivityResponse();
        iActivities.deleteById(peticion.getId());
        respuesta.setRespuesta(true);
        return respuesta;
    }

    @PayloadRoot(localPart = "ListarActivitiesRequest", namespace = "https://t4is.uv.mx/toDoList")
    @ResponsePayload
    public ListarActivitiesResponse buscarSaludos()
    {
        ListarActivitiesResponse respuesta = new ListarActivitiesResponse();
        Iterable <Activities> listaActivities = iActivities.findAll();
        for (Activities o : listaActivities) 
        {
            ListarActivitiesResponse.ActivitieList activitiesList = new ListarActivitiesResponse.ActivitieList();
            activitiesList.setId(o.getID());
            activitiesList.setNombre(o.getNombre());
            activitiesList.setEstado(o.getEstado());
            respuesta.getActivitieList().add(activitiesList);
        }
        return respuesta;
    }
}
