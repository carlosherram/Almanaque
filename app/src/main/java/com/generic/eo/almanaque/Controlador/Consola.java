package com.generic.eo.almanaque.Controlador;

import android.support.annotation.NonNull;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Consola extends PrintStream {

    public Consola(@NonNull OutputStream out) {

        super(out);

    }

    public void printList(ArrayList<String> lista) {

        for (String item : lista) {
            println(item);

        }

    }

}
