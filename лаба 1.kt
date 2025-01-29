
    fun main() {
        // 1. Вывод информации о типах данных
        println("Типы данных в Kotlin:")
        println("1. Целочисленные: Int (32-битные целые числа), Long (64-битные целые числа)")
        println("2. Числа с плавающей точкой: Float (32-битные числа), Double (64-битные числа)")
        println("3. Строки: String (последовательности символов)")
        println("4. Логические: Boolean (true или false)")
        println("5. Символы: Char (один символ)")

        // 2. Вывод числа с точностью до сотых
        val number1: Double = 12.34567
        println("Число с точностью до сотых: %.2f".format(number1))

        // 3. Вывод числа e с точностью до десятых
        val e: Double = Math.E
        println("Число e с точностью до десятых: %.1f".format(e))

        // 4. Ввод числа с клавиатуры и вывод
        print("Введите число: ")
        val inputNumber1 = readLine()!!.toDouble()
        println("Вы ввели число: $inputNumber1")

        // 5. Ввод числа с клавиатуры и вывод с сообщением
        print("Введите число: ")
        val inputNumber2 = readLine()!!.toDouble()
        println("$inputNumber2 — вот какое число Вы ввели")

        // 6. Вывод чисел 1, 13 и 49 с одним пробелом
        println("1 13 49")

        // 7. Вывод чисел 7, 15 и 100 с двумя пробелами
        println("7  15  100")

   8
        println("Введите три числа: ")
        val num1 = readLine()!!.toDouble()
        val num2 = readLine()!!.toDouble()
        val num3 = readLine()!!.toDouble()
        println("$num1  $num2  $num3")

        // 9. Вывод четырех любых чисел с одним пробелом
        println("Введите четыре числа: ")
        val num4 = readLine()!!.toDouble()
        val num5 = readLine()!!.toDouble()
        val num6 = readLine()!!.toDouble()
        val num7 = readLine()!!.toDouble()
        println("$num4 $num5 $num6 $num7")

        // 10. Вывод чисел 50 и 10 одно под другим
        println("50")
        println("10")

        // 11. Вывод чисел 5, 10 и 21 одно под другим
        println("5")
        println("10")
        println("21")

        // 12. Вывод "столбиком" четырех любых чисел
        println("Введите четыре любых числа: ")
        val num8 = readLine()!!.toDouble()
        val num9 = readLine()!!.toDouble()
        val num10 = readLine()!!.toDouble()
        val num11 = readLine()!!.toDouble()
        println(num8)
        println(num9)
        println(num10)
        println(num11)
    }