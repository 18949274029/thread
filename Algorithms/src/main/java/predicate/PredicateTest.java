package predicate;

import java.util.function.Predicate;

/**
 * Created by Administrator on 2019/4/7 0007.
 */
public class PredicateTest {
    public static void main(String[] args) {



        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {

                return s.equals("zhangsan");
            }
        };

        System.out.println(predicate.test("lisi"));
        System.out.println("--- --- --- --- --- ---");
        System.out.println(predicate.test("zhangsan"));
    }
}
