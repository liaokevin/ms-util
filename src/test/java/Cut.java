import org.junit.Test;

import com.mingsoft.util.ImageUtil;

public class Cut {

	@Test
	public static void main(String[] args) {
		ImageUtil.cut(0, 0, 100, 100, "/Users/killfen/Downloads/sds.jpg", "/Users/killfen/Downloads/sds-1.jpg");
	}
}
