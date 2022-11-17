public class Main {
    public static void main(String[] args) {

        System.out.println(" Урок 1.7.");
        System.out.println(" Задача 1.");

        String firstName = " Ivan ";
        String middleName = " Ivanovich ";
        String lastName = " Ivanov ";
        String fullName = " Ivan Ivanovich Ivanov ";
       // fullName = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println(" Задача 2.");


        String fullName2 = " IVAN IVANOVICH IVANOV ";
        boolean fullNameEqualsfullName2 = false;
        if (fullNameEqualsfullName2 = fullName.equals(fullName2)) ;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName2);

        System.out.println(" Задача 3.");

        String fullName3 = " Иванов Семён Семёнович ";
        fullName3 = fullName3.replace("ё", "е");
        System.out.println("ФИО сотрудника - " + fullName3);

        System.out.println("почему с первого раза не получается сделать Pull requests?");
    }
}