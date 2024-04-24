package day12.lambda;

/**
 * packageName    : day12.lambda
 * fileName       : GenericFunction
 * author         : hoho
 * date           : 4/24/24
 * description    :
 */
public interface GenericFunction<X, Y> {
	// input x , output y
	Y apply(X x);
}
