package com.exe.chatbotEAM_Backend.controller;

import com.exe.chatbotEAM_Backend.dto.DatosDTO;
import com.exe.chatbotEAM_Backend.service.IDatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/api/datos")
public class DatosController {

    @Autowired
    private IDatosService datosService;

    @PostMapping
    public ResponseEntity<?> createDatos(@RequestBody DatosDTO datosDTO
                                        ) {

        DatosDTO misDatos = datosService.createDatos(datosDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(misDatos);
       // return ResponseEntity.ok(misDatos);



    }



}
