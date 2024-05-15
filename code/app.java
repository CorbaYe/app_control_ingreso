package code;

import java.time.LocalTime;
import java.util.Date;

import javax.swing.JOptionPane;

public class app {
    static cls_personal []  personal = new cls_personal[1000];
    static cls_control [] control =  new cls_control[5000];
    static int pos_c = 0;
    static boolean sw_c = false;
    static int pos_p = 0;
    static boolean sw_p = false;
    public static void main(String[] args) {
        fnt_menu(true);
    }

    private static void fnt_menu(boolean sw){
        do{
            String opcion_str = JOptionPane.showInputDialog(null, "1. Registrar persona \n2. Registrar ingreso \n3. Consultar \n4. Salir");
            if (opcion_str.equals("1")) {
                fnt_registrar_personal();
            }
            if (opcion_str.equals("2")) {
                fnt_registrar_control();
            }
        }while(sw);
    }

    private static void fnt_registrar_personal(){
        String id = JOptionPane.showInputDialog(null, "Ingrese el id del personal");
        String  nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del personal");
        String contacto = JOptionPane.showInputDialog(null, "Ingrese el contacto del personal");
        String correo = JOptionPane.showInputDialog(null, "Ingrese el correo del personal");

        cls_personal objRegistro = new cls_personal(id, nombre, contacto, correo);
        personal[pos_p] = objRegistro;
        pos_p++;
        JOptionPane.showMessageDialog(null, "Persona registrada con éxito");
    }

    private static void fnt_registrar_control(){
        sw_c = false;
        String id = JOptionPane.showInputDialog(null, "Ingrese el id del personal");
        for(int i = 0; i < pos_p; i++){
            if (personal[i].getId_str().equals(id)) {
                sw_c = true;
                break;
            }
        }
        if (sw_c) {
            Date currentDate = new Date();
            LocalTime currenTime = LocalTime.now();
            cls_control objRegistro = new cls_control(id, "" + currentDate, "" + currenTime);
            control[pos_c] = objRegistro;
            pos_c++;
            JOptionPane.showMessageDialog(null, "Persona registrada con éxito");
        }else{
            JOptionPane.showMessageDialog(null, "No se encontraron registros");
        }

    }
}