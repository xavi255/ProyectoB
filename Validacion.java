package adm;

import java.awt.Toolkit;


public class Validacion {
    public void soloNumero(java.awt.event.KeyEvent evt){
        int car = evt.getKeyChar();
        if(car < 48 || car > 57){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }
    
    public void soloLetra(java.awt.event.KeyEvent evt){
        int car = evt.getKeyChar();
        if((car < 'A' || car > 'z') && car !=' '){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }
}
