package com.exe.chatbotEAM_Backend.service;

import com.exe.chatbotEAM_Backend.dto.DatosDTO;
import com.exe.chatbotEAM_Backend.persistance.entity.DatosEntity;


public interface IDatosService {

    DatosDTO createDatos(DatosDTO datosDTO);
}
