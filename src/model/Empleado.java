package model;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;





public class Empleado {
   
    private Long id;
    private String primerApellido;
    private String segundoApellido;
    private String primerNombre;
    private String otrosNombre;
    private String numeroIdentificacion;
    private Pais pais;
    private Identificacion identificacion;
    private String email;
    private Date fechaIngreso;
    private Area area;
    private Estado estado;
    private Dominio dominio;
    private Date createAt ;
    private Date updateAt;

    public Empleado() {
    }

    public Empleado(Long id, String primerApellido, String segundoApellido, String primerNombre, String otrosNombre, String numeroIdentificacion, Pais pais, Identificacion identificacion, String email, Date fechaIngreso, Area area, Estado estado, Dominio dominio, Date createAt, Date updateAt) {
        this.id = id;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.primerNombre = primerNombre;
        this.otrosNombre = otrosNombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.pais = pais;
        this.identificacion = identificacion;
        this.email = email;
        this.fechaIngreso = fechaIngreso;
        this.area = area;
        this.estado = estado;
        this.dominio = dominio;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }
    
    
    
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getOtrosNombre() {
        return otrosNombre;
    }

    public void setOtrosNombre(String otrosNombre) {
        this.otrosNombre = otrosNombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Identificacion identificacion) {
        this.identificacion = identificacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Dominio getDominio() {
        return dominio;
    }

    public void setDominio(Dominio dominio) {
        this.dominio = dominio;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
    
    
    
    



}
