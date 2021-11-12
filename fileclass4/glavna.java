package fileclass4;

public class glavna {
	public static void main(String[] args) {
		readfile rf = new readfile();
		rf.openFile();
		rf.readFile();
		rf.closeFile();
	}
}
