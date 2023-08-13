/**
 * Задание 3.2
 Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа.
 Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */

package Task3;

public class EmptyIndexAppealException extends RuntimeException {

    public EmptyIndexAppealException() {
        super("Вы обратились к пустой ячейке массива");
    }
}
