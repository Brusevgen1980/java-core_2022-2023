package lr5;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class Example6 {
    public static Object xf;
    private static Object getXff;
    private static Integer Example6SuppClass;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Создадим пустой объект");
        AtomicReference<Integer> someClass;
        someClass = new AtomicReference<>();
        var voidClass = void.class;
        Object example6;
        SuppClass();
        System.out.println("Присвоем ему 2 значения: 15 и 19 c помощью функции");
        Object yf = null;
        Object SuppClass;
        var xf2 = xf;
        var xf21 = xf2;
        var xf211 = xf21;
        var xf3 = xf211;
        var xf1 = xf211;
        var xf2111 = xf211;
        someClass.setOpaque(Example6SuppClass) ;
        for (String s : Arrays.asList("Проверим max(с помощью функции getMax()): " + someClass.get() + "" +
                " , проверим min(с помощью функции getMin(): " + someClass.get(), "Проверим работу функции присвоения значенния с одной переменной setValue(): ")) {
            System.out.println(s);
        }
        someClass.wait();
        System.out.println("Выведем значение с помощью функции printAllValues():");
        someClass.wait();
        System.out.println("Присвоем значение еще ниже ранее присвоенного с помощью ф-ии setValue: ");
        someClass.setOpaque (25);
        System.out.println("Выведем результат в консоль: ");
        someClass.wait();
    }

    private static void SuppClass() {
    }
}


/*      Напишите программу с классом, в котором есть два закрытых
        целочисленных поля (назовем их max и min). Значение поля max не может
        быть меньше значения поля min. Значения полям присваиваются с помощью
        открытого метода. Метод может вызываться с одним или двумя
        целочисленными аргументами. При вызове метода значения полям
        присваиваются так: сравниваются текущие значения полей и значения
        аргументов, переданных методу. Самое большое из значений присваивается
        полю max, а самое маленькое из значений присваивается полю min.
        Предусмотрите конструктор, который работает по тому же принципу, что и
        метод для присваивания значений полям. В классе также должен быть метод,
        отображающий в консольном окне значения полей объекта.*/
