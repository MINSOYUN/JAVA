package chap2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {
	public static void main(String[] args) {
		FileIO io = new FileIO();
//		io.fileIOCopy();
		io.fileCopy();
	}
	
	/**
	 * 파일 복사하기
	 * A_File.java 파일을 읽어서
	 * A_File_copy.java 파일을 생성합니다 
	 */
	public void fileIOCopy() {
		long startTime, endTime;
		// 시작시간
		startTime = System.currentTimeMillis();

		// 클래스 우클릭 프로퍼티스 주소 자체 복사 -> 좋은점: 파일존재하는 오류로 미리 확인 가능
		File file = new File("D:\\Users\\user\\Downloads\\work\\high\\src\\IOEx\\A_File.java");
		file.exists();

		// 파일의 존재 여부를 확인 후 존재하지 않으면 종료
		if(!file.exists()) {
			System.out.println("파일이 존재하지 않습니다");
			return;
		}
		
		try(FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream("A_File_copy.java")) {
			
			int value = 0;
			// 1바이트씩 읽어 옵니다
			// -1 : EndOffFile	
			
			int i=0;
			byte[] byteArry = new byte[100];
			// byte 배열에 읽어온 갯수 만큼 반환 됩니다
			while((i = fis.read(byteArry)) != -1) {
				// 읽어온 갯수만큼 출력합니다
				// 마지막 출력시 배열의 갯수를 다 채우지 못하면
				// 이전에 읽어들인 내용이 출력됩니다
				fos.write(byteArry,0,i);
			}

//			while((value = fis.read()) != -1) {
//				System.out.print((char)value);
//				fos.write(value);
//			}
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		endTime = System.currentTimeMillis();
		System.out.println("소요시간: "+ (endTime - startTime));
		
	} // 메서드 끝
	
	
	/**
	 * 복사하기 - 복사할 파일 준비
	 * FileInputStream 읽어와서 (변수명)
	 * FileOutputStream 저장하기 (클래스이름)
	 */
	public void fileCopy(){
		long startTime,  endTime;
		startTime = System.currentTimeMillis();
		// 파일 복사하기
		File f = new File("D:\\Users\\user\\Downloads\\work\\high\\src\\IOEx\\10_2_예외처리.pptx");
		f.exists();
		
		if(!f.exists()) {
			System.out.println("파일이 존재하지 않습니다");
			return;
		}
		
		try (FileInputStream fi = new FileInputStream(f);
				FileOutputStream fo = new FileOutputStream("예외처리_copy.pptx")){
			int value = 0;
//			while((value = fi.read()) != -1) {
//				System.out.print((char)value);
//				fo.write(value);
//			}
			
			int i=0;
			byte[] byteArry = new byte[1024];
			// byte 배열에 읽어온 갯수 만큼 반환 됩니다
			while((i = fi.read(byteArry)) != -1) {
				fo.write(byteArry,0,i);
			}
			
			fo.flush();
		} catch (Exception e) {
			
		} endTime = System.currentTimeMillis();
			System.out.println("소요시간: "+(endTime - startTime));
		} // 메서드끝
		
	}
	
