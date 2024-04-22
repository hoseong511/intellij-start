package day10.inter.ex00;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : day10.inter.ex00
 * fileName       : MediaPlayerTest
 * author         : hoho
 * date           : 4/22/24
 * description    :
 */
class MediaPlayerTest {
	MediaPlayer player;

	@BeforeEach
	public void beforeEach() {
		player = new MediaPlayer();
		player.addMedia(new VideoPlayer());
		player.addMedia(new AudioPlayer());
		player.addMedia(new ImageDisplay());
	}

	@Test
	@DisplayName("main")
	void main() {
		player.playAll();
	}

	@Test
	@DisplayName("pause")
	void showPause() {

	}


}