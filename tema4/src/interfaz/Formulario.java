package interfaz;

//SWING ES TODO LO QUE FORMULARIO
import javax.swing.*;

import semana_04.Libreria;

import java.awt.Font;
import java.awt.event.*;

public class Formulario {

	public static void main(String[] args) {
		Formulario f = new Formulario();
		f.ventana();

	}
	
	public void ventana() {
		//CREANDO VENTANA
		JFrame  frame = new JFrame("Semana 4 - Cadena de texto");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		
		
		//CREAR PANEL
		JPanel panel = new JPanel();
		frame.setContentPane(panel);
		panel.setLayout(null);
		
		//CREANDO ETIQUETA DATO JLabel = lbl
		JLabel lblTexto = new JLabel("Ingrese texto: ");
		lblTexto.setBounds(20, 30, 200, 20);
		panel.add(lblTexto);
		
		//CAJA DE TEXTO
		JTextField txtDato = new JTextField();
		txtDato.setBounds(110, 30, 300, 20);
		panel.add(txtDato);
		
		//DESPLAZAMIENTO
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(20, 70, 390, 400);
		panel.add(scroll);
		
		//Creando text area
		JTextArea area = new JTextArea();
		//esto es para que el txtArea es ordenado "Orden :"
		area.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scroll.setViewportView(area);
		
		//CREANDO BOTON
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(420, 30, 120, 20);
		panel.add(btnProcesar);
		
		//PROGRAMANDO BOTON PROCESAR
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AL FINAL DE getText(); se puede agregar un .trim() y borrar los del append
				String dato = txtDato.getText();
				
				Libreria l = new Libreria();
				
					if(!dato.isEmpty()) {
						area.append("Ingreso de texto valido  :"+l.eliminarEspacio(dato) +"\n");
						area.append("Longitud de texto valido :"+l.longitudSinAjuste(dato) +"\n");
						area.append("Primer carecter          :"+l.primerCarecter(dato.trim()) +"\n");
						area.append("Ultimo carecter          :"+l.ultimoCaracter(dato.trim()) +"\n");
						area.append("");
						area.append("Texto ajustado           :"+l.textoAjustado(dato.trim())+"\n");
						txtDato.setText("");
					}
					else {
						JOptionPane.showMessageDialog(frame, "Caja de texto vacia", "Advertencia", JOptionPane.WARNING_MESSAGE);
					}
				}
		});
		
		frame.setVisible(true);
	}

}
