package code;

public class cls_personal {
    private String id_str;
    private String nombre_str;
    private String contacto_str;
    private String correo_str;
    public cls_personal(String id_str, String nombre_str, String contacto_str, String correo_str) {
        this.id_str = id_str;
        this.nombre_str = nombre_str;
        this.contacto_str = contacto_str;
        this.correo_str = correo_str;
    }
    public String getId_str() {
        return id_str;
    }
    public void setId_str(String id_str) {
        this.id_str = id_str;
    }
    public String getNombre_str() {
        return nombre_str;
    }
    public void setNombre_str(String nombre_str) {
        this.nombre_str = nombre_str;
    }
    public String getContacto_str() {
        return contacto_str;
    }
    public void setContacto_str(String contacto_str) {
        this.contacto_str = contacto_str;
    }
    public String getCorreo_str() {
        return correo_str;
    }
    public void setCorreo_str(String correo_str) {
        this.correo_str = correo_str;
    }

    
}
