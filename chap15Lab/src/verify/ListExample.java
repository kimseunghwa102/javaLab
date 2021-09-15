package verify;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//타입 변수 = new생성자;
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
		System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}

}
