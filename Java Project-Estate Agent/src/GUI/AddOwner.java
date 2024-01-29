package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Inheritance.Building;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddOwner extends JFrame {

	private JPanel contentPane;
	private JTextField ownerid;
	private JTextField name;
	private JTextField age;
	
	private Building a;
	
	public void setA(Building a) {
		this.a = a;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddOwner frame = new AddOwner();
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
	public AddOwner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ownerid = new JTextField();
		ownerid.setBounds(92, 35, 111, 24);
		contentPane.add(ownerid);
		ownerid.setColumns(10);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(92, 80, 111, 24);
		contentPane.add(name);
		
		age = new JTextField();
		age.setColumns(10);
		age.setBounds(92, 172, 111, 24);
		contentPane.add(age);
		
		JComboBox gender = new JComboBox();
		gender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		gender.setBounds(92, 127, 111, 24);
		contentPane.add(gender);
		
		JCheckBox iscitizen = new JCheckBox("");
		iscitizen.setBounds(92, 220, 111, 24);
		contentPane.add(iscitizen);
		
		JTextArea textArea = new JTextArea();
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.setText("This is an information area.\nPlease do not try to write anything on it\n");
			}
		});
		textArea.setBounds(10, 270, 466, 183);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a==null)
				{
					textArea.setText("There is no building to add an owner\n");
				}
				else
				{
					if(ownerid.getText().equalsIgnoreCase("") || name.getText().equalsIgnoreCase("") || age.getText().equalsIgnoreCase("") )
					{
						textArea.setText("There are empty fields\n");
					}
					else
					{
						if(a.addOwner(Integer.parseInt(ownerid.getText()), name.getText(),String.valueOf(gender.getSelectedItem()),Integer.parseInt(age.getText()), iscitizen.isSelected()))
						{
							textArea.setText("An owner is added to Building named " + a.getBuildingName() + "\n");
						}
						else
						{
							textArea.setText("There is already an owner with this id\n");
						}
					}
				}
				
			}
		});
		btnNewButton.setBounds(282, 35, 111, 36);
		contentPane.add(btnNewButton);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setBounds(282, 160, 111, 36);
		contentPane.add(btnClose);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				age.setText("");
				gender.setSelectedIndex(0);
				ownerid.setText("");
				iscitizen.setSelected(false);
			}
		});
		btnClear.setBounds(282, 99, 111, 36);
		contentPane.add(btnClear);
		
		
		
		JLabel lblNewLabel = new JLabel("Owner ID");
		lblNewLabel.setBounds(10, 35, 72, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 80, 72, 24);
		contentPane.add(lblName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 125, 72, 24);
		contentPane.add(lblGender);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(10, 172, 72, 24);
		contentPane.add(lblAge);
		
		JLabel lblCitizen = new JLabel("Citizen");
		lblCitizen.setBounds(10, 220, 72, 24);
		contentPane.add(lblCitizen);
		
		
	}
}
