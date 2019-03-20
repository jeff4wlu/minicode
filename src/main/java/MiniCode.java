/**
 * @author Lu Weijian
 * @description 备注
 * @email lwj@kapark.cn
 * @date 2019-03-20 19:32
 */
public class MiniCode {

    public static void PerformRequirementOne() {

        int i = 1;
        int condition = 0;
        while (i <= 100) {

            if (0 == (i % 15)) {
                System.out.println("FizzBuzz");
                i++;
                condition = 0;
                continue;
            }

            if (0 == (i % 3)) {
                System.out.println("Fizz");
            } else if (0 == (i % 5)) {
                System.out.println("Buzz");
            }else
                System.out.println(Integer.toString(i));

            i++;
            condition = 0;
        }

    }

    public static void PerformRquirementTwo() {
        int i = 1;
        int condition = 0;
        while (i <= 100) {
            String strI = Integer.toString(i);

            if (0 == (i % 3) || strI.contains("3")) {
                condition = 1;
            }

            if (0 == (i % 5) || strI.contains("5")) {
                condition = condition + 2;
            }

            if (3 == condition)
                System.out.println("FizzBuzz");
            else if (1 == condition)
                System.out.println("Fizz");
            else if (2 == condition)
                System.out.println("Buzz");
            else
                System.out.println(strI);

            i++;
            condition = 0;
        }
    }
}
