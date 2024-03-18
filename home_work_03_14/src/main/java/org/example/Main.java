package org.example;
/* 1 уровень сложности: Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
Login:
1) Длина login должна быть меньше 20 символов и начинаться с латинской буквы.
2*) Login должен содержать только латинские буквы, цифры и знак подчеркивания.
Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
Password:
1) Длина password должна быть меньше 20 символов.
2*) Должен содержать только латинские буквы, цифры.
Также password и confirmPassword должны быть равны.
Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.

WrongPasswordException и WrongLoginException - пользовательские классы исключения с  конструкторами:
1) один по умолчанию;
2*) второй принимает сообщение исключения и передает его в конструктор класса Exception.
Метод возвращает true, если значения верны или false в другом случае.
Обработка исключений проводится в вызывающем методе.

 */
public class Main {
    public static void main(String[] args) throws Exception {
        setEntryAccount("J78_kssjTR__","q234Q","q234Q");


    }

    public static void setEntryAccount(String login,String password,String confirmPassword) throws Exception {
        if(login.isEmpty() || login.isBlank())throw new Exception("Поле login не может быть пустым");
        for (char i = 'A'; i <= 'z'; i++) {
            if (login.length() > 20 && login.charAt(0) != i)throw new Exception("Login введен не верно");
        }
        char[] chars = login.toCharArray();
        for (char symbol : chars) {
            if(!Character.isLetter(symbol) && !Character.isDigit(symbol) && symbol != '_')throw new Exception("WrongLoginException");
        }
        if (password.isEmpty() || password.isBlank())throw new Exception("Поле Password не может быть пустым");
        char[] charPass = password.toCharArray();
        for (char symbol : charPass) {
            if(!Character.isLetter(symbol) && !Character.isDigit(symbol))
                throw new Exception("WrongPasswordException");
        }
        if(!password.equals(confirmPassword) || password.length() > 20)throw new Exception("WrongPasswordException");
    }
}