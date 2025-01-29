fun main() {
    // 1. Двузначное число
    val number = 42 // Пример двузначного числа

    val tens = number / 10 // Число десятков
    val units = number % 10 // Число единиц
    val sum = tens + units // Сумма цифр
    val product = tens * units // Произведение цифр

    println("Число десятков: $tens")
    println("Число единиц: $units")
    println("Сумма цифр: $sum")
    println("Произведение цифр: $product")

    // 2. Трехзначное число
    println("2. Трехзначное число")

    val number1 = 300 // Пример трехзначного числа

    val hundreds = number1 / 100 // Число сотен
    val tens1 = (number1 / 10) % 10 // Число десятков
    val units1 = number1 % 10 // Число единиц
    val sum1 = hundreds + tens1 + units1 // Сумма цифр
    val product1 = hundreds * tens1 * units1 // Произведение цифр

    println("Число сотен: $hundreds")
    println("Число десятков: $tens1")
    println("Число единиц: $units1")
    println("Сумма цифр: $sum1")
    println("Произведение цифр: $product1")

    // 3. Деление одного числа на другое
    println("3. Деление одного числа на другое")

    val numerator = 20.0 // Делимое
    val denominator = 5.0 // Делитель

    if (denominator != 0.0) {
        val result = numerator / denominator
        println("Результат деления: $result")
    } else {
        println("Ошибка: деление на ноль!")
    }

    // 4. Возведение числа в степень
    println("4. Возведение числа в степень")

    val base = 4.0 // Основание
    val exponent = 2 // Степень

    val result = Math.pow(base, exponent.toDouble())
    println("$base в степени $exponent равно $result")

    // 5. Нахождение корня числа
    println("5. Нахождение корня числа")

    val number2 = 169.0 // Пример числа

    if (number2 >= 0) {
        val root = Math.sqrt(number2)
        println("Квадратный корень из $number2 равен $root")
    } else {
        println("Ошибка: нельзя извлечь корень из отрицательного числа!")
    }

    // 6. Вычисление логических выражений
    println("Вычисление логических выражений")

    // Логические выражения с A, B, C
    println("1. Логические выражения с A, B, C")

    val A = true
    val B = false
    val C = false

    println("A или B: ${A || B}")
    println("A и B: ${A && B}")
    println("B или C: ${B || C}")

    // Логические выражения с X, Y, Z
    println("2. Логические выражения с X, Y, Z")

    val X = false
    val Y = true
    val Z = false

    println("X или Z: ${X || Z}")
    println("X и Y: ${X && Y}")

    // Логические выражения с A, B, C
    println("3. Логические выражения с A, B, C")


    println("не A и B: ${!A && B}")
    println("A или не B: ${A || !B}")
    println("A и B или C: ${A && (B || C)}")

    // Логические выражения с X, Y, Z
    println("4. Логические выражения с X, Y, Z")

    val X1 = true
    val Y1 = true
    val Z1 = false

    println("не X и Y: ${!X1 && Y1}")
    println("X или не Y: ${X1 || !Y1}")
    println("X или Y и Z: ${X1 || (Y1 && Z1)}")

    // Логические выражения с X, Y, Z
    println("5. Логические выражения с X, Y, Z")

    val X2 = false
    val Y2 = false
    val Z2 = true

    println("X или Y и не Z: ${X2 || (Y2 && !Z2)}")
    println("X и не Y или Z: ${X2 && !Y2 || Z2}")
    println("не X и не Y: ${!X2 && !Y2}")
    println("X и (не Y или Z): ${X2 && (!Y2 || Z2)}")
    println("не (X и Z) или Y: ${!(X2 && Z2) || Y2}")
    println("X или (не (Y или Z)): ${X2 || !(Y2 || Z2)}")

    // Логические выражения с A, B, C
    println("7. Логические выражения с A, B, C")

    val A1 = true
    val B1 = false
    val C1 = false

    println("A или не (A и B) или C: ${A1 || !(A1 && B1) || C1}")
    println("не A или A и (B или C): ${!A1 || (A1 && (B1 || C1))}")
    println("(A или B и не C) и C: ${(A1 || (B1 && !C1)) && C1}")
}