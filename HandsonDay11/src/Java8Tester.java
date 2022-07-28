import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Tester {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(list);
	
		List<Integer> collect = list.stream().filter(x->x>3).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> even = list.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(even);

	}

}
