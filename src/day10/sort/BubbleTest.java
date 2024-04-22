package day10.sort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : day10.sort
 * fileName       : BubbleTest
 * author         : hoho
 * date           : 4/22/24
 * description    :
 */
class BubbleTest {
	@Test
	@DisplayName("bubble sort")
	public void bubble() {
		Bubble.sort(new int[]{3, 4, 1, -1, 6, 22});
	}

}