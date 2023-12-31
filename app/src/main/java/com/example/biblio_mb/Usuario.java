package com.example.biblio_mb;

public class Usuario {
    int id;
    String nombre, email, clave;


    public Usuario() {
    }

    public Usuario(String nombre, String email, String clave) {
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
    }

    public Usuario(int id, String nombre, String email, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", clave='" + clave + '\'' +
                '}';
    }


    public boolean isNull() {
        if(nombre.equals("") || clave.equals("") || email.equals("")) {
            return true;
        } else {
            return false;
        }
    }
}
