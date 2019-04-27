import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class MadLibGUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtOne, txtTwo, txtThree, txtFour, txtFive, txtSix, txtSeven, txtEight, txtNine;
	private JTextField[] fields = {
			txtOne = new JTextField(), txtTwo = new JTextField(), txtThree = new JTextField(), 
			txtFour = new JTextField(), txtFive = new JTextField(), txtSix = new JTextField(),
			txtSeven = new JTextField(), txtEight = new JTextField(), txtNine = new JTextField()
					};
	private String template;
	private JLabel lblChrissWackyMadlibs, lblNewLabel;
	private JButton btnResult;
	private JTextArea textArea;
	private JButton btnRefresh;
	private JLabel lblanAdjectiveNot;
	private JLabel lblsomethingYouDo;
	private JLabel lblANumber;
	private JLabel lblAPlace;
	private JLabel lblAdjectiveEndingIn;
	private JLabel lblAPastTense;
	private JLabel lblAdjectiveNotEnding;
	private JLabel lblANoun;
	
	private void createMadLib() {
		template = "The %s farmer %s %s %s on his farm in %s before he %s %s with his %s %s.";
		String error_message = "field cannot be empty";
		Boolean valid = true;
		String[] input = new String[fields.length];
		for (int i = 0; i < fields.length; i++) {
			input[i] = fields[i].getText();
			if (input[i].equals("") || input[i].equals(error_message)) {
				valid = false;
				fields[i].setText(error_message);
			}
			// System.out.println(input[i]);
		}
		if (valid) {
			textArea.setText(String.format(template, (Object[])input));
			btnResult.setVisible(false);
			btnRefresh.setVisible(true);
		}
	}
	
	private void refreshGUI() {
		for (int i = 0; i < fields.length; i++) {
			fields[i].setText("");
			btnRefresh.setVisible(false);
			btnResult.setVisible(true);
			textArea.setText("");
		}
	}
	
	public MadLibGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Chris's GUI MadLibs");
		getContentPane().setLayout(null);
		
		// txtOne JTextField
		txtOne.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtOne.selectAll();
			}
		});
		txtOne.setHorizontalAlignment(SwingConstants.RIGHT);
		txtOne.setBounds(22, 82, 202, 19);
		getContentPane().add(txtOne);
		txtOne.setColumns(10);
		
		// txtTwo JTextField
		txtTwo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTwo.selectAll();
			}
		});
		txtTwo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTwo.setBounds(272, 82, 202, 19);
		getContentPane().add(txtTwo);
		txtTwo.setColumns(10);
		
		// txtThree JTextField
		txtThree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtThree.selectAll();
			}
		});
		txtThree.setHorizontalAlignment(SwingConstants.RIGHT);
		txtThree.setBounds(22, 133, 202, 19);
		getContentPane().add(txtThree);
		txtThree.setColumns(10);
		
		// txtFour JTextField
		txtFour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtFour.selectAll();
			}
		});
		txtFour.setHorizontalAlignment(SwingConstants.RIGHT);
		txtFour.setBounds(272, 133, 202, 19);
		getContentPane().add(txtFour);
		txtFour.setColumns(10);
		
		// txtFive JTextField
		txtFive.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtFive.selectAll();
			}
		});
		txtFive.setHorizontalAlignment(SwingConstants.RIGHT);
		txtFive.setBounds(22, 181, 202, 19);
		getContentPane().add(txtFive);
		txtFive.setColumns(10);
		
		// txtSix JTextField
		txtSix.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtSix.selectAll();
			}
		});
		txtSix.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSix.setBounds(272, 181, 202, 19);
		getContentPane().add(txtSix);
		txtSix.setColumns(10);
		
		// txtSeven JTextField
		txtSeven.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtSeven.selectAll();
			}
		});
		txtSeven.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSeven.setBounds(22, 230, 202, 19);
		getContentPane().add(txtSeven);
		txtSeven.setColumns(10);
		
		// txtEight JTextField
		txtEight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEight.selectAll();
			}
		});
		txtEight.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEight.setBounds(272, 230, 202, 19);
		getContentPane().add(txtEight);
		txtEight.setColumns(10);
		
		// txtNine JTextField
		txtNine.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNine.selectAll();
			}
		});
		txtNine.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNine.setBounds(22, 279, 202, 19);
		getContentPane().add(txtNine);
		txtNine.setColumns(10);
		
		lblChrissWackyMadlibs = new JLabel("CHRIS'S WACKY MADLIBS APP!");
		lblChrissWackyMadlibs.setFont(new Font("Laksaman", Font.BOLD, 24));
		lblChrissWackyMadlibs.setHorizontalAlignment(SwingConstants.CENTER);
		lblChrissWackyMadlibs.setBounds(12, 12, 474, 26);
		getContentPane().add(lblChrissWackyMadlibs);
		
		lblNewLabel = new JLabel("Fill in the fields!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("FreeMono", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(22, 46, 446, 15);
		getContentPane().add(lblNewLabel);
		
		btnResult = new JButton("View Result!");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createMadLib();
			}
		});
		btnResult.setBounds(272, 283, 202, 25);
		getContentPane().add(btnResult);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Dialog", Font.PLAIN, 16));
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.BLACK);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setBounds(22, 328, 451, 78);
		getContentPane().add(textArea);
		
		btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refreshGUI();
			}
		});
		btnRefresh.setBounds(272, 283, 202, 25);
		getContentPane().add(btnRefresh);
		
		lblanAdjectiveNot = new JLabel("adjective not ending in \"ly\"");
		lblanAdjectiveNot.setHorizontalAlignment(SwingConstants.RIGHT);
		lblanAdjectiveNot.setFont(new Font("FreeMono", Font.ITALIC, 12));
		lblanAdjectiveNot.setBounds(12, 99, 212, 19);
		getContentPane().add(lblanAdjectiveNot);
		
		lblsomethingYouDo = new JLabel("something you do to a thing");
		lblsomethingYouDo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblsomethingYouDo.setFont(new Font("FreeMono", Font.ITALIC, 11));
		lblsomethingYouDo.setBounds(260, 102, 214, 15);
		getContentPane().add(lblsomethingYouDo);
		
		lblANumber = new JLabel("a number");
		lblANumber.setFont(new Font("FreeMono", Font.ITALIC, 12));
		lblANumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblANumber.setBounds(12, 152, 212, 15);
		getContentPane().add(lblANumber);
		
		JLabel lblAnAnimalIn = new JLabel("an animal in plural form");
		lblAnAnimalIn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAnAnimalIn.setFont(new Font("FreeMono", Font.ITALIC, 12));
		lblAnAnimalIn.setBounds(277, 152, 197, 15);
		getContentPane().add(lblAnAnimalIn);
		
		lblAPlace = new JLabel("a place");
		lblAPlace.setFont(new Font("FreeMono", Font.ITALIC, 12));
		lblAPlace.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAPlace.setBounds(22, 201, 202, 15);
		getContentPane().add(lblAPlace);
		
		lblAdjectiveEndingIn = new JLabel("adjective ending in \"ly\"");
		lblAdjectiveEndingIn.setFont(new Font("FreeMono", Font.ITALIC, 12));
		lblAdjectiveEndingIn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdjectiveEndingIn.setBounds(272, 200, 202, 15);
		getContentPane().add(lblAdjectiveEndingIn);
		
		lblAPastTense = new JLabel("a past tense verb");
		lblAPastTense.setFont(new Font("FreeMono", Font.ITALIC, 12));
		lblAPastTense.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAPastTense.setBounds(22, 250, 202, 15);
		getContentPane().add(lblAPastTense);
		
		lblAdjectiveNotEnding = new JLabel("an adjective");
		lblAdjectiveNotEnding.setFont(new Font("FreeMono", Font.ITALIC, 12));
		lblAdjectiveNotEnding.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdjectiveNotEnding.setBounds(272, 249, 202, 15);
		getContentPane().add(lblAdjectiveNotEnding);
		
		lblANoun = new JLabel("a noun");
		lblANoun.setFont(new Font("FreeMono", Font.ITALIC, 12));
		lblANoun.setHorizontalAlignment(SwingConstants.RIGHT);
		lblANoun.setBounds(22, 299, 202, 15);
		getContentPane().add(lblANoun);
		btnRefresh.setVisible(false);
	}

	public static void main(String[] args) {
		MadLibGUI madLibGUI = new MadLibGUI();
		madLibGUI.setSize(new Dimension(500,450));
		madLibGUI.setVisible(true);
	}
}
