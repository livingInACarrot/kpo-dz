import kotlin.math.sqrt

/**
Задание 1: Функция,спрашивающая у пользователя его ФИО и выводящая его на экране.
(0.5 балла)
Формат вывода:
" Фамилия:
Имя:
Отчество:
"
 */
fun askForInput() {
    println("Введите фамилию: ")
    val lastName = readLine()

    print("Имя: ")
    val firstName = readLine()

    print("Отчество: ")
    val middleName = readLine()

    println("Фамилия: $lastName")
    println("Имя: $firstName")
    println("Отчество: $middleName")
}

/**
Задание 2: Функция, вычисляющая и возвращающая корни квадратного уравнения. (1 балл)
 */
fun quadraticRoots(a: Double, b: Double, c: Double): Pair<Double, Double> {
    val discriminant = b * b - 4 * a * c

    val x1 = (-b + sqrt(discriminant)) / (2 * a)
    val x2 = (-b - sqrt(discriminant)) / (2 * a)

    return x1 to x2
}

/**
Задание 3: Вывести на экран трёхзначные десятичные числа s, все цифры которых одинаковы.
(2 балла)
 */
fun printSameDigitNumbers() {
    for (i in 1..9) {
        val number = i * 111
        println(number)
    }
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    askForInput()

    val roots = quadraticRoots(-5.0, 4.0, 3.0)
    println("X1 = ${roots.first} ; X2 =${roots.second}")

    printSameDigitNumbers()
}