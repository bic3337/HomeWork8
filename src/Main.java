import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] salaryArray = {12_000, 30_000, 70_000, 4500};
        int salarySum = 0;
        for (int salary : salaryArray) {
            salarySum += salary;
        }
        System.out.println("Сумма трат за месяц " + salarySum + " рублей.");
        System.out.println(" ");
        int[] salaryArray1 = {12_000, 30_000, 70_000, 4500};
        int salarySum1 = 0;
        int minSum = salaryArray1[0];
        int maxSum = salaryArray1[0];
        for (int salary : salaryArray1) {
            if (salary < minSum) {
                minSum = salary;
            }
            if (salary > maxSum) {
                maxSum = salary;
            }
            System.out.println(" Минимальная сумма трат за неделю составила " + minSum + " рублей.");
            System.out.println("Максимальная сумма трат за неделю составила " + maxSum + " рублей.");
            System.out.println(" ");
        }
        int[] salaryArray3 = {12_000, 30_000, 70_000, 4500};
        int salarySum3 = 0;
        for (int salary : salaryArray3) {
            salarySum3 += salary;
        }
        System.out.println("Средняя сумма трат за месяц составила " + salarySum3 / salaryArray3.length + " рублей.");
        System.out.println(" ");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i= 0;i<reverseFullName.length/2 ;i++){
            char temp =reverseFullName[i];
            reverseFullName[i]=reverseFullName[reverseFullName.length-1-i];
            reverseFullName[reverseFullName.length-1-i]=temp;

        }
        System.out.println(Arrays.toString(reverseFullName));

    }

}





