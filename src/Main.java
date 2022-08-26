public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");
        {
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            //     String fullName = lastName + firstName + middleName;
            System.out.printf("ФИО сотрудника — %s %s %s", lastName, firstName, middleName);
            //     System.out.println("ФИО сотрудника — " + fullName);
            System.out.println();
        }
        // Задание 2
        System.out.println("Задание 2");
        {
            String fullName = "Ivanov Ivan Ivanovich";
            //       String fullName2 = fullName.toUpperCase();
            //       System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName2);
            System.out.printf("Данные ФИО сотрудника для заполнения отчета — %S", fullName);
        }
        System.out.println();

        // Задание 3
        {
            System.out.println("Задание 3");
            String fullName = "Иванов Семён Семёнович";
            fullName = fullName.replace("ё", "е");
            System.out.println("Данные ФИО сотрудника — " + fullName);
        }

        // Задание 5
        System.out.println("Задание 5");
        {
            String fullName = "Ivanov Ivan Ivanovich";
            String lastName = fullName.substring(fullName.indexOf(""), fullName.indexOf(" "));
            String firstName = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" "));
            String middleName = fullName.substring(fullName.lastIndexOf(" "), fullName.lastIndexOf(""));
            System.out.println("Имя сотрудника - " + firstName);
            System.out.println("Отчество сотрудника - " + middleName);
            System.out.println("Фамилия сотрудника — " + lastName);
        }

        // Задание 6
        {
            System.out.println("Задание 6");
            String fullName = "ivanov ivan ivanovich";
            String lastName = fullName.substring(fullName.indexOf(""), fullName.indexOf(" "));
            String firstName = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" "));
            String middleName = fullName.substring(fullName.lastIndexOf(" "), fullName.lastIndexOf(""));
            StringBuilder correct = new StringBuilder();
            correct.append("" + lastName.substring(0, 1).toUpperCase() + lastName.substring(1, lastName.length()) +
                    firstName.substring(0, 1).toUpperCase() + firstName.substring(1, firstName.length()) +
                    middleName.substring(0, 1).toUpperCase() + middleName.substring(1, middleName.length()));

            System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + correct);

        }
        String fullName = "ivanov ivan ivanovich";
        String correctFullName = "";
        correctFullName = correctFullName + fullName.substring(0, 1).toUpperCase(); //первый символ делаем заглавным
        for (int i = 1; i < fullName.length(); i++) {
            // смотрим, был ли слева пробел:
            if (" ".equals(fullName.substring(i - 1, i)))
                correctFullName = correctFullName + fullName.substring(i, i + 1).toUpperCase();
            else
                correctFullName = correctFullName + fullName.substring(i, i + 1);
        }
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + correctFullName);


        StringBuilder builder = new StringBuilder(fullName);
        // if (Character.isAlphabetic(fullName.codePointAt(0)))    выставляем первый символ заглавным, если это буква
        builder.setCharAt(0, Character.toUpperCase(fullName.charAt(0)));
        //крутимся в цикле, и меняем буквы, перед которыми пробел на заглавные
        for (int i = 1; i < fullName.length(); i++)
            //    if (Character.isAlphabetic(fullName.charAt(i)) && Character.isSpaceChar(fullName.charAt(i - 1)))
            if (Character.isSpaceChar(fullName.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(fullName.charAt(i)));

        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + builder.toString());


        // Задание 7
        System.out.println("Задание 7");
        String first = "135";
        String second = "246";
        StringBuilder str = new StringBuilder();
        str.append("" + first.charAt(0) + second.charAt(0) + first.charAt(1) + second.charAt(1) + first.charAt(2) + second.charAt(2));
        System.out.println("Данные строки — " + str);


        // Задание 8
        System.out.println("Задание 8");
        String haotic = "aabccddefgghiijjkk";
        char[] arr = haotic.toCharArray();
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            if (arr[i] == arr[j]) {
                System.out.print(arr[j]);
                j++;
            }
        }
        System.out.println();

    }

}