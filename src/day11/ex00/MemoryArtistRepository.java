package day11.ex00;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : day11.ex00
 * fileName       : ArtistRepository
 * author         : hoho
 * date           : 4/23/24
 * description    :
 */
public class MemoryArtistRepository implements ArtistRepository {
	private static Map<String, Artist> repo = new HashMap<>();

	@Override
	public Artist searchByName(String artistName) {
		return repo.get(artistName);
	}

	@Override
	public void addArtist(Artist artist) {
		repo.put(artist.getName(), artist);
	}

	@Override
	public int size() {
		return repo.size();
	}
}
