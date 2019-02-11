package com.generic.eo.almanaque.Controlador;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Loger {

    /**
     * Retorna una excepción como una cadena de caracteres.
     *
     * @param throwable
     * @return
     */
    public static String getStackTrace(final Throwable throwable) {
        final StringWriter sw = new StringWriter();
        final PrintWriter pw = new PrintWriter(sw, true);
        throwable.printStackTrace(pw);
        return sw.getBuffer().toString();
    }

}
