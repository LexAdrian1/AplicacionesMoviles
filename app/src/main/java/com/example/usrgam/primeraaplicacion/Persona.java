package com.example.usrgam.primeraaplicacion;

public class Persona {

    private String nombre,apellido,correo,cedula;
    public Persona(String nombre, String apellido, String correo, String cedula) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;


    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
