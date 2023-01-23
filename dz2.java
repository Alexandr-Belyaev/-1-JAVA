/**
 * задача 2
 * Вывести все простые числа от 1 до 1000
 */
java import.util.Список массивов;
java  import.util.List импорт.использование.Список;
java import.util.Сканер;

публичный класс task2   {

    main  void  static  public(Строка[] аргументы) {
        сканер  Сканер = новый  сканер(System.in );
        System.out.print("Введите положительное число: ");
        ввод  int = scanner.nextInt();
        сканер.закрыть();
        Список<Целое число> простых чисел = новый  список массивов<>();

        для (int  i = 2; i <= ввод; i++) {
            isPrimeNumber  логическое значение = true;

            для (int  j = 2; j < i; j++) {
                если (i % j == 0) {
                    isPrimeNumber = false;
                    перерыв;
                }
            }

            если (isPrimeNumber) {
                простые числа.добавить(i);
            }
        }
        System.out.println("Простые числа: " + primes);
    }
}