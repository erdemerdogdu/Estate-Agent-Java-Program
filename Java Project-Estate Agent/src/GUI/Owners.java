package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Inheritance.Building;
import SystemAndMain.BuildingSys;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Owners extends JFrame {

	private JPanel contentPane;
	private JComboBox<String> comboBox;
	private JTextArea textArea;
	private JTextField ownerid;
	
	public JComboBox<String> getComboBox() {
	     return comboBox;
	 }
	
	public void setTextArea(String res) {
	    textArea.setText(res);
	 }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Owners frame = new Owners();
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
	public Owners() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 80, 466, 373);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.setText("This is a result display area\nPLEASE DONT TRY TO CHANGE RESULTS MANUALLY");
			}
		});
		scrollPane.setViewportView(textArea);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 10, 150, 30);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = (String) comboBox.getSelectedItem();
				Building a = BuildingSys.searchBuilding(name);
				String allOwners = a.displayAllOwner();
				if(!allOwners.equalsIgnoreCase(""))
				{
					textArea.setText(allOwners);
				}
				else
				{
					textArea.setText("There is no owner of this Building");
				}
				
			}
		});
		contentPane.add(comboBox);
		
		comboBox.setModel(new DefaultComboBoxModel(BuildingSys.getBuildingName()));
		
		ownerid = new JTextField();
		ownerid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				 if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					 
					 String temp =ownerid.getText();
						
						if(temp.equalsIgnoreCase(""))
						{
							textArea.setText("Please enter a Owner id");
						}
						else
						{
							int id= Integer.parseInt(temp);
							
							if(BuildingSys.searchBuilding((String) comboBox.getSelectedItem()).deleteOwner(id))
							{
								textArea.setText("Owner is deleted\n");
								
							}
							else
							{
								textArea.setText("There is no owner of this building with this id\n");
							}
						}		
						
					
				 }
			}
		});
		ownerid.setBounds(280, 46, 100, 30);
		contentPane.add(ownerid);
		ownerid.setColumns(10);
		
		JButton removebtn = new JButton("Remove");
		removebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String temp =ownerid.getText();
				
				if(temp.equalsIgnoreCase(""))
				{
					textArea.setText("Please enter a Owner id");
				}
				else
				{
					int id= Integer.parseInt(temp);
					
					if(BuildingSys.searchBuilding((String) comboBox.getSelectedItem()).deleteOwner(id))
					{
						textArea.setText("Owner is deleted\n");
						
					}
					else
					{
						textArea.setText("There is no owner of this building with this id\n");
					}
				}		
				
			}
		});
		removebtn.setBounds(170, 45, 100, 30);
		contentPane.add(removebtn);
		
		
		
		
		
		JButton addbtn = new JButton("Add");
		addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddOwner ao = new AddOwner();
				String name = (String) comboBox.getSelectedItem();
				Building a = BuildingSys.searchBuilding(name);
				ao.setA(a);
				ao.setVisible(true);
				
			}
		});
		addbtn.setBounds(170, 10, 100, 30);
		contentPane.add(addbtn);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(280, 10, 100, 30);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnClose);
		
		
		
		
		
	}
}
