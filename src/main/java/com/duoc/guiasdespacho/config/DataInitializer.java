package com.duoc.guiasdespacho.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.duoc.guiasdespacho.model.Transportista;
import com.duoc.guiasdespacho.repository.TransportistaRepository;

@Component
public class DataInitializer implements ApplicationRunner{
    @Autowired
    private TransportistaRepository transportistaRepo;

    // Agrega transportistas a la base de datos al iniciar la aplicacion
    @Override
    public void run(ApplicationArguments args) throws Exception{
        //Crear cursos en la base de datos
        Transportista transportista1 = new Transportista(null, "Juan Perez");
        Transportista transportista2 = new Transportista(null, "Pedro Gomez");
        Transportista transportista3 = new Transportista(null, "Maria Rodriguez");
        transportistaRepo.save(transportista1);
        transportistaRepo.save(transportista2);
        transportistaRepo.save(transportista3);
        
    }


}
