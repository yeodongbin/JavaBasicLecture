package memoNote;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.StringWriter;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Memo extends JFrame {
	JMenuBar menuBar;
	JTextArea textArea;
	JMenu mFile;
	JMenuItem mOpenFile;
	JMenuItem mNewFile;
	JMenuItem mSaveFile;
	JMenuItem mSaveAsFile;
	JMenuItem mExit;
	JMenu helpMenu;
	JMenuItem helpInfo;

	String fileName;

	public Memo(String title) {
		init();
		// New File
		mNewFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setTitle("No Title");
				textArea.setText("");
			}
		});

		// Å½»öÃ¢ ->
		mOpenFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				JFileChooser fc = new JFileChooser(); // Å½»öÃ¢

				int a = fc.showOpenDialog(Memo.this);
				if (a == JFileChooser.CANCEL_OPTION) {
					return;
				}

				File f = fc.getSelectedFile();
				fileName = f.getPath();
				setTitle(f.getName());
				fileRead(fileName);
			}
		});

		mSaveFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (getTitle().equals("No Title")) {
					JFileChooser fc = new JFileChooser();
					int a = fc.showSaveDialog(Memo.this);
					if (a == JFileChooser.CANCEL_OPTION)
						return;

					File f = fc.getSelectedFile();
					fileName = f.getPath();
					setTitle(f.getName());
				} else {
					fileSave(fileName);
				}
			}
		});

		mSaveAsFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				int a = fc.showSaveDialog(Memo.this);

				if (a == 1) { // ½ÇÆÐ½Ã
					return;
				}

				File f = fc.getSelectedFile();
				fileName = f.getPath();
				setTitle(f.getName());
				fileSave(fileName);
			}
		});

		mExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		helpInfo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				InfoDialog infoDialog = new InfoDialog("2018-12-02");
			}
		});

		setTitle(title);
		setSize(500, 400);
		setVisible(true);
	}

	private void init() {
		menuBar = new JMenuBar();
		textArea = new JTextArea();
		mFile = new JMenu("File");
		mOpenFile = new JMenuItem("Open File");
		mNewFile = new JMenuItem("New File");
		mSaveFile = new JMenuItem("Save");
		mSaveAsFile = new JMenuItem("SaveAs");
		mExit = new JMenuItem("Exit");
		helpMenu = new JMenu("Help");
		helpInfo = new JMenuItem("Information");

		mFile.add(mNewFile);
		mFile.add(mOpenFile);
		mFile.add(mSaveFile);
		mFile.add(mSaveAsFile);
		mFile.addSeparator();
		mFile.add(mExit);
		helpMenu.add(helpInfo);

		mFile.setSize(new Dimension(30, 100));
		mFile.setFont(new Font("°íµñ", Font.ITALIC, 20));
		helpMenu.setSize(new Dimension(30, 100));
		helpMenu.setFont(new Font("°íµñ", Font.ITALIC, 20));

		menuBar.add(mFile);
		menuBar.add(helpMenu);
		setJMenuBar(menuBar);// ¸Þ´º ºÎÂø

		JScrollPane jsp = new JScrollPane();
		jsp.setViewportView(textArea);
		add(jsp);
	}

	private void fileSave(String fileName) {
		try {
			PrintStream ps = new PrintStream(fileName);
			ps.println(textArea.getText());
			ps.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void fileRead(String fileName) {
		try {
			FileReader fr = new FileReader(fileName);
			StringWriter sw = new StringWriter(); // ¹®ÀÚ¿­À» ÀúÀåÇÑ´Ù.

			while (true) {
				int ch = fr.read();

				if (ch == 1) {
					break;
				}
				sw.write(ch);
				textArea.setText(sw.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		new Memo("No Title");
	}
}

class InfoDialog extends JDialog {
	JLabel jlb = new JLabel("");

	public InfoDialog(String str) {
		super.setTitle("Information");
		super.setSize(100, 100);
	
		getContentPane().add(jlb);
		jlb.setText(str.toString());
	
		this.setSize(200, 100);
		this.setModal(true);
		this.setVisible(true);
	}
}
