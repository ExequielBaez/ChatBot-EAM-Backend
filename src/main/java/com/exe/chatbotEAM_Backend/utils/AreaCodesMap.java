package com.exe.chatbotEAM_Backend.utils;

import java.util.HashMap;
import java.util.Map;

public class AreaCodesMap {

    private static final Map<Integer, String> AREA_CODE_TO_PROVINCE = new HashMap<>();

    static {
        // Buenos Aires
        AREA_CODE_TO_PROVINCE.put(11, "Buenos Aires");

        // Catamarca
        AREA_CODE_TO_PROVINCE.put(383, "Catamarca");

        // Chaco
        AREA_CODE_TO_PROVINCE.put(362, "Chaco");

        // Chubut
        AREA_CODE_TO_PROVINCE.put(280, "Chubut");

        // Córdoba
        AREA_CODE_TO_PROVINCE.put(351, "Córdoba");

        // Corrientes
        AREA_CODE_TO_PROVINCE.put(379, "Corrientes");

        // Entre Ríos
        AREA_CODE_TO_PROVINCE.put(343, "Entre Ríos");

        // Formosa
        AREA_CODE_TO_PROVINCE.put(370, "Formosa");

        // Jujuy
        AREA_CODE_TO_PROVINCE.put(388, "Jujuy");

        // La Pampa
        AREA_CODE_TO_PROVINCE.put(2954, "La Pampa");

        // La Rioja
        AREA_CODE_TO_PROVINCE.put(380, "La Rioja");

        // Mendoza
        AREA_CODE_TO_PROVINCE.put(261, "Mendoza");

        // Misiones
        AREA_CODE_TO_PROVINCE.put(376, "Misiones");

        // Neuquén
        AREA_CODE_TO_PROVINCE.put(299, "Neuquén");

        // Río Negro
        AREA_CODE_TO_PROVINCE.put(298, "Río Negro");

        // Salta
        AREA_CODE_TO_PROVINCE.put(387, "Salta");

        // San Juan
        AREA_CODE_TO_PROVINCE.put(264, "San Juan");

        // San Luis
        AREA_CODE_TO_PROVINCE.put(266, "San Luis");

        // Santa Cruz
        AREA_CODE_TO_PROVINCE.put(297, "Santa Cruz");

        // Santa Fe
        AREA_CODE_TO_PROVINCE.put(341, "Santa Fe");

        // Santiago del Estero
        AREA_CODE_TO_PROVINCE.put(385, "Santiago del Estero");

        // Tierra del Fuego
        AREA_CODE_TO_PROVINCE.put(2901, "Tierra del Fuego");

        // Tucumán
        AREA_CODE_TO_PROVINCE.put(381, "Tucumán");
    }

    public static String getProvince(int areaCode) {
        return AREA_CODE_TO_PROVINCE.getOrDefault(areaCode, "Provincia Desconocida");
    }

    public static boolean contains(int areaCode) {
        return AREA_CODE_TO_PROVINCE.containsKey(areaCode);
    }
}
