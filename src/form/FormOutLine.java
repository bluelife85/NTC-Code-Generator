package form;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import circuit.CircuitCalculator;
import steinhart.SteinhartEquation;

public class FormOutLine extends JFrame {

	private JPanel contentPane;
	
	private JTextField R1Ohm;
	private JTextField R1Temperature;
	private JTextField R2Ohm;
	private JTextField R2Temperature;
	private JTextField R3Ohm;
	private JTextField R3Temperature;
	private JTextField R2Value;
	private JTextField Resolution;
	private JTextField PathText;
	
	private JLabel lblNewLabel_1;
	private JLabel lblAt;
	private JLabel lblNewLabel_6;
	private JLabel lblRValue_4;
	private JLabel lblRValue_3;
	private JLabel lblAt_7;
	private JLabel lblAt_5;
	private JLabel lblNewLabel_4;
	private JLabel lblAt_3;
	private JLabel lblRValue_2;
	private JLabel lblNewLabel_3;
	private JLabel lblAt_2;
	private JLabel lblAt_1;
	private JLabel lblRValue;
	
	private JFileChooser chooser = new JFileChooser();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormOutLine frame = new FormOutLine();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormOutLine() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FormOutLine.class.getResource("/form/NTC-Thermistor-Symbol.png")));
		setTitle("NTC Table Code Generator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		R1Ohm = new JTextField();
		R1Ohm.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		R1Ohm.setBounds(92, 30, 153, 24);
		contentPane.add(R1Ohm);
		R1Ohm.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("R1 Value");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel.setBounds(12, 27, 86, 24);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("\u03A9");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(257, 30, 20, 24);
		contentPane.add(lblNewLabel_1);
		
		lblAt = new JLabel("at");
		lblAt.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblAt.setBounds(278, 30, 20, 24);
		contentPane.add(lblAt);
		
		R1Temperature = new JTextField();
		R1Temperature.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		R1Temperature.setColumns(10);
		R1Temperature.setBounds(299, 30, 72, 24);
		contentPane.add(R1Temperature);
		
		lblAt_1 = new JLabel("\u2103");
		lblAt_1.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblAt_1.setBounds(377, 30, 20, 24);
		contentPane.add(lblAt_1);
		
		lblRValue = new JLabel("R1 Value");
		lblRValue.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblRValue.setBounds(12, 61, 86, 24);
		contentPane.add(lblRValue);
		
		R2Ohm = new JTextField();
		R2Ohm.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		R2Ohm.setColumns(10);
		R2Ohm.setBounds(92, 64, 153, 24);
		contentPane.add(R2Ohm);
		
		lblNewLabel_3 = new JLabel("\u03A9");
		lblNewLabel_3.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(257, 64, 20, 24);
		contentPane.add(lblNewLabel_3);
		
		lblAt_2 = new JLabel("at");
		lblAt_2.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblAt_2.setBounds(278, 64, 20, 24);
		contentPane.add(lblAt_2);
		
		R2Temperature = new JTextField();
		R2Temperature.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		R2Temperature.setColumns(10);
		R2Temperature.setBounds(299, 64, 72, 24);
		contentPane.add(R2Temperature);
		
		lblAt_3 = new JLabel("\u2103");
		lblAt_3.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblAt_3.setBounds(377, 64, 20, 24);
		contentPane.add(lblAt_3);
		
		lblRValue_2 = new JLabel("R1 Value");
		lblRValue_2.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblRValue_2.setBounds(12, 95, 86, 24);
		contentPane.add(lblRValue_2);
		
		R3Ohm = new JTextField();
		R3Ohm.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		R3Ohm.setColumns(10);
		R3Ohm.setBounds(92, 98, 153, 24);
		contentPane.add(R3Ohm);
		
		lblNewLabel_4 = new JLabel("\u03A9");
		lblNewLabel_4.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(257, 98, 20, 24);
		contentPane.add(lblNewLabel_4);
		
		lblAt_5 = new JLabel("at");
		lblAt_5.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblAt_5.setBounds(278, 98, 20, 24);
		contentPane.add(lblAt_5);
		
		R3Temperature = new JTextField();
		R3Temperature.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		R3Temperature.setColumns(10);
		R3Temperature.setBounds(299, 98, 72, 24);
		contentPane.add(R3Temperature);
		
		lblAt_7 = new JLabel("\u2103");
		lblAt_7.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblAt_7.setBounds(377, 98, 20, 24);
		contentPane.add(lblAt_7);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(FormOutLine.class.getResource("/form/250px-Voltage_divider.svg.png")));
		lblNewLabel_2.setBounds(433, 60, 241, 258);
		contentPane.add(lblNewLabel_2);
		
		lblRValue_3 = new JLabel("R2 Value");
		lblRValue_3.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblRValue_3.setBounds(12, 215, 86, 24);
		contentPane.add(lblRValue_3);
		
		R2Value = new JTextField();
		R2Value.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		R2Value.setColumns(10);
		R2Value.setBounds(102, 218, 153, 24);
		contentPane.add(R2Value);
		
		lblNewLabel_6 = new JLabel("\u03A9");
		lblNewLabel_6.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(267, 215, 20, 24);
		contentPane.add(lblNewLabel_6);
		
		lblRValue_4 = new JLabel("Resolution");
		lblRValue_4.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblRValue_4.setBounds(12, 249, 96, 24);
		contentPane.add(lblRValue_4);
		
		Resolution = new JTextField();
		Resolution.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		Resolution.setColumns(10);
		Resolution.setBounds(102, 249, 153, 24);
		contentPane.add(Resolution);
		
		PathText = new JTextField();
		PathText.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		PathText.setColumns(10);
		PathText.setBounds(12, 307, 359, 24);
		contentPane.add(PathText);
		
		JButton PathButton = new JButton("...");
		PathButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				chooser.showDialog(chooser, null);
				
				File dir = chooser.getSelectedFile();
				
				if(dir != null) {
					PathText.setText(dir.getPath());
					System.out.println(dir.getPath());
				}
			}
		});
		PathButton.setBounds(378, 307, 45, 23);
		contentPane.add(PathButton);
		
		JButton GenerateButton = new JButton("Generate");
		GenerateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!checkBlank(R1Ohm) || !checkBlank(R1Temperature) || !checkBlank(R2Ohm) || !checkBlank(R2Temperature)
						|| !checkBlank(R3Ohm) || !checkBlank(R3Temperature) || !checkBlank(R2Value) || !checkBlank(Resolution)) {
					
					return;
				}
				
				if(PathText.getText().isBlank()) {
					
					JOptionPane.showMessageDialog(null, "°æ·Î°¡ Àß¸øµÇ¾ú½À´Ï´Ù.","¿¡·¯ ¹ß»ý",JOptionPane.ERROR_MESSAGE);
					
					return;
				}
				
				ArrayList<Double> resistance = new ArrayList<Double>();
				ArrayList<Double> temperature = new ArrayList<Double>();
				SteinhartEquation steinhart;
				double R2value = Double.valueOf(R2Value.getText());
				int resolution = (int) Math.pow(2, Integer.valueOf(Resolution.getText()));
				
				resistance.add(Double.valueOf(R1Ohm.getText()));
				resistance.add(Double.valueOf(R2Ohm.getText()));
				resistance.add(Double.valueOf(R3Ohm.getText()));
				
				temperature.add(Double.valueOf(R1Temperature.getText()) + 273.15);
				temperature.add(Double.valueOf(R2Temperature.getText()) + 273.15);
				temperature.add(Double.valueOf(R3Temperature.getText()) + 273.15);
				
				steinhart = new SteinhartEquation(resistance, temperature);
				CircuitCalculator circuit = new CircuitCalculator(R2value, resolution);
				
				StringBuilder builder = new StringBuilder("\n");
				builder.append("const double TemperatureTable[");
				builder.append(resolution);
				builder.append("] = {\n");
				for(int i = 1; i < resolution; i++) {
					
					System.out.println(circuit.getResistance(i));
					builder.append(String.format("   %.3f,", steinhart.getTemperature(circuit.getResistance(i))));
					
					if(i != 0 && i % 4 == 0) {
						
						builder.append("\n");
					}
				}
				
				builder.append("};\n");
				
				builder.append("double GetTemperature(uint32_t adc) {\n   \n   return TemperatureTable[adc - 1];\n}\n");
				
				try {
					OutputStream out = new FileOutputStream(chooser.getSelectedFile().getPath() + "\\TemperatureTable.c");
					byte[] data = builder.toString().getBytes();
					out.write(data);
					
					out.close();
				} catch (FileNotFoundException e1) {
					System.out.println("°æ·Î Àß¸øµÊ");
				} catch (IOException e1) {
					System.out.println("¾²´Â°Å Àß¸øµÊ");
				}
				
				builder = new StringBuilder("#ifndef __TEMPERATURE_TABLE_H__\n");
				builder.append("#define __TEMPERATURE_TABLE_H__\n\n");
				builder.append("double GetTemperature(uint32_t adc);\n\n");
				builder.append("#endif /* __TEMPERATURE_TABLE_H__ */\n");
				
				try {
					OutputStream out = new FileOutputStream(chooser.getSelectedFile().getPath() + "\\TemperatureTable.h");
					byte[] data = builder.toString().getBytes();
					out.write(data);
					
					out.close();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		GenerateButton.setBounds(542, 395, 132, 61);
		contentPane.add(GenerateButton);
		
		JLabel lblRValue_4_1 = new JLabel("Path");
		lblRValue_4_1.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblRValue_4_1.setBounds(12, 283, 96, 24);
		contentPane.add(lblRValue_4_1);
		
		JLabel lblRValue_1_2_1 = new JLabel("Bit");
		lblRValue_1_2_1.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblRValue_1_2_1.setBounds(270, 249, 28, 24);
		contentPane.add(lblRValue_1_2_1);
	}
	
	private boolean checkBlank(JTextField object) {
		
		String s;
		
		if(object.getText().isBlank()) {
			
			JOptionPane.showMessageDialog(null, "¸ðµç °ªÀÌ ÀÔ·ÂµÇ¾î¾ß ÇÕ´Ï´Ù.","¿¡·¯ ¹ß»ý",JOptionPane.ERROR_MESSAGE);
			return false;
		}
		
		s = object.getText();
		
		try {
			Double.valueOf(s);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "¼ýÀÚ¸¦ ÀÔ·ÂÇØ¾ß ÇÕ´Ï´Ù.","¿¡·¯ ¹ß»ý",JOptionPane.ERROR_MESSAGE);
			return false;
		}
		
		return true;
	}
}
