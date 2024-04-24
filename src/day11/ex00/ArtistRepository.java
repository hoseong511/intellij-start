package day11.ex00;

/**
 * packageName    : day11.ex00
 * fileName       : ArtistRepository
 * author         : hoho
 * date           : 4/23/24
 * description    :
 */
public interface ArtistRepository {
	Artist searchByName(String artistName);
	void addArtist(Artist artist);

	boolean addPlayList(Artist found, String title);
	int size();
}
