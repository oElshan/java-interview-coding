
# Java interview tasks solutions

[![Java CI with Gradle](https://github.com/andrei-punko/java-interview-coding/actions/workflows/gradle.yml/badge.svg)](https://github.com/andrei-punko/java-interview-coding/actions/workflows/gradle.yml)
[![Coverage](.github/badges/jacoco.svg)](https://github.com/andrei-punko/java-interview-coding/actions/workflows/gradle.yml)
[![Branches](.github/badges/branches.svg)](https://github.com/andrei-punko/java-interview-coding/actions/workflows/gradle.yml)

<a href="https://andrei-punko.github.io/java-interview-faq-n-answers"><img src="images/button_java-interview-faq.png" alt="Java interview FAQ" height="40"/></a>
<a href="https://boosty.to/andd3dfx"><img src="images/button_donate.png" alt="Donate" height="40"/></a>

## Prerequisites
- JDK 17
- Gradle isn't required because of embedded Gradle used in the project

## How to build
```shell
./gradlew clean build
```

## List of Java packages
- [annotation](src/main/java/by/andd3dfx/annotation)
- [cache](src/main/java/by/andd3dfx/cache)
- [collections](src/main/java/by/andd3dfx/collections)
- [common](src/main/java/by/andd3dfx/common) (some uncategorized stuff)
- [core](src/main/java/by/andd3dfx/core) (Java core stuff)
- [dynamic](src/main/java/by/andd3dfx/dynamic)
- [iterators](src/main/java/by/andd3dfx/iterators)
- [java8](src/main/java/by/andd3dfx/java8)
- [jvm](src/main/java/by/andd3dfx/jvm)
- [masking](src/main/java/by/andd3dfx/masking)
- [multithreading](src/main/java/by/andd3dfx/multithreading)
- [numeric](src/main/java/by/andd3dfx/numeric)
- [parser](src/main/java/by/andd3dfx/parser)
- [proxy](src/main/java/by/andd3dfx/proxy)
- [recursion](src/main/java/by/andd3dfx/recursion)
- [refactoring](src/main/java/by/andd3dfx/refactoring)
- [search](src/main/java/by/andd3dfx/search)
- [serialization](src/main/java/by/andd3dfx/serialization)
- [sorting](src/main/java/by/andd3dfx/sorting)
- [string](src/main/java/by/andd3dfx/string)
- [testing](src/main/java/by/andd3dfx/testing)
- [tree](src/main/java/by/andd3dfx/tree)

Sure, we have [tests](src/test/java/by/andd3dfx);
they contain enough code which describes implementation in a natural way.

## SQL-related stuff
[SQL folder](sql/README.md) contains tasks which require writing SQL queries to solve them.

## Links to videos on [YouTube channel](https://www.youtube.com/@andd3dfx) (in chronological order)
- [Определение максимального количества зрителей стрима](https://www.youtube.com/watch?v=uMikT-xpE-w)
- [Валидация скобочного выражения](https://www.youtube.com/watch?v=cTHWJNfjHzE)
- [Факториал (3 решения)](https://www.youtube.com/watch?v=8D2ImqJUaeA)
- [Перемешиваем массив (leetcode)](https://www.youtube.com/watch?v=d9a7Mpm222M)
- [Корзинная сортировка: подсчет количества людей каждого возраста](https://www.youtube.com/watch?v=vFsDPm7ecsM)
- [Файловая система: структура данных и подсчет размера содержимого](https://www.youtube.com/watch?v=j6wr8qCaVeE)
- [Подсчет количества кораблей на поле морского боя](https://www.youtube.com/watch?v=9ypQAA7ilYo)
- [Сортировка выбором (Selection sort)](https://www.youtube.com/watch?v=sQLeZOOmxlo)
- [Роняем JVM (2 решения)](https://www.youtube.com/watch?v=FTR-_QqcH-I)
- [Фильтрация содержимого Map по условию (Яндекс)](https://www.youtube.com/watch?v=YBHM4xStiCM)
- [Самодельный Enum (Яндекс)](https://www.youtube.com/watch?v=41sJn7MQFc4)
- [Числа Фибоначчи (2 решения)](https://www.youtube.com/watch?v=S5rfbd8JkWw)
- [Поиск второго по величине элемента массива (2 решения)](https://www.youtube.com/watch?v=TYU9OsImhP8)
- [Многопоточный стек](https://www.youtube.com/watch?v=R6yUAA82_3Y)
- [Нахождение наибольшего общего делителя (2 решения)](https://www.youtube.com/watch?v=OzGTTkysIew)
- [Поиск максимального произведения трех чисел в массиве](https://www.youtube.com/watch?v=wzO6abwg4y4)
- [Композитный итератор (Яндекс)](https://www.youtube.com/watch?v=8V_t64QLN7Q)
- [Бинарный поиск в упорядоченном массиве](https://www.youtube.com/watch?v=YegVbWwIHFA)
- [Пузырьковая сортировка (2 решения) (Bubble sort)](https://www.youtube.com/watch?v=vK4BTGVELwk)
- [Бинарное дерево поиска](https://www.youtube.com/watch?v=DGLiObeU04A)
- [Рекурсивный итератор (Яндекс)](https://www.youtube.com/watch?v=dnR4xhkdx1I)
- [Поиск трех чисел с заданной суммой (2 решения)](https://www.youtube.com/watch?v=P-2jXiQ1OFo)
- [Валидация имени пользователя](https://www.youtube.com/watch?v=27zJPML4SYg)
- [Поиск цикла в связном списке (алгоритм Флойда)](https://www.youtube.com/watch?v=5IcvvtfLGvM)
- [Реализация cd для абстрактной файловой системы](https://www.youtube.com/watch?v=HLoLoIaL--I)
- [LRU кэш (Least Recently Used) (leetcode)](https://www.youtube.com/watch?v=ZrF5s4_jNZk)
- [Обход конем шахматной доски (Horse walk)](https://www.youtube.com/watch?v=keNYNcQi9o8)
- [Подсчет строк из InputStream, удовлетворяющих условию](https://www.youtube.com/watch?v=XDIgxvYAGfY)
- [Поиск уникальных элементов в коллекции](https://www.youtube.com/watch?v=YaApEnhQEks)
- [Изменение формата страхового номера при помощи регулярных выражений](https://www.youtube.com/watch?v=SdNLzjbXyo8)
- [Определение бита в бесконечной последовательности](https://www.youtube.com/watch?v=AB896M2cJr4)
- [Запуск параллельного выполнения нескольких задач (3 решения)](https://www.youtube.com/watch?v=jPCnLumA4x8)
- [Четный итератор](https://www.youtube.com/watch?v=wY5Hg3KrLqw)
- [Задачи с палиндромами](https://www.youtube.com/watch?v=XZMOlvKRzd0)
- [Расстановка ферзей на шахматной доске (N-Queens) (leetcode)](https://www.youtube.com/watch?v=v9kctJiD4KQ)
- [Печать foobar из разных потоков](https://www.youtube.com/watch?v=UVrrfYTiRo8)
- [Проверка симметричности матрицы](https://www.youtube.com/watch?v=DwLLrRRPFkw)
- [Расчет давления в кирпичной пирамиде с помощью рекурсии](https://www.youtube.com/watch?v=dDk8FUEvFZo)
- [Поиск подмножества с максимальной четной суммой за O(n)](https://www.youtube.com/watch?v=GgZvAwyrAC0)
- [Обход бинарного дерева (4 способа) (Binary tree walk)](https://www.youtube.com/watch?v=cEd6CPAp90I)
- [Разворот односвязного списка (3 способа) (Reverse linked list)](https://www.youtube.com/watch?v=iEKdRgKNurg)
- [Самодельная аннотация](https://www.youtube.com/watch?v=ERKYwftYjtk)
- [Самодельный Atomic](https://www.youtube.com/watch?v=4SFuAGa6GfU)
- [Поиск простых делителей числа (Simple dividers)](https://www.youtube.com/watch?v=EEN6tBfXGt8)
- [Сортировка вставками (Insertion sort)](https://www.youtube.com/watch?v=NIvyCMC7NgU)
- [Подсчет количества съеденных конфет](https://www.youtube.com/watch?v=UNz2nM2qQ3E)
- [Составление поезда из вагонов](https://www.youtube.com/watch?v=ToXzQU6vIKw)
- [Очередь в прачечную](https://www.youtube.com/watch?v=reTyOF3yo5k)
- [Реализация целочисленного деления (2 решения)](https://www.youtube.com/watch?v=jhKuxPDCa54)
- [Ревью кода из интервью](https://www.youtube.com/watch?v=8spUH04041U)
- [Ханойские башни (Hanoi towers)](https://www.youtube.com/watch?v=8fkHg9JKKmg)
- [Быстрая сортировка (Quick sort)](https://www.youtube.com/watch?v=lp1UsN1-_p4)
- [Генерация перестановок (leetcode)](https://www.youtube.com/watch?v=PyRnm2mFZbk)
- [Интерполяционный поиск в упорядоченном массиве](https://www.youtube.com/watch?v=kRTntkCB_a4)
- [Птицеферма (с элементами ООП)](https://www.youtube.com/watch?v=tQAJRQrc2Aw)
- [Определение более длинного конца цепи](https://www.youtube.com/watch?v=KAqZwNY7yUc)
- [Прыжки по разрушающимся платформам](https://www.youtube.com/watch?v=okH8weUwc8k)
- [Сортировка квадратов упорядоченного массива (3 способа) (leetcode)](https://www.youtube.com/watch?v=49DpyzZN4NM)
- [Поиск пары непересекающихся отрезков](https://www.youtube.com/watch?v=W7irv3Wy7Kw)
- [Определение сплошных интервалов для числового массива](https://www.youtube.com/watch?v=ql6TROfbnYk)
- [Поиск в массиве пары чисел с заданной суммой за O(n)](https://www.youtube.com/watch?v=CrQdpjsr26w)
- [Поиск k максимальных чисел в массиве за O(kn)](https://www.youtube.com/watch?v=iBOodbu0wKQ)
- [Поиск пропущенного минимального положительного элемента в несортированном массиве за O(n)](https://www.youtube.com/watch?v=0i7x_YEXOpA)
- [Два секретных Git-репозитория, посвященных Java-интервью](https://www.youtube.com/watch?v=NpcB1gsTkMg)
- [Сократитель ссылок (Яндекс)](https://www.youtube.com/watch?v=iUBWIZE_vo4)
- [Определение минимального произведения пары элементов несортированного массива за O(n)](https://www.youtube.com/watch?v=QilFm81ukEw)
- [Возведение числа в степень (2 способа) (leetcode)](https://www.youtube.com/watch?v=peiEt6TkpLU)
- [Сортировка анаграмм](https://www.youtube.com/watch?v=_i77ixQLijs)
- [Создаем deadlock](https://www.youtube.com/watch?v=xuWU_6JTXi4)
- [Замена последовательных пробелов в строке одним за O(n)](https://www.youtube.com/watch?v=2jszDhWtLes)
- [Как собрать Java-проект без JDK, Maven и Gradle](https://www.youtube.com/watch?v=gbF2zVvndLg)
- [Сортировка слиянием (Merge sort)](https://www.youtube.com/watch?v=QsXDi0MABA0)
- [Стек с поддержкой определения минимального элемента за O(1)](https://www.youtube.com/watch?v=-Y-_0R8tfyk)
- [Рефакторинг кода из интервью](https://www.youtube.com/watch?v=jdnNYxVk5BE)
- [Кодирование строки](https://www.youtube.com/watch?v=Lw4gg7tkWQE)
- [Реверсирование последовательности (3 способа)](https://www.youtube.com/watch?v=Ql6JGqcSiNk)
- [Программист в кино в эпоху COVID](https://www.youtube.com/watch?v=ClBUqbfSJ18)
- [LFU кэш (Least Frequently Used) (leetcode)](https://www.youtube.com/watch?v=4hhu0cSVUCA)
- [Поиск элементов одного массива, отсутствующих в другом за O(n)](https://www.youtube.com/watch?v=bJIzoT-CmUg)
- [Киномарафон](https://www.youtube.com/watch?v=2hGoj3v5JVQ)
- [Самодельный Stream с filter и map операциями](https://www.youtube.com/watch?v=LvBjS17CatQ)
- [Брутфорс пароля по хэшу и хэш-функции (Ozon)](https://www.youtube.com/watch?v=-TjrkxilGn0)
- [Упаковка товаров для доставки](https://www.youtube.com/watch?v=ZDntf64fW5Q)
- [Самодельный Stream (часть 2): of, limit, skip, takeWhile, dropWhile, distinct, sorted, forEach и т.д](https://www.youtube.com/watch?v=iuzWoSzl1to)
- [Определение оптимального времени покупки и продажи акций (2 решения) (leetcode)](https://www.youtube.com/watch?v=XYPIKrEBbCc)
- [Разбиение здания на апартаменты (Workfusion)](https://www.youtube.com/watch?v=W3RefFMsnRo)
- [Самодельный BlockingQueue (2 решения)](https://www.youtube.com/watch?v=eMn_KjkFGds)
- [Самодельный ThreadPoolExecutor](https://www.youtube.com/watch?v=FmJasJ-W-Rs)
- [Восстановление IP-адреса (leetcode)](https://www.youtube.com/watch?v=bpSA5MJ36UQ)
- [Определение лучшего среднего значения в массиве оценок (2 решения)](https://www.youtube.com/watch?v=cdLSKHrfg4A)
- [Создание объекта по типу, указанному как generic (2 решения)](https://www.youtube.com/watch?v=vkn_2w-oJIo)
- [Порядок инициализации полей и блоков Java-класса](https://www.youtube.com/watch?v=rnf7cMbRado)
- [Самодельный LinkedList](https://www.youtube.com/watch?v=vHjvNHBQP3o)
- [Самодельный ArrayList](https://www.youtube.com/watch?v=u7Vyh567ljs)
- [Самодельный HashMap](https://www.youtube.com/watch?v=-GECqwRV8Uw)
- [Три задачи из интервью на парсинг файлов](https://www.youtube.com/watch?v=4DGhiBXFhUc)
- [Робот двуногий шагающий (Яндекс)](https://www.youtube.com/watch?v=MBANIKUlpEs)
- [Самодельный HashSet](https://www.youtube.com/watch?v=aTbKxApYNYk)
- [Самодельный LinkedHashSet](https://www.youtube.com/watch?v=GlV87RWHhOQ)
- [Неизменяемая нода и сумма ее вложенных элементов (3 способа)](https://www.youtube.com/watch?v=UaeleszV00w)
- [Топологическая сортировка. Нахождение цикла в графе](https://www.youtube.com/watch?v=FiNIYTJO0qM)
- [Удаление N-го элемента с конца односвязного списка (leetcode)](https://www.youtube.com/watch?v=1cn_3eCvnq0)
- [Самодельный Lock](https://www.youtube.com/watch?v=QdvsNhf5FI4)
- [Печать строк в заданном порядке из разных потоков (leetcode)](https://www.youtube.com/watch?v=UTmv-H2xc9Y)
- [Многопоточное получение H₂O из водорода и кислорода (leetcode)](https://www.youtube.com/watch?v=7S9e_vXuVFE)
- [Удаление элемента заданной величины из массива (leetcode)](https://www.youtube.com/watch?v=ECdosiz1ZPM)
- [ДВЕ задачи про ДВЕри](https://www.youtube.com/watch?v=ix81AbCNiBE)
- [Добавление многопоточности при параллельных запросах в разные системы](https://www.youtube.com/watch?v=3IGsZy0uTSk)
- [Распространение чумы между городами (2 решения)](https://www.youtube.com/watch?v=Ei1uCCD_Iqg)
- [Реверсирование порядка цифр в числе (2 решения)](https://www.youtube.com/watch?v=w3C4L7GxD7M)
- [Поиск среди пар чисел значения, встречающегося однажды: магия XOR (2 решения) (leetcode)](https://www.youtube.com/watch?v=dNB8tOvx5Gk)
- [Удаление дубликатов в сортированном связном списке (2 задачи) (leetcode)](https://www.youtube.com/watch?v=ryE_Q_AtAg8)
- [Генерация валидных комбинаций скобок (leetcode)](https://www.youtube.com/watch?v=UMBenJ4PZKU)
- [Валидация записи числа регулярным выражением (leetcode)](https://www.youtube.com/watch?v=Xy0iJ7w_UO8)
- [Проверка, является ли число степенью заданного числа (2 решения) (leetcode)](https://www.youtube.com/watch?v=E1Gue5EcvK4)
- [Прокрутка односвязного списка (leetcode)](https://www.youtube.com/watch?v=6tyflwO6PwY)
- [Поиск подстроки в строке за O(N+M): алгоритм Бойера-Мура (2 решения) (leetcode)](https://www.youtube.com/watch?v=77fzfJIs_YY)
- [Задачи из интервью на написание SQL-запросов](https://www.youtube.com/watch?v=GjDF_LdwYHU)
- [Поиск слова в матрице букв (leetcode)](https://www.youtube.com/watch?v=FsKU04anMtE)
- [Сжатие строки (Яндекс)](https://www.youtube.com/watch?v=s3sGF7C6cV8)
- [Самодельный Stack](https://www.youtube.com/watch?v=sZ-DrSHhrWc)
- [Выдача купюр банкоматом (Яндекс)](https://www.youtube.com/watch?v=LDKZtDevRRI)
- [Поиск набора слов в матрице букв (2 решения) (leetcode)](https://www.youtube.com/watch?v=DTyMyr6bNGw)
- [Поиск набора слов в матрице букв (часть 2): префиксное дерево (leetcode)](https://www.youtube.com/watch?v=CLYbm21pvig)
- [Поиск в строке наиболее длинной подстроки без повторений (leetcode)](https://www.youtube.com/watch?v=Jj66XXja4LY)
- [Сумма двух чисел без использования + и - (2 решения) (leetcode)](https://www.youtube.com/watch?v=W_Vja_AFKFg)
- [Длина последнего слова в строке (3 решения) (leetcode)](https://www.youtube.com/watch?v=Kev5TpsfKT4)
- [Парсинг списка строк в структуру данных (Яндекс)](https://www.youtube.com/watch?v=RW1DcmbzbQ8)
- [Перемещение нулей к концу массива (leetcode)](https://youtu.be/IV5EIDRYZ9U)
- [Проверка правильности использования заглавных букв (2 решения) (leetcode)](https://youtu.be/v0EkBQbFQpk)
- [Цифровой корень (итеративная сумма цифр) числа (2 решения) (leetcode)](https://www.youtube.com/watch?v=04ezQ_--SIs)
- [Удаление дубликатов из сортированного массива, ч.I, II (leetcode)](https://www.youtube.com/watch?v=gbReaBoFHkc)
- [Определение размера окрестности для элементов массива чисел](https://www.youtube.com/watch?v=GyiMCtUWnUk)
- [Сортировка Шелла (Shell sort)](https://www.youtube.com/watch?v=1wyVIGI7EX8)
- [Размен минимальным количеством монет (2 решения)](https://www.youtube.com/watch?v=K1xPbYPslRU)
- [Замена всех '?' в строке, избегая повторяющихся последовательных символов (leetcode)](https://www.youtube.com/watch?v=OgMnvWfhqrk)
- [Заказ фурнитуры: добавить пропущенный код](https://www.youtube.com/watch?v=TNgR6JaxwFg)

## Docs & notes
The [docs folder](./docs) contains some docs & notes
