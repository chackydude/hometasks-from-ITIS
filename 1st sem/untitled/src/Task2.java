public class Task2 {
    public static void main(String[] args) {
        int[] array = {123, 1234, 12345, 123, 12};
        int[] array2 = new int[array.length];
        int k = 2;
        int buffer;
        int buffer2;
        int numCounter = 0;
        boolean isSorted = false;
        for (int i = 0; i < array.length; i++) {
            array2[i] = calcDigit(array[i]);
        }
        // bubble sort
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array2.length - 1; i++) {
                if (array2[i] > array2[i+1]) {
                        isSorted = false;

                        buffer2 = array2[i];
                        array2[i] = array2[i+1];
                        array2[i+1] = buffer2;

                        buffer = array[i];
                        array[i] = array[i+1];
                        array[i+1] = buffer;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(' ');
        }
        for (int i = 1; i < array.length-1; i++) {
            if (checkNum(array, i)) {
                numCounter++;
            }
        }
        if (numCounter > k) {
            System.out.println(false);
        } else System.out.println(true);
    }

    public static int calcDigit(int n) {
        int counter = 0;
        while (n > 0) {
            n = n / 10;
            counter++;
        }
        return counter;
    }

    public static boolean checkNum(int[] array, int i) {
        if ((array[i] > array[i+1] && array[i] > array[i+1])) {
            return true;
        } return false;
    }
}
// площадь треугольника:
/*
S = 1/2 a * h
S = 1/2 a*b*sin(degC)
S = Math.sqrt(p*(p-a)*(p-b)*(p-c))
S= p*r (r - радиус вписанной)
S = a^2/ 2*(2(ctg(degC) + ctg(degC)))
Теорема косинусов
 с^2 = a^2 + b^2 - 2*a*b*cos(угла, лежащего напротив стороны c)
 */

// площадь паралелограмма
/*
S = a*h
S = a*b*sin(alpha), alpha = угол между a и b
S = 1/2 * d1 * d2 * sinB, d1, d2 - диагонали, sinB - инус меньшего угла между диагоналями

 */

// площадь ромба
/*
S = d1*d2/2,  d1,d2 - диагонали
 */

// площадь шестиугольника
/*
S = 3 * sqrt(3)* a^2 / 2
 */
// площадь трапеции
/*
S = 1/2 * (a + b) * h

восходящее преобразование
Object sam = new Employee("Sam", "Oracle");
нисходящее преобразование
Employee emp = (Employee)sam;
emp.display();
System.out.println(emp.getCompany());
 */


// уравнение прямой y = kx + b