package day12.stream;

/**
 * packageName    : day12.stream
 * fileName       : DishDetail
 * author         : hoho
 * date           : 4/25/24
 * description    :
 */
public class DishDetail {
	private final String dishName;
	private final String type;

	public DishDetail(Dish dish) {
		this.dishName = dish.getName();
		this.type = dish.getType().getDesc();
	}

	@Override
	public String toString() {
		return "DishDetail{" +
				"dishName='" + dishName + '\'' +
				", type='" + type + '\'' +
				'}';
	}

	public String getDishName() {
		return dishName;
	}

	public String getType() {
		return type;
	}
}
