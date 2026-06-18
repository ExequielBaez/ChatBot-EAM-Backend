package com.exe.chatbotEAM_Backend.service.impl;

import com.exe.chatbotEAM_Backend.dto.DatosDTO;
import com.exe.chatbotEAM_Backend.persistance.entity.DatosEntity;
import com.exe.chatbotEAM_Backend.persistance.repository.DatosRepository;
import com.exe.chatbotEAM_Backend.service.IDatosService;
import com.exe.chatbotEAM_Backend.utils.AreaCodesMap;
import com.exe.chatbotEAM_Backend.utils.PhoneNumberUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DatosServiceImpl implements IDatosService {

    @Autowired
    private DatosRepository datosRepository;

    @Override
    public DatosDTO createDatos(DatosDTO datosDTO) {

        DatosEntity datosEntity = new DatosEntity();
        datosEntity.setName(datosDTO.getName());
        datosEntity.setCellPhone(datosDTO.getCellPhone());
        datosEntity.setChooseOption(datosDTO.getChooseOption());

        // Extraer código de área y provincia
        Integer areaCode = PhoneNumberUtil.extractAreaCode(datosDTO.getCellPhone());
        String province = null;

        if (areaCode != null) {
            province = AreaCodesMap.getProvince(areaCode);
            datosEntity.setAreaCode(String.valueOf(areaCode)); //paso a string
            datosEntity.setProvince(province);

            // Actualizar DTO
            datosDTO.setAreaCode(String.valueOf(areaCode)); //paso a string
            datosDTO.setProvince(province);
        }

        DatosEntity savedEntity = datosRepository.save(datosEntity);

        //mapeo

        datosDTO.setIdDatos(savedEntity.getIdDatos());

        return datosDTO;



    }
}
