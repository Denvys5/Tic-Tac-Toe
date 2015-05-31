package tictactoe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Screen{
	public static boolean fancy = false;
	public static JFrame frame;
	public static JFrame result;
	public static JPanel panel = new JPanel();
	public static JPanel panelResults = new JPanel();
	public static float pixel = 1;
	public static JMenu Menu;
	public static Dimension dimension = new Dimension(100, 100);
	public static JButton button1;
	public static JButton button2;
	public static JButton button3;
	public static JButton button4;
	public static JButton button5;
	public static JButton button6;
	public static JButton button7;
	public static JButton button8;
	public static JButton button9;
	public static JButton buttonCloseResults;
	public static ArrayList<JButton> Field = new ArrayList<JButton>();
	
	public static void Frame(){
		if(fancy){
			JFrame.setDefaultLookAndFeelDecorated(true);
		}
		
		Font font = new Font("Verdana", Font.PLAIN, 11);
		
		frame = new JFrame("Tic-Tac-Toe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JMenu fileMenu = new JMenu("File");
        fileMenu.setFont(font);
		JMenuBar menuBar = new JMenuBar();
		fileMenu.addSeparator();
		JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setFont(font);
        exitItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				System.exit(0);
			}
        });
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        
        
		panel.setLayout(null);
		Buttons();
		
		frame.getContentPane().add(panel);
		frame.setSize(615, 658);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void Buttons(){
		ImageIcon button = createIcon("icon1.png");

		button1 = new JButton("1");
		button1.setIcon(button);
		button1.setPreferredSize(dimension);
		button1.setBounds(0, 0, 200, 200);
		button1.addActionListener(new Actions(button1));
		panel.add(button1);
		Field.add(button1);
		
		button2 = new JButton("2");
		button2.setIcon(button);
		button2.setPreferredSize(dimension);
		button2.setBounds(200, 0, 200, 200);
		button2.addActionListener(new Actions(button2));
		panel.add(button2);
		Field.add(button2);
		
		button3 = new JButton("3");
		button3.setIcon(button);
		button3.setPreferredSize(dimension);
		button3.setBounds(400, 0, 200, 200);
		button3.addActionListener(new Actions(button3));
		panel.add(button3);
		Field.add(button3);
		
		button4 = new JButton("4");
		button4.setIcon(button);
		button4.setPreferredSize(dimension);
		button4.setBounds(0, 200, 200, 200);
		button4.addActionListener(new Actions(button4));
		panel.add(button4);
		Field.add(button4);
		
		button5 = new JButton("5");
		button5.setIcon(button);
		button5.setPreferredSize(dimension);
		button5.setBounds(200, 200, 200, 200);
		button5.addActionListener(new Actions(button5));
		panel.add(button5);
		Field.add(button5);
		
		button6 = new JButton("6");
		button6.setIcon(button);
		button6.setPreferredSize(dimension);
		button6.setBounds(400, 200, 200, 200);
		button6.addActionListener(new Actions(button6));
		panel.add(button6);
		Field.add(button6);
		
		button7 = new JButton("7");
		button7.setIcon(button);
		button7.setPreferredSize(dimension);
		button7.setBounds(0, 400, 200, 200);
		button7.addActionListener(new Actions(button7));
		panel.add(button7);
		Field.add(button7);
		
		button8 = new JButton("8");
		button8.setIcon(button);
		button8.setPreferredSize(dimension);
		button8.setBounds(200, 400, 200, 200);
		button8.addActionListener(new Actions(button8));
		panel.add(button8);
		Field.add(button8);
		
		button9 = new JButton("9");
		button9.setIcon(button);
		button9.setPreferredSize(dimension);
		button9.setBounds(400, 400, 200, 200);
		button9.addActionListener(new Actions(button9));
		panel.add(button9);
		Field.add(button9);
	}
	
	public static ImageIcon createIcon(String path){
		URL imgURL = TicTacToe.class.getResource("images/" + path);
		if(imgURL != null){
			return new ImageIcon(imgURL);
		} else{
			System.err.println("File not found " + path);
			return null;
		}
	}
	
	public static ImageIcon getIconFromPlayer(){
		if(TicTacToe.player == 1) return createIcon("Circle.png");
		if(TicTacToe.player == 2) return createIcon("Cross.png");
		return null;
	}
	
	public static void Win(){
		blockButtons();
		frame = new JFrame("You win!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonCloseResults = new JButton("OK!");
		buttonCloseResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				System.exit(0);
			}
			
		});
		panelResults.add(buttonCloseResults);
		frame.getContentPane().add(panelResults);
		frame.setSize(200, 100);
		frame.setLocationByPlatform(true);
		frame.setVisible(true);
	}
	
	public static void Draw(){
		blockButtons();
		frame = new JFrame("Draw!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonCloseResults = new JButton("OK!");
		buttonCloseResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				System.exit(0);
			}
			
		});
		panelResults.add(buttonCloseResults);
		frame.getContentPane().add(panelResults);
		frame.setSize(200, 100);
		frame.setLocationByPlatform(true);
		frame.setVisible(true);
	}
	
	public static void blockButtons(){
		for(JButton button : Field){
			button.setEnabled(false);
		}
	}
}
