package day11.ex00;

/**
 * packageName    : day11.ex00
 * fileName       : App
 * author         : hoho
 * date           : 4/23/24
 * description    :
 */
public class App {
	public static void main(String[] args) {
		AppConfig appConfig = new AppConfig();
		ArtistView artistView = appConfig.artistView();
		artistView.start();
	}
}
