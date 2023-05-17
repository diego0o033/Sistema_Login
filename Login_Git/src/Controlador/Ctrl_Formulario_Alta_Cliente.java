
package Controlador;
/*importo las clases y librerias a utilizar en el controlador**/
import Vista.Formulario_Alta_Cliente;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


/**
 *
 * @author diego vargas
 */
public class Ctrl_Formulario_Alta_Cliente {

    private Formulario_Alta_Cliente faltacliente;

    /*Inicializo las propiedades del formulario en el constructor**/
    public Ctrl_Formulario_Alta_Cliente() {
        faltacliente = new Formulario_Alta_Cliente();
        faltacliente.setVisible(true);
        faltacliente.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        faltacliente.setLayout(null);
        faltacliente.setLocationRelativeTo(null);
        faltacliente.setTitle("ALTA CLIENTE");
        this.setImage_Cono(faltacliente.lbl_cono, "E:\\Material de java\\NetBeansProjects\\Ejemplo_Log\\src\\Imagenes\\cone_256.png");
    }

    /*metodo para escalar imagen al tamaño de mi componente JLabel**/
    private void setImage_Cono(JLabel lbl_cono, String root) {
        ImageIcon img_lbl_cono = new ImageIcon(root);
        Icon icono = new ImageIcon(img_lbl_cono.getImage().getScaledInstance(lbl_cono.getWidth(), lbl_cono.getHeight(), Image.SCALE_DEFAULT));
        lbl_cono.setIcon(icono);
        this.faltacliente.repaint();
    }

}
