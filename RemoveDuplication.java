import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * List 중복 값 제거하는 클래스
 * 
 * @author yblee
 * @since 2023.03.16
 */
public class RemoveDuplication {
    /**
     * (non-javadoc)
     * 
     * @author yblee
     * @since 2023.03.16
     * 
     */
    public static void main(String args[]) {
        List<Integer> DuplicateList = Arrays.asList(1, 1, 2, 3, 4, 4);
        Set<Integer> RemoveDuplicationSet = new HashSet<>(DuplicateList);
        System.out.println(DuplicateList);
        System.out.println(RemoveDuplicationSet);
    }
}