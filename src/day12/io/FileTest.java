package day12.io;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.SimpleInput;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * packageName    : day12.io
 * fileName       : FileTest
 * author         : hoho
 * date           : 4/24/24
 * description    :
 * <p>
 * - try with resource
 * - 바이트 기반 스트림
 * - 텍스트 기반 스트림 FileWriter, FileReader
 */

class FileWriterReaderTest {
	@Test
	void writer() {
		String targetPath = FileTest.ROOT_PATH + "/hello/hobby.txt";

		try (FileWriter fw = new FileWriter(targetPath)) {
//			String hobby = SimpleInput.input("취미를 입력하세요!!\n>>");
			String outputMessage = String.format("내 취미는 00입니다.\n");
			fw.write(outputMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void reader() {
		try (FileReader fr = new FileReader(FileTest.ROOT_PATH + "/hello/hobby.txt")){

		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}


class FileInputTest {
	@Test
	@DisplayName("main 파일 읽기 테스트")
	void 파일읽기() {
		try (
				FileInputStream fis = new FileInputStream(FileTest.ROOT_PATH + "/hello/food.txt");
		) {
			int data = 0;
			while ((data = fis.read()) != -1) {
				System.out.write(data);
				data = fis.read();
				System.out.write(data);
				System.out.flush();
			}
//			byte[] b = new byte[30];
//			int len = fis.read(b);
//			System.out.println(new String(b, 0, len));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}

class FileOutputTest {

	@Test
	@DisplayName("main 파일 쓰기 테스트")
	void 파일쓰기() {
		String message = "hello world!";

		try (
				FileOutputStream fos = new FileOutputStream(FileTest.ROOT_PATH + "/hello/food.txt");
		) {
			fos.write("abcdefghijklmnop".getBytes(StandardCharsets.UTF_8));
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로를 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("파일 쓰기 중 에");
		}
//		finally { // 무조건 실행되는 영역 -> auto closeable 로 대체 하기
//			//
//			try {
//				if (fos != null) {
//					fos.close();
//				}
//			} catch (IOException e) {
//				throw new RuntimeException(e);
//			}
//		}
	}

	@Test
	@DisplayName("Scanner 방식으로 쓰기")
	void scanner_쓰기() {

	}
}

public class FileTest {
	public static final String ROOT_PATH = "/Users/hoho/IdeaProjects/start/src/day12";

	public void fileIO() {
		// 파일 객체
		File directory = new File(ROOT_PATH + "/hello");

		// 폴더 생성
		if (!directory.exists()) directory.mkdir();

		File newFile = new File(ROOT_PATH + "/hello/food.txt");
		try {
			if (!newFile.exists()) newFile.createNewFile();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Test
	@DisplayName("main 파일 테스트")
	void 파일() {
		fileIO();
	}

}
