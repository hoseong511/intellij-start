package day10.inter.ex00;

import datastruct.linked.Node;
import datastruct.linked.NodeList;

/**
 * packageName    : day10.inter.ex00
 * fileName       : MediaPlayer
 * author         : hoho
 * date           : 4/22/24
 * description    :
 */

class VideoPlayer implements MediaPlayable{
	@Override
	public void play() {
		System.out.println("video를 재생합니다");
	}

	@Override
	public void pause() {

	}

	@Override
	public void stop() {

	}
}

// 오디오 재생을 위한 클래스
class AudioPlayer implements MediaPlayable{

	@Override
	public void play() {
		System.out.println("audio를 재생합니다");
	}

	@Override
	public void pause() {

	}

	@Override
	public void stop() {

	}
}

// 이미지 디스플레이를 위한 클래스
class ImageDisplay implements MediaPlayable{

	@Override
	public void play() {
		System.out.println("audio를 재생합니다");
	}

	@Override
	public void pause() {

	}

	@Override
	public void stop() {

	}
}

// 미디어 플레이어 관리 클래스
class MediaPlayer {
	private NodeList mediaList = new NodeList();

	public void addMedia(MediaPlayable media) {
		mediaList.add(new Node(media));
	}

	public void playAll() {
		Node curr = mediaList.getHead();
		while (curr != null) {
			((MediaPlayable)curr.getObj()).play();
			curr = curr.getNext();
		}
	}
}