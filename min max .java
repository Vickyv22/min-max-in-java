import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GFG {
	public static Integer findMin(List<Integer> list)
	{
		if (list == null || list.size() == 0) {
			return Integer.MAX_VALUE;
		}
		List<Integer> sortedlist = new ArrayList<>(list);
		Collections.sort(sortedlist);
		return sortedlist.get(0);
	}
	public static Integer findMax(List<Integer> list)
	{
		if (list == null || list.size() == 0) {
			return Integer.MIN_VALUE;
		}
		List<Integer> sortedlist = new ArrayList<>(list);
		Collections.sort(sortedlist);
		return sortedlist.get(sortedlist.size() - 1);
	}

	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
		list.add(446768);
		list.add(111);
		list.add(222345);
		list.add(339999);
		System.out.println("Min: " + findMin(list));
		System.out.println("Max: " + findMax(list));
	}
}
