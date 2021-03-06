package ОсновыJava.КлассыОбьектыМетоды;

public class Методы {
}
/*Методы
Как отмечалось выше, переменные экземпляра и методы — это две основные
составляющие классов. До сих пор класс Vehicle, рассматриваемый здесь
в качестве примера, содержал только данные, но не методы. Несмотря на то что
классы, включающие лишь одни данные, вполне допустимы, у большинства
классов должны быть также методы. Методы — это подпрограммы, которые манипулируют
данными, определенными в классе, а во многих случаях предоставляют
доступ к этим данным. Как правило, другие части программы взаимодействуют
с классом посредством его методов.
Метод состоит из одной или нескольких инструкций. В корректно написанной
программе на Java каждый метод выполняет только одну функцию. Каждый
метод обладает именем, которое используется для его вызова. Обычно в качестве
имени метода можно использовать любой действительный идентификатор.
Следует, однако, иметь в виду, что идентификатор main () зарезервирован для
метода, с которого начинается выполнение программы. Кроме того, в качестве
имен методов нельзя использовать ключевые слова Java.
При упоминании методов в тексте данной книги используется соглашение,
ставшее общепринятым в литературе по Java: после названия метода стоит пара
круглых скобок. Так, если методу присвоено имя getval, то в тексте книги он
упоминается как getval (). Подобная форма записи позволяет отличать имена
методов от имен переменных при чтении книги.
Ниже приведен общий синтаксис объявления метода.
возращаемый_тип имя{список_параметров) {
// тело метода
Здесь возращаемый_тип обозначает тип данных, возвращаемых методом.
Им может быть любой допустимый тип, в том числе и тип класса, который
вы создаете. Если метод не возвращает значение, то для него указывается тип vo id. Далее, имя обозначает конкретное имя, присваиваемое методу. В качестве
имени метода может быть использован любой допустимый идентификатор, не
приводящий к конфликтам в текущей области видимости. И наконец, список_
параметров — это последовательность параметров, разделенных запятыми, для
каждого из которых указывается тип и имя. Параметры представляют собой
переменные, которые получают значения, передаваемые им в виде аргументов
при вызове метода. Если у метода отсутствуют параметры, то список параметров
будет пустым.*/