package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Inheritance.Building;
import SystemAndMain.BuildingSys;

import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BuildingFrame extends JFrame {

	private JPanel contentPane;
	private JTextField buildingName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuildingFrame frame = new BuildingFrame();
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
	public BuildingFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 126, 566, 407);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.setText("This is a result display area\nPLEASE DONT TRY TO CHANGE RESULTS MANUALLY");
			}
		});
		scrollPane.setViewportView(textArea);
		
		JButton display = new JButton("DisplayAll");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(BuildingSys.getAllBuilding());
			}
		});
		display.setBounds(10, 10, 129, 36);
		contentPane.add(display);
		
		JButton remove = new JButton("Remove Building");
		remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name= buildingName.getText();
				if(name.equalsIgnoreCase(""))
				{
					textArea.setText("Please enter a building name\n");
				}
				else
				{
					if(BuildingSys.removeBuilding(name))
					{
						textArea.setText("The building named " + name + " has been removed \n");
						buildingName.setText("");
					}
					else
					{
						textArea.setText("There is no building with this name\n");
					}
				}
				
				
			}
		});
		remove.setBounds(427, 10, 129, 36);
		contentPane.add(remove);
		
		JButton durability = new JButton("Durability Test");
		durability.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = buildingName.getText();
				if(name.equalsIgnoreCase(""))
				{
					textArea.setText("Please enter a building name to see durability test results\n");
				}
				else
				{
					Building a=BuildingSys.searchBuilding(name);
					if(a != null)
					{
						textArea.setText(a.toString()+"\nDurability Test Result\nThis building’s durability is "+a.durabilityTest());
						buildingName.setText("");
					}
					else
					{
						textArea.setText("There is no building with this name\n");
					}
				}
				
			}
		});
		durability.setBounds(288, 10, 129, 36);
		contentPane.add(durability);
		
		JButton add = new JButton("Add Building");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddFrame af= new AddFrame();
				af.setVisible(true);
			}
		});
		add.setBounds(149, 10, 129, 36);
		contentPane.add(add);
		
		
		
		buildingName = new JTextField();
		buildingName.setColumns(10);
		buildingName.setBounds(149, 56, 129, 36);
		contentPane.add(buildingName);
		
		JLabel lblNewLabel = new JLabel("Building Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 56, 129, 36);
		contentPane.add(lblNewLabel);
		
		JButton calcPrice = new JButton("Calculate Price");
		calcPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(Building temp: BuildingSys.getBuildingSet())
				{
					temp.calcPrice();
				}
			}
		});
		calcPrice.setBounds(427, 56, 129, 36);
		contentPane.add(calcPrice);
		
		JButton owners = new JButton("Owners Info");
		owners.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Owners ow = new Owners();
				ow.setVisible(true);
				
			}
		});
		owners.setBounds(288, 56, 129, 36);
		contentPane.add(owners);
	}
}
