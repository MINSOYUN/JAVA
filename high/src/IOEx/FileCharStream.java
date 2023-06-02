package IOEx;

import java.io.FileWriter;
import java.io.FileReader;

public class FileCharStream {
	public static void main(String[] args) {
		FileCharStream fcs = new FileCharStream();
		fcs.fileRead();
		fcs.fileSave();
	}
	
	public void fileRead() {
	    try (FileReader fr = new FileReader("b_char.txt")) {
	        int value = 0;
	        while ((value = fr.read()) != -1) {
	            System.out.println((char) value);
	        }
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
	}	
		
	public void fileSave() {
		// 리소스를 자동으로 close()
		// filewriter을 이용해서 파일을 생성하고 데이터를 문자단위로 저장한다
		try(FileWriter fw = new FileWriter("b_char.txt")) {
			fw.write("혼자서도 잘할 수 있습니다!");
			fw.write("IO 어떠신가요?!");
			fw.write("혼자서도 잘할 수 있습니다!");
			fw.write('S');
			fw.write(' ');
			fw.write('\n');
			fw.write("혼자서도 잘할 수 있습니다!");
			
			fw. flush();
		} catch (Exception e) {
			
		} finally {
			System.out.println(" fileSave() 종료");
		}
	}
}
