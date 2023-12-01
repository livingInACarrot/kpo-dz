import java.util.Scanner
/**
Задание 1: Сформировать целочисленный массив A из N элементов
при помощи ввода значений с клавиатуры (N вводит пользователь).
Вывести массив на экран. (1 балл)
 */
fun makeArray(): IntArray {
    val scanner = Scanner(System.`in`)
    println("Введите размер массива:")
    val size = scanner.nextInt()

    val array = IntArray(size)

    println("Введите элементы массива:")
    for (i in 0 until size) {
        array[i] = scanner.nextInt()
    }
    return array
}

/**
Задание 2: Написать функцию для сортировки массива по убыванию и его вывода на экран.
Использовать встроенные функции. (0.5 балла)
 */
fun sortArrayDesc(arr: IntArray) {
    arr.sortDescending()
    println("Массив, отсортированный по убыванию:")
    for (element in arr) {
        println(element)
    }
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val arr = makeArray()
    sortArrayDesc(arr)
}