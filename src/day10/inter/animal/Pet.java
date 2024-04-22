package day10.inter.animal;

/**
 * packageName    : day10.inter.animal
 * fileName       : Pet
 * author         : hoho
 * date           : 4/22/24
 * description    :
 *
 * 애완동물이라면 반드시 가져야할 기능 명세
 * 1. 길들이기가 가능
 * 2. 예방 접종
 */
public interface Pet {
	// 위협적이지 않고 길들이기가 가능한지
	void handle();
	// 접종 여부
	boolean inject();
}
