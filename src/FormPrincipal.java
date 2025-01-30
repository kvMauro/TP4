import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import formEjercicio1.FormEjercicio1;
import formEjercicio2.FormEjercicio2;
import formEjercicio3.FormEjercicio3;

public class FormPrincipal extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton btnEjercicio1;
    private JButton btnEjercicio2;
    private JButton btnEjercicio3;
    private FormEjercicio1 f;
    private FormEjercicio2 f2;
    private FormEjercicio3 f3;

    public FormPrincipal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblGrupo = new JLabel("GRUPO NRO:14");
        lblGrupo.setHorizontalAlignment(SwingConstants.CENTER);
        lblGrupo.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblGrupo.setBounds(144, 61, 139, 27);
        contentPane.add(lblGrupo);

        btnEjercicio1 = new JButton("Ejercicio 1");
        btnEjercicio1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnEjercicio1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (f == null) {
                    f = new FormEjercicio1();
                }
                f.setLocationRelativeTo(null);
                f.toFront();
                f.visibilidad(true);
            }
        });
        btnEjercicio1.setBounds(154, 99, 117, 23);
        contentPane.add(btnEjercicio1);

        btnEjercicio2 = new JButton("Ejercicio 2");
        btnEjercicio2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (f2 == null) {
                    f2 = new FormEjercicio2();
                }
                f2.setLocationRelativeTo(null);
                f2.toFront();
                f2.cambiarVisibilidad(true);
            }
        });
        btnEjercicio2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnEjercicio2.setBounds(154, 134, 117, 23);
        contentPane.add(btnEjercicio2);

        btnEjercicio3 = new JButton("Ejercicio 3");
        btnEjercicio3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (f3 == null) {
                    f3 = new FormEjercicio3();
                }
                f3.setLocationRelativeTo(null);
                f3.toFront();
                f3.cambiarVisibilidad(true);
            }
        });
        btnEjercicio3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnEjercicio3.setBounds(154, 168, 116, 23);
        contentPane.add(btnEjercicio3);
    }

    public void visibilidad(boolean b) {
        setVisible(b);
    }
}
