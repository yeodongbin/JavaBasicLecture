package memoNote;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.StringWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Memo extends JFrame {
	JTextArea ta;
	String fileName;

	public Memo(String title) {
		setTitle(title);
		JMenu mFile = new JMenu("File");
		JMenu mOpenFile = new JMenu("Open File");
		JMenu mNewFile = new JMenu("New File");
		JMenu mSaveFile = new JMenu("Save File");
		JMenu mSaveAsFile = new JMenu("Save Another File Name");
		JMenu mExit = new JMenu("Exit");

		mFile.add(mNewFile);
		mFile.add(mOpenFile);
		mFile.add(mSaveFile);
		mFile.add(mSaveAsFile);
		mFile.addSeparator();
		mFile.add(mExit);

		JMenuBar mb = new JMenuBar();
		mb.add(mFile);
		setJMenuBar(mb);// 메뉴 부착
		ta = new JTextArea();

		JScrollPane jsp = new JScrollPane();
		jsp.setViewportView(ta);
		add(jsp);

		// New File
		mNewFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setTitle("No Title");
				ta.setText("");
			}
		});
		
		// 탐색창 ->
		mOpenFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				JFileChooser fc = new JFileChooser(); // 탐색창

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

				if (a == 1) { // 실패시
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

		setSize(500, 400);
		setVisible(true);
	}

	private void fileSave(String fileName) {
		try {
			PrintStream ps = new PrintStream(fileName);
			ps.println(ta.getText());
			ps.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void fileRead(String fileName) {
		try {
			FileReader fr = new FileReader(fileName);
			StringWriter sw = new StringWriter(); // 문자열을 저장한다.

			while (true) {
				int ch = fr.read();

				if (ch == 1) {
					break;
				}
				sw.write(ch);
				ta.setText(sw.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		new Memo("No Title");
	}
}
