package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
1. Написать регулярное выражение для проверка email (например my_25@domen-38.de).
2.* Написать регулярное выражение для проверки корректности нового пароля,
который соответствует определенным критериям:
- состоять минимум из 8 символов;
- должен обязательно включать хотя бы одну маленькую букву;
- должен обязательно включать хотя бы одну большую букву;
- должен обязательно включать хотя бы одну цифру;
- должен обязательно включать хотя бы один спецсимвол (пример: !@#$%^&*_+-=);

 */
public class Main {
    public static void main(String[] args) {
        String email = "my_25@domen-38.de";
        String regEx = "\\w+@\\w+\\W+\\d+\\.[A-za-z]+";
        System.out.println(Pattern.matches(regEx, email));

        String password = "a9J7*$#^";
        String regEx1 = "[\\w\\W]{8,}";
        System.out.println(Pattern.matches(regEx1,password));



    }
}