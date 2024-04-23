package day11.ex00;

import day07.modi.pac1.A;
import util.SimpleInput;

/**
 * packageName    : day11.ex00
 * fileName       : ArtistView
 * author         : hoho
 * date           : 4/23/24
 * description    :
 */
public class ArtistViewImpl implements ArtistView {

	private final ArtistRepository repository;

	public ArtistViewImpl(ArtistRepository repository) {
		this.repository = repository;
	}

	public void start() {
		while (true) {
			if (selectMenu() == 0)
				break;
		}
	}

	private int selectMenu() {
		switch (mainMenu()) {
			case "1":
				registerMenu();
				break;
			case "2":
				search();
				break;
			case "3":
				System.out.println("프로그램을 종료합니다.");
				return 0;
			default:
				System.out.println("입력한 메뉴 번호를 확인해주세요.!");
				break;
		}
		return 1;
	}

	private void search() {
		System.out.println("# 검색할 가수명을 입력하세요.");
		String name = SimpleInput.input("- 가수명: ");
		Artist found = repository.searchByName(name);
		if (found == null) {
			System.out.println("# 해당 가수는 등록되지 않았습니다.");
		} else {
			System.out.println("# " + name + "님의 노래목록");
			System.out.println("========================");
			found.showPlayList();
		}
		System.out.println();
	}

	private void registerMenu() {
		System.out.println("# 노래 등록을 시작합니다.");
		String artistName = SimpleInput.input("- 가수명: ");
		String songTitle = SimpleInput.input("- 노래명: ");
		Artist found = repository.searchByName(artistName);
		if (found == null) {
			repository.addArtist(new Artist(artistName, songTitle));
			System.out.println("# " + artistName + "님이 신규 등록되었습니다.");
		} else {
			if (found.addPlayList(songTitle))
				System.out.println("# " + artistName + "님의 노래목록에 " + songTitle + "곡이 추가되었습니다.");
			else
				System.out.println("# [" + songTitle + "]곡은 이미 등록된 노래입니다.");
		}
		System.out.println();
	}

	private String mainMenu() {
		System.out.println("***** 음악 관리 프로그램 *****\n" +
				"# 현재 등록된 가수: " + repository.size() + "명\n" +
				"# 1. 노래 등록하기\n" +
				"# 2. 노래 정보 검색\n" +
				"# 3. 프로그램종료\n" +
				"========================");
		return SimpleInput.input(">> ");
	}
}
