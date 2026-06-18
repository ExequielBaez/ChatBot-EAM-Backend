package com.exe.chatbotEAM_Backend.utils;

public class PhoneNumberUtil {

    /**
     * Extrae el código de área de un número de celular argentino
     * Formato esperado: 5493512474193
     * Donde: 54 es código de país, 9 es prefijo de celular, 351 es código de área
     */
    public static Integer extractAreaCode(String cellPhone) {
        if (cellPhone == null || cellPhone.isEmpty()) {
            return null;
        }

        // Eliminar el 54 inicial si existe
        String number = cellPhone;
        if (number.startsWith("54")) {
            number = number.substring(2);
        }

        // Eliminar el 9 después del 54
        if (number.startsWith("9")) {
            number = number.substring(1);
        }

        // El código de área puede ser de 3 o 4 dígitos
        // Ejemplos: 351 (Córdoba), 2901 (Tierra del Fuego)

        // Intentar con 4 dígitos primero
        if (number.length() >= 4) {
            try {
                String possibleCode4 = number.substring(0, 4);
                int code4 = Integer.parseInt(possibleCode4);
                if (AreaCodesMap.contains(code4)) {
                    return code4;
                }
            } catch (NumberFormatException e) {
                // Ignorar error de parseo
            }
        }

        // Luego con 3 dígitos
        if (number.length() >= 3) {
            try {
                String possibleCode3 = number.substring(0, 3);
                int code3 = Integer.parseInt(possibleCode3);
                if (AreaCodesMap.contains(code3)) {
                    return code3;
                }
            } catch (NumberFormatException e) {
                // Ignorar error de parseo
            }
        }

        return null; // No se encontró código de área válido
    }

    /**
     * Extrae código de área y devuelve la provincia
     */
    public static String getProvinceFromPhone(String cellPhone) {
        Integer areaCode = extractAreaCode(cellPhone);
        if (areaCode != null) {
            return AreaCodesMap.getProvince(areaCode);
        }
        return "Provincia Desconocida";
    }
}
