package formEjercicio3;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class JDialog_FormEjercicio3 extends JDialog {
    private static final long serialVersionUID = 1L;
    private JLabel lblMensaje;

    public JDialog_FormEjercicio3() {
        setTitle("Mensaje");
        setBounds(100, 100, 400, 125);
        getContentPane().setLayout(null);

        lblMensaje = new JLabel("");
        lblMensaje.setBounds(34, 41, 275, 18);
        getContentPane().add(lblMensaje);
    }

    public void cambiarVisibilidad(boolean estado) {
        setVisible(estado);
    }

    public void setMensaje(String so, String especialidad, String hs) {
        String m = so + especialidad + hs;
        lblMensaje.setText(m);
    }

    public void setMensaje(String msj) {
        lblMensaje.setText(msj);
    }
}