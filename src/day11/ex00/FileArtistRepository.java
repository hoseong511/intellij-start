package day11.ex00;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : day11.ex00
 * fileName       : FileArtistRepository
 * author         : hoho
 * date           : 4/24/24
 * description    :
 */
public class FileArtistRepository implements ArtistRepository {
	private static Map<String, Artist> repo;
	private static final String SAVE_PATH = "./src/day11/ex00/save.txt";

	public FileArtistRepository() {
		repo = new HashMap<>();
		loadFile();
	}

	@Override
	public Artist searchByName(String artistName) {
		return repo.get(artistName);
	}

	@Override
	public void addArtist(Artist artist) {
		repo.put(artist.getName(), artist);
		this.saveFile();
	}

	@Override
	public boolean addPlayList(Artist found, String title) {
		boolean flag = found.addPlayList(title);
		if (flag) {
			this.saveFile();
		}
		return flag;
	}

	@Override
	public int size() {
		return repo.size();
	}

	public void saveFile() {
		try (FileOutputStream fos = new FileOutputStream(SAVE_PATH)) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(repo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void loadFile() {
		File file = new File(SAVE_PATH);
		if (file.exists()) {
			try (FileInputStream fis = new FileInputStream(SAVE_PATH)) {
				ObjectInputStream ois = new ObjectInputStream(fis);
				repo = (Map<String, Artist>) ois.readObject();
			} catch (FileNotFoundException e) {
				throw new RuntimeException(e);
			} catch (IOException e) {
				System.out.println("입력된 텍스트가 없음");
			} catch (ClassNotFoundException e) {
				throw new RuntimeException(e);
			}
		} else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
