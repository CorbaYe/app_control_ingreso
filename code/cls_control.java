package code;
public class cls_control{
    private String id_str;
    private String fecha_entrada;
    private String hora_entrada;

    public cls_control(String id_str, String fecha_entrada, String hora_entrada) {
        this.id_str = id_str;
        this.fecha_entrada = fecha_entrada;
        this.hora_entrada = hora_entrada;
    }
    
    public String getId_str() {
        return id_str;
    }
    public void setId_str(String id_str) {
        this.id_str = id_str;
    }
    public String getFecha_entrada() {
        return fecha_entrada;
    }
    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }
    public String getHora_entrada() {
        return hora_entrada;
    }
    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    
}