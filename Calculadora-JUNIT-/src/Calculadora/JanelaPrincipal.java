package Calculadora;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


@SuppressWarnings("serial")
public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;
	private JTextField ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		num1 = new JTextField();
		num1.setBounds(10, 67, 86, 20);
		contentPane.add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setBounds(106, 67, 86, 20);
		contentPane.add(num2);
		num2.setColumns(10);
		
		ans = new JTextField();
		ans.setBounds(290, 67, 86, 20);
		contentPane.add(ans);
		ans.setColumns(10);
		
		JLabel label = new JLabel("=");
		label.setBounds(214, 70, 46, 14);
		contentPane.add(label);
		
		JButton add = new JButton("+");
		add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				int x, y;
				x = Integer.parseInt(num1.getText());
				y = Integer.parseInt(num2.getText());
				ans.setText((x+y)+"");
			}
		});
		add.setBounds(10, 109, 89, 23);
		contentPane.add(add);
		
		JButton sub = new JButton("-");
		sub.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				int x, y;
				x = Integer.parseInt(num1.getText());
				y = Integer.parseInt(num2.getText());
				ans.setText((x-y)+"");
			}
		});
		sub.setBounds(106, 109, 89, 23);
		contentPane.add(sub);
		
		JButton mult = new JButton("*");
		mult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				int x, y;
				x = Integer.parseInt(num1.getText());
				y = Integer.parseInt(num2.getText());
				ans.setText((x*y)+"");
			}
		});
		mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mult.setBounds(207, 109, 89, 23);
		contentPane.add(mult);
		
		JButton did = new JButton("/");
		did.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				int x, y;
				x = Integer.parseInt(num1.getText());
				y = Integer.parseInt(num2.getText());
				if(y==0){
					ans.setText(0+"");
					JOptionPane.showMessageDialog(null, "Operação inválida! Tente outra vez");
				}
				else{
					ans.setText((x/y)+"");
				}
			}
		});
		did.setBounds(306, 109, 89, 23);
		contentPane.add(did);
	}
}
