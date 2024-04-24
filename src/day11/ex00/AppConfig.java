package day11.ex00;

/**
 * packageName    : day11.ex00
 * fileName       : AppConfig
 * author         : hoho
 * date           : 4/23/24
 * description    :
 */
public class AppConfig {
	public ArtistView artistView() {
		return new ArtistViewImpl(artistRepository());
	}
	private static ArtistRepository artistRepository() {
		return new FileArtistRepository();
	}
}
