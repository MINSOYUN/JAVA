package IOEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteStreamEx {
	public static void main(String[] args) {
		FileByteStreamEx ex = new FileByteStreamEx(); 
		ex.fileSave();
		ex.fileRead();
	}
	
	
	public void fileRead() {
		// 사용한 자원을 닫아주기 위해서 상단에 선언합니다
		FileInputStream fis =null;
		
		try {
			fis = new FileInputStream("a_byte.dat");
			
			/*
			 * 파일로부터 데이터를 읽어올 때는 read() 메소드를 사용하면 된다
			 * 하지만 실제로 파일에는 얼마만큼의 데이터가 있는지 모른다
			 * read() 메소드는 더 이상 읽어올 데이터가 없으면 -1을 리턴한다
			 * 따라서 반복문을 사용해서 read() 메소드에서 -1이 리턴되기 전까지
			 * 데이터를 읽어오면 된다
			 */
			int value = 0;
			// 데이터를 읽어서 value 변수에 저장
			// -1: 문장의 끝
			while((value = fis.read()) != -1) {
			    System.out.println((char)value);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (IOException e) {
				System.out.println(e.getMessage());
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} // finally 끝
	} // 메서드 끝
	
	
	public void fileSave() {
		FileOutputStream fos = null;
		try {
			// 프로젝트 내부에 파일이 생성
			fos = new FileOutputStream("a_byte.dat");
			fos.write(97); // a 저장된다
			fos.write('b'); // b 저장 / char -> int 타입으로 형변환가능
			fos.write(10);
			// 문자 기반 스트림이라 '한' -> '\' 으로 출력된다
//			fos.write('한');
			
			byte[] byteArry = {'a','b','c','d'};
			fos.write(byteArry);
			fos.write(10);
			// (배열이름, 시작인덱스, 갯수)
			fos.write(byteArry, 1, 2);;
			
			fos.flush();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			// 사용중인 자원이 있다면 종료시켜줍니다
			if(fos!=null) {
				try {
					//스트림을 이용했으면 닫아 주어야 한다
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} // if 끝
		} // finally 끝
		
	}
}
