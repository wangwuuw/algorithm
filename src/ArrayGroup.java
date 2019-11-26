import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wangwu
 * @Date: Created in 13:57 2019-11-26
 * @Description:数组分组
 *
 */
public class ArrayGroup {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		for (int i = 0; i < 20; i++) {
			arrayList.add(i);
		}
		int size = arrayList.size();
		int i = size / 5+1;
		int from;
		int to;
		for (int j = 0; j < i; j++) {
			from =j*5;
			to =(j+1)*5;
			if (to>size) {
				to=size;
			}
			List list = arrayList.subList(from, to);
			for (int k = 0; k <list.size() ; k++) {
				System.out.println(list.get(k));
			}
			System.out.println();
		}

	}
}
