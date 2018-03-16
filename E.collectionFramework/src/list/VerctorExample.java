package list;

import java.util.List;
import java.util.Vector;

public class VerctorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		list.add(new Board("title1", "content1", "writer1"));
		list.add(new Board("title2", "content2", "writer2"));
		list.add(new Board("title3", "content3", "writer3"));
		list.add(new Board("title4", "content4", "writer4"));

		list.remove(2);

		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + '\t' + board.content + '\t' + board.writer);
		}
	}
}

class Board {
	String subject;
	String content;
	String writer;

	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}
