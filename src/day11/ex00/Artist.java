package day11.ex00;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * packageName    : day11.song
 * fileName       : Artist
 * author         : hoho
 * date           : 4/23/24
 * description    :
 */
public class Artist implements Serializable {
	private String name;
	private Set<String> playList ;

	public Artist(String name, String title) {
		this.name = name;
		this.playList = new HashSet<>();
		this.playList.add(title);
	}

	public boolean addPlayList(String title) {
		return playList.add(title);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getPlayList() {
		return playList;
	}

	public void showPlayList() {
		int idx = 1;
		for (String s : playList) {
			System.out.println("* " + idx + ". " + s);
			idx++;
		}
	}
}
