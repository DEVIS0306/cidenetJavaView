/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author jevergara
 */
public class Empleado2 {
    
    private   int id;
    private String apellidop;
    private String apellidos;
    private String nombrep;
    private String pais;
    private String identificacion;
    private String nidentificacion;
    private String correo;
    private String Fecha;
    private String area;    

    public Empleado2()
    {
        
    } 
    public Empleado2(int id, String apellidop, String apellidos, String nombrep, String pais, String identificacion, String nidentificacion, String correo, String Fecha, String area) {
        this.id = id;
        this.apellidop = apellidop;
        this.apellidos = apellidos;
        this.nombrep = nombrep;
        this.pais = pais;
        this.identificacion = identificacion;
        this.nidentificacion = nidentificacion;
        this.correo = correo;
        this.Fecha = Fecha;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNidentificacion() {
        return nidentificacion;
    }

    public void setNidentificacion(String nidentificacion) {
        this.nidentificacion = nidentificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
}
