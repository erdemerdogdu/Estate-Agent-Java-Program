package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SystemAndMain.BuildingSys;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddFrame extends JFrame {

	private JPanel nofloor;
	private JTextField age;
	private JTextField area;
	private JTextField address;
	private JTextField livingunit;
	private JTextField condofee;
	private JTextField floorno;
	private JTextField gardenarea;
	private JTextField name;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddFrame frame = new AddFrame();
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
	public AddFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		nofloor = new JPanel();
		nofloor.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(nofloor);
		nofloor.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Building Type");
		lblNewLabel.setBounds(10, 10, 100, 30);
		nofloor.add(lblNewLabel);
		
		JComboBox villatype = new JComboBox();
		villatype.setModel(new DefaultComboBoxModel(new String[] {"Dublex", "Triplex", "Forleks"}));
		villatype.setBounds(116, 375, 96, 25);
		nofloor.add(villatype);
		
		JCheckBox elavatorhas = new JCheckBox("");
		elavatorhas.setBounds(116, 215, 93, 21);
		nofloor.add(elavatorhas);
		
		JCheckBox fireplace = new JCheckBox("");
		fireplace.setBounds(116, 454, 93, 21);
		nofloor.add(fireplace);
		
		JCheckBox jacuzzi = new JCheckBox("");
		jacuzzi.setBounds(116, 494, 93, 21);
		nofloor.add(jacuzzi);
		
		JComboBox rooftype = new JComboBox();
		rooftype.setModel(new DefaultComboBoxModel(new String[] {"Round Roof", "Gable Roof"}));
		rooftype.setBounds(116, 528, 96, 25);
		nofloor.add(rooftype);
		
		JCheckBox poolhas = new JCheckBox("");
		poolhas.setBounds(116, 414, 93, 21);
		nofloor.add(poolhas);
		
		JRadioButton apartmentradio = new JRadioButton("Apartment");
		buttonGroup.add(apartmentradio);
		apartmentradio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				name.setEditable(true);
				age.setEditable(true);
				area.setEditable(true);
				address.setEditable(true);
				livingunit.setEditable(true);
				floorno.setEditable(true);
				condofee.setEditable(true);
				gardenarea.setEditable(false);
				villatype.setEnabled(false);
				elavatorhas.setEnabled(true);
				rooftype.setEnabled(false);
				fireplace.setEnabled(false);
				poolhas.setEnabled(false);
				jacuzzi.setEnabled(false);
			}
		});
		apartmentradio.setBounds(116, 15, 73, 21);
		nofloor.add(apartmentradio);
		
		JRadioButton villaradio = new JRadioButton("Villa");
		buttonGroup.add(villaradio);
		villaradio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				livingunit.setEditable(false);
				floorno.setEditable(false);
				condofee.setEditable(false);
				gardenarea.setEditable(true);
				villatype.setEnabled(true);
				poolhas.setEnabled(true);
				elavatorhas.setEnabled(false);
				rooftype.setEnabled(false);
				fireplace.setEnabled(false);
				jacuzzi.setEnabled(false);
			}
		});
		villaradio.setBounds(191, 15, 73, 21);
		nofloor.add(villaradio);
		
		JRadioButton bungalovradio = new JRadioButton("Bungalov");
		buttonGroup.add(bungalovradio);
		bungalovradio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				livingunit.setEditable(false);
				floorno.setEditable(false);
				condofee.setEditable(false);
				gardenarea.setEditable(false);
				villatype.setEnabled(false);
				poolhas.setEnabled(false);
				elavatorhas.setEnabled(false);
				rooftype.setEnabled(true);
				fireplace.setEnabled(true);
				jacuzzi.setEnabled(true);
			}
		});
		bungalovradio.setBounds(266, 15, 73, 21);
		nofloor.add(bungalovradio);
		
		JLabel lblBuildingAge = new JLabel("Building Age");
		lblBuildingAge.setBounds(10, 75, 100, 30);
		nofloor.add(lblBuildingAge);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(269, 106, 307, 447);
		nofloor.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.setText("This is an information area.\nPlease do not try to write anything on it\n");
			}
		});
		scrollPane.setViewportView(textArea);
		
		age = new JTextField();
		age.setBounds(116, 81, 96, 19);
		nofloor.add(age);
		age.setColumns(10);
		
		JLabel lblBuildingArea = new JLabel("Building Area");
		lblBuildingArea.setBounds(10, 104, 100, 30);
		nofloor.add(lblBuildingArea);
		
		JLabel lblBuildingAddress = new JLabel("Building Address");
		lblBuildingAddress.setBounds(10, 130, 100, 30);
		nofloor.add(lblBuildingAddress);
		
		area = new JTextField();
		area.setColumns(10);
		area.setBounds(116, 110, 96, 19);
		nofloor.add(area);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(116, 136, 96, 19);
		nofloor.add(address);
		
		JLabel lblLivingUnitPer = new JLabel("Living Unit Per Floor");
		lblLivingUnitPer.setBounds(10, 170, 100, 30);
		nofloor.add(lblLivingUnitPer);
		
		JLabel lblElavator = new JLabel("Elavator");
		lblElavator.setBounds(10, 210, 100, 30);
		nofloor.add(lblElavator);
		
		JLabel lblCondoFee = new JLabel("Condo Fee");
		lblCondoFee.setBounds(10, 250, 100, 30);
		nofloor.add(lblCondoFee);
		
		JLabel lblNoOfFloor = new JLabel("Number of Floor");
		lblNoOfFloor.setBounds(10, 290, 100, 30);
		nofloor.add(lblNoOfFloor);
		
		livingunit = new JTextField();
		livingunit.setColumns(10);
		livingunit.setBounds(116, 176, 96, 19);
		nofloor.add(livingunit);
		
		condofee = new JTextField();
		condofee.setColumns(10);
		condofee.setBounds(116, 256, 96, 19);
		nofloor.add(condofee);
		
		floorno = new JTextField();
		floorno.setColumns(10);
		floorno.setBounds(116, 296, 96, 19);
		nofloor.add(floorno);
		
		
		
		JLabel lblGardenArea = new JLabel("Garden Area");
		lblGardenArea.setBounds(10, 330, 100, 30);
		nofloor.add(lblGardenArea);
		
		JLabel lblVillaType = new JLabel("Villa Type");
		lblVillaType.setBounds(10, 370, 100, 30);
		nofloor.add(lblVillaType);
		
		JLabel lblPool = new JLabel("Pool");
		lblPool.setBounds(10, 409, 100, 30);
		nofloor.add(lblPool);
		
		gardenarea = new JTextField();
		gardenarea.setColumns(10);
		gardenarea.setBounds(116, 336, 96, 19);
		nofloor.add(gardenarea);
		
		
		JLabel asdfg = new JLabel("Fireplace");
		asdfg.setBounds(10, 449, 100, 30);
		nofloor.add(asdfg);
		
		JLabel jaculab = new JLabel("Jacuzzi");
		jaculab.setBounds(10, 489, 100, 30);
		nofloor.add(jaculab);
		
		JLabel asd = new JLabel("Roof Type");
		asd.setBounds(10, 523, 100, 30);
		nofloor.add(asd);
		
		
		
		JButton add = new JButton("Add");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(apartmentradio.isSelected())
				{
					if(name.getText().equalsIgnoreCase("") || age.getText().equalsIgnoreCase("") || area.getText().equalsIgnoreCase("") || address.getText().equalsIgnoreCase("") || livingunit.getText().equalsIgnoreCase("") || condofee.getText().equalsIgnoreCase("") || floorno.getText().equalsIgnoreCase(""))
					{
						textArea.setText("There are missing fields\n");
					}
					else
					{
						BuildingSys.addBuilding("Apartment",name.getText(), Integer.parseInt(age.getText()), Double.parseDouble(area.getText()), address.getText(), 0.0, Integer.parseInt(livingunit.getText()), elavatorhas.isSelected(),Double.parseDouble(condofee.getText()), Integer.parseInt(floorno.getText()), 0.0, "", false, false, false, "");
						textArea.setText("Apartment named "+ name.getText()+ " is added\n");
					}
					
				}
				else if(villaradio.isSelected())
				{
					
					if(name.getText().equalsIgnoreCase("") || age.getText().equalsIgnoreCase("") || area.getText().equalsIgnoreCase("") || address.getText().equalsIgnoreCase("") || gardenarea.getText().equalsIgnoreCase(""))
					{
						textArea.setText("There are missing fields\n");
					}
					else
					{
						BuildingSys.addBuilding("Villa",name.getText(), Integer.parseInt(age.getText()), Double.parseDouble(area.getText()), address.getText(), 0.0, 0, false,0.0, 0, Double.parseDouble(gardenarea.getText()), String.valueOf(villatype.getSelectedItem()), poolhas.isSelected(), false, false, "");
						textArea.setText("Villa named "+ name.getText()+ " is added\n");
					}
					
				}
				else if(bungalovradio.isSelected())
				{
					if(name.getText().equalsIgnoreCase("") || age.getText().equalsIgnoreCase("") || area.getText().equalsIgnoreCase("") || address.getText().equalsIgnoreCase(""))
					{
						textArea.setText("There are missing fields\n");
					}
					else
					{
						BuildingSys.addBuilding("Bungalov",name.getText(), Integer.parseInt(age.getText()), Double.parseDouble(area.getText()), address.getText(), 0.0, 0, false,0.0, 0, 0.0, "", false, fireplace.isSelected(), jacuzzi.isSelected(), String.valueOf(rooftype.getSelectedItem()));
						textArea.setText("Bungalov named "+ name.getText()+ " is added\n");
					}
					
				}
				else
				{
					textArea.setText("Please Select a type of building\n");
				}
			}
		});
		add.setBounds(266, 55, 100, 30);
		nofloor.add(add);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				name.setText("");
				age.setText("");
				area.setText("");
				address.setText("");
				livingunit.setText("");
				floorno.setText("");
				condofee.setText("");
				gardenarea.setText("");
				villatype.setSelectedIndex(0);
				elavatorhas.setSelected(false);
				rooftype.setSelectedIndex(0);
				fireplace.setSelected(false);
				poolhas.setSelected(false);
				jacuzzi.setSelected(false);
			}
		});
		clear.setBounds(376, 55, 100, 30);
		nofloor.add(clear);
		
		JLabel lblBuildingAge_1 = new JLabel("Building Name");
		lblBuildingAge_1.setBounds(10, 50, 100, 30);
		nofloor.add(lblBuildingAge_1);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(116, 52, 96, 19);
		nofloor.add(name);
		
		JButton close = new JButton("Close");
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		close.setBounds(486, 55, 100, 30);
		nofloor.add(close);
		
		
		
		
	}
}
