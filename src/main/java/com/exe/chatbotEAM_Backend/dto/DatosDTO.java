package com.exe.chatbotEAM_Backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DatosDTO {

    private String idDatos;

    private String name;

    private String areaCode;

    private String cellPhone;

    private String province;

    private String chooseOption;
}
