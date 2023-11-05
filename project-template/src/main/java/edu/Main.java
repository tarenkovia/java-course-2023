package edu;

import edu.hw1.Task1;
import edu.hw1.Task2;
import edu.hw1.Task3;
import edu.hw1.Task4;
import edu.hw1.Task5;
import edu.hw1.Task6;
import edu.hw1.Task7;
import edu.hw1.Task8;
import edu.hw2.task1.Addition;
import edu.hw2.task1.Constant;
import edu.hw2.task1.Exponent;
import edu.hw2.task1.Expr;
import edu.hw2.task1.Multiplication;
import edu.hw2.task1.Negate;
import edu.hw2.task4.CallingInfo;
import edu.hw3.task1.AtbashCipher;
import edu.hw3.task4.RomanNumerals;
import edu.hw3.task6.Stock;
import edu.hw3.task6.StockMarket;
import edu.hw3.task6.StockMarketImpl;
import edu.hw3.task8.ReverseIterator;
import edu.hw4.Animal;
import edu.hw4.ValidationError;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import static edu.hw2.task4.CallingInfo.callingInfo;
import static edu.hw3.task2.ClusteringBrackets.clusterize;
import static edu.hw3.task3.FrequencyOfWords.countOfWords;
import static edu.hw3.task5.ContactlList.parseContacts;
import static edu.hw4.ValidationError.upgradeValidAnimals;
import static edu.hw4.ValidationError.validAnimals;

public final class Main {
    private final static Logger LOGGER = LogManager.getLogger();

    private Main() {}

    public static void Hw1(){
        Task1 task1 = new Task1();
        String length = "01:00";
        int totalSeconds = task1.minutesToSeconds(length);
        System.out.println(totalSeconds);
        length = "13:56";
        totalSeconds = task1.minutesToSeconds(length);
        System.out.println(totalSeconds);
        length = "10:60";
        totalSeconds = task1.minutesToSeconds(length);
        System.out.println(totalSeconds);

        System.out.println();
        //Task2
        Task2 task2 = new Task2();
        int number = 4666;
        int totalDigits = task2.countDigits(number);
        System.out.println(totalDigits);
        number = 544;
        totalDigits = task2.countDigits(number);
        System.out.println(totalDigits);
        number = 0;
        totalDigits = task2.countDigits(number);
        System.out.println(totalDigits);

        System.out.println();
        //Task3
        Task3 task3 = new Task3();
        int[] array1_1 = {1, 2, 3, 4};
        int[] array2_1 = {0, 6};
        System.out.println(task3.isNestable(array1_1, array2_1));
        int[] array1_2 = {3, 1};
        int[] array2_2 = {4, 0};
        System.out.println(task3.isNestable(array1_2, array2_2));
        int[] array1_3 = {9, 9, 8};
        int[] array2_3 = {8, 9};
        System.out.println(task3.isNestable(array1_3, array2_3));
        int[] array1_4 = {1, 2, 3, 4};
        int[] array2_4 = {2, 3};
        System.out.println(task3.isNestable(array1_4, array2_4));

        System.out.println();
        //Task4
        Task4 task4 = new Task4();
        String str = "123456";
        char[] arr = str.toCharArray();
        System.out.println(task4.fixString(arr));
        str = "hTsii  s aimex dpus rtni.g";
        arr = str.toCharArray();
        System.out.println(task4.fixString(arr));
        str = "badce";
        arr = str.toCharArray();
        System.out.println(task4.fixString(arr));

        System.out.println();
        //Task5
        Task5 task5 = new Task5();
        int num = 11211230;
        System.out.println(task5.isPalindromeDescendant(num));
        num = 13001120;
        System.out.println(task5.isPalindromeDescendant(num));
        num = 23336014;
        System.out.println(task5.isPalindromeDescendant(num));
        num = 11;
        System.out.println(task5.isPalindromeDescendant(num));

        System.out.println();
        //Task6
        Task6 task6 = new Task6();
        int numForK = 6621;
        System.out.println(task6.countK(numForK));
        numForK = 6554;
        System.out.println(task6.countK(numForK));
        numForK = 1234;
        System.out.println(task6.countK(numForK));

        System.out.println();
        //Task7
        Task7 task7 = new Task7();
        int n = 8;
        int shift = 1;
        System.out.println(task7.rotateRight(n, shift));
        n = 16;
        shift = 1;
        System.out.println(task7.rotateLeft(n, shift));
        n = 17;
        shift = 2;
        System.out.println(task7.rotateLeft(n, shift));

        System.out.println();
        //Task8
        Task8 task8 = new Task8();
        int[][] board = {
            {0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 1, 0, 1, 0},
            {0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 1, 0, 0, 0}
        };
        System.out.println(task8.knightBoardCapture(board));

        int[][] board1 = {
            {1, 0, 1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0, 1},
            {0, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 1, 0, 0, 1, 0, 1},
            {1, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 1},
            {1, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 1, 0, 1, 0, 1}
        };
        System.out.println(task8.knightBoardCapture(board1));

        int[][] board2 = {
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0}
        };
        System.out.println(task8.knightBoardCapture(board2));
    }

    public static void Hw2(){
        //task1
        Expr two = new Constant(2);
        Expr four = new Constant(4);
        Expr negOne = new Negate(new Constant(1));
        Expr sumTwoFour = new Addition(two, four);
        Expr mult = new Multiplication(sumTwoFour, negOne);
        Expr exp = new Exponent(mult, 2);
        Expr res = new Addition(exp, new Constant(1));

        System.out.println(res + " = " + res.evaluate());

        System.out.println();
        //Task4
        CallingInfo info = callingInfo();
        System.out.println("Called from " + info.className() + "#" + info.methodName());
    }

    public static void Hw3(){
        //task1
        String encryptedText1 = AtbashCipher.encrypt("Hello, World!");
        System.out.println(encryptedText1);
        String encryptedText2 = AtbashCipher.encrypt("Any fool can write code that a computer can understand. Good programmers write code that humans can understand. ― Martin Fowler");
        System.out.println(encryptedText2);

        System.out.println();
        //task2
        String input1 = "()()()";
        List<String> clusters1 = clusterize(input1);
        System.out.println(clusters1);
        String input2 = "((()))";
        List<String> clusters2 = clusterize(input2);
        System.out.println(clusters2);
        String input3 = "((()))(())()()(()())";
        List<String> clusters3 = clusterize(input3);
        System.out.println(clusters3);
        String input4 = "((())())(()(()()))";
        List<String> clusters4 = clusterize(input4);
        System.out.println(clusters4);

        System.out.println();
        //task3
        List<String> words = List.of("a", "bb", "a", "bb");
        Map<String, Integer> freqMap1 = countOfWords(words);
        System.out.println(freqMap1);

        System.out.println();
        //task4
        RomanNumerals number = new RomanNumerals();
        String result = number.getRomanNumber(2);
        System.out.println(result);
        result = number.getRomanNumber(12);
        System.out.println(result);
        result = number.getRomanNumber(16);
        System.out.println(result);

        System.out.println();
        //task5
        String[] contacts1 = { "John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes" };
        String[] sortedContacts1 = parseContacts(contacts1, "ASC");
        System.out.println(Arrays.toString(sortedContacts1));

        String[] contacts2 = { "Paul Erdos", "Leonhard Euler", "Carl Gauss" };
        String[] sortedContacts2 = parseContacts(contacts2, "DESC");
        System.out.println(Arrays.toString(sortedContacts2));

        System.out.println();
        //task6
        StockMarket market = new StockMarketImpl();

        Stock stock1 = new Stock("Apple", 19650.50);
        Stock stock2 = new Stock("Google", 11200.75);
        Stock stock3 = new Stock("Mak", 20250.80);

        market.add(stock1);
        market.add(stock2);
        market.add(stock3);

        System.out.println(market.mostValuableStock().getSymbol());
        Stock delete = market.mostValuableStock();

        market.remove(delete);

        System.out.println(market.mostValuableStock().getSymbol());


        System.out.println();
        //task8
        List<Integer> numbers = List.of(1, 2, 3);
        ReverseIterator<Integer> iterator = new ReverseIterator<>(numbers);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    public static void main(String[] args) {
        //Hw1();
        //Hw2();
        //Hw3();

        List<Animal> animals = new ArrayList<>(List.of(
            new Animal("Марсель", Animal.Type.CAT, Animal.Sex.M, 3, 30, 5, true),
            new Animal("Хатико", Animal.Type.DOG, Animal.Sex.M, 12, 64, 41, true),
            new Animal("Птица говорун", Animal.Type.BIRD, Animal.Sex.M, 30, 15, 1, false),
            new Animal("Моби Дик", Animal.Type.FISH, Animal.Sex.M, 32, 500, 1500, true),
            new Animal("Черная вдова", Animal.Type.SPIDER, Animal.Sex.F, 2, 1, 0, true),
            new Animal("Базилио", Animal.Type.CAT, Animal.Sex.M, 5, 35, 7, false),
            new Animal("Муму", Animal.Type.DOG, Animal.Sex.M, 6, 35, 30, false),
            new Animal("Кеша", Animal.Type.BIRD, Animal.Sex.M, 25, 25, 2, false),
            new Animal("Немо", Animal.Type.FISH, Animal.Sex.M, 10, 15, 0, false),
            new Animal("Дори", Animal.Type.FISH, Animal.Sex.F, 20, 20, 2, false)
        ));

        List<Animal> animals2 = new ArrayList<>(List.of(
            new Animal("Шариков", Animal.Type.DOG, Animal.Sex.M, 40, 40, 35, true),
            new Animal("Яго", Animal.Type.BIRD, Animal.Sex.M, 14, 20, 2, true),
            new Animal("Блум", Animal.Type.FISH, Animal.Sex.F, 10, 19, 1, false),
            new Animal("Флора", Animal.Type.FISH, Animal.Sex.F, 11, 21, 2, false)
        ));

        List<Animal> animalsForValidate = new ArrayList<>(List.of(
            new Animal("", Animal.Type.CAT, Animal.Sex.M, 3, 30, 5, true),
            new Animal("Хатико", Animal.Type.DOG, Animal.Sex.M, -200, 64, 41, true),
            new Animal("Птица говорун", null, Animal.Sex.M, 30, 15, 1, false),
            new Animal("Моби Дик", Animal.Type.FISH, null, 32, 500, 1500, true),
            new Animal("Черная вдова", Animal.Type.SPIDER, Animal.Sex.F, 2, 1, -16925, true),
            new Animal("Флора", Animal.Type.FISH, Animal.Sex.F, 11, -250505, 2, false),
            new Animal("Марсель", Animal.Type.CAT, Animal.Sex.M, 3, 30, 5, true)
        ));

        System.out.println("---Задача 1---");
        animals.sort(Comparator.comparingInt(Animal::height));

        for (Animal animal : animals) {
            System.out.println(animal.name() + " - " + animal.height());
        }

        System.out.println();
        System.out.println("---Задача 2---");
        int k = 2;
        List<Animal> sortByWeight = animals.stream()
            .sorted(Comparator.comparingInt(Animal::weight).reversed())
            .limit(k)
            .toList();
        sortByWeight.forEach(animal -> System.out.println(animal.name() + " - " + animal.weight()));

        System.out.println();
        System.out.println("---Задача 3---");
        Map<Animal.Type, Long> countByType = animals.stream()
            .collect(Collectors.groupingBy(Animal::type, Collectors.counting()));
        countByType.forEach((type, count) -> System.out.println(type + " - " + count));

        System.out.println();
        System.out.println("---Задача 4---");
        Optional<Animal> getLongestName = animals.stream()
            .max(Comparator.comparingInt(animal -> animal.name().length()));
        getLongestName.ifPresent(animal -> System.out.println(animal.name()));

        System.out.println();
        System.out.println("---Задача 5---");
        long maleCount = animals.stream()
            .filter(animal -> animal.sex() == Animal.Sex.M)
            .count();
        long femaleCount = animals.size() - maleCount;
        if (maleCount > femaleCount) {
            System.out.println("Самцов больше");
        } else if (femaleCount > maleCount) {
            System.out.println("Самок больше");
        } else {
            System.out.println("Самцов и самок одинаковое количество");
        }

        System.out.println();
        System.out.println("---Задача 6---");
        Map<Animal.Type, Optional<Animal>> heaviestByType = animals.stream()
            .collect(Collectors.groupingBy(Animal::type, Collectors.maxBy(Comparator.comparingInt(Animal::weight))));
        System.out.println("Самое тяжелое животное каждого вида:");
        heaviestByType.forEach((type, animal) -> {
            if (animal.isPresent()) {
                System.out.println(type + " - " + animal.get().name());
            } else {
                System.out.println(type + " - Нет животных этого вида");
            }
        });

        System.out.println();
        System.out.println("---Задача 7---");
        animals.sort(Comparator.comparingInt(Animal::age).reversed());
        int age = 2;
        Animal OldestAnimal = animals.get(age - 1);
        System.out.println(OldestAnimal);

        System.out.println();
        System.out.println("---Задача 8---");
        int Height = 20;
        Optional<Animal> heaviestAnimal = animals.stream()
            .filter(animal -> animal.height() < Height)
            .max(Comparator.comparingInt(Animal::weight));
        heaviestAnimal.ifPresent(animal -> System.out.println(animal.name()));

        System.out.println();
        System.out.println("---Задача 9---");
        int sumOfPaws = animals.stream()
            .mapToInt(Animal::paws)
            .sum();
        System.out.println(sumOfPaws);

        System.out.println();
        System.out.println("---Задача 10---");
        List<Animal> differentPaws = animals.stream()
            .filter(animal -> animal.age() != animal.paws())
            .toList();
        differentPaws.forEach(animal -> System.out.println(animal.name()));

        System.out.println();
        System.out.println("---Задача 11---");
        List<Animal> biteAndHighAnimals = animals.stream()
            .filter(animal -> animal.bites() && animal.height() > 100)
            .toList();
        biteAndHighAnimals.forEach(animal -> System.out.println(animal.name()));

        System.out.println();
        System.out.println("---Задача 12---");
        long weightGreaterThanHeightCount = animals.stream()
            .filter(animal -> animal.weight() > animal.height())
            .count();
        System.out.println(weightGreaterThanHeightCount);

        System.out.println();
        System.out.println("---Задача 13---");
        List<Animal> namesWithMoreThanTwoWords = animals.stream()
            .filter(animal -> animal.name().split(" ").length > 2)
            .toList();
        if (namesWithMoreThanTwoWords.size() > 0) {
            for (var animal : namesWithMoreThanTwoWords) {
                System.out.println(animal);
            }
        } else {
            System.out.println("Нет таких животных");
        }

        System.out.println();
        System.out.println("---Задача 14---");
        int DogHeight = 35;
        boolean TallDog = animals.stream()
            .filter(animal -> animal.type() == Animal.Type.DOG)
            .anyMatch(animal -> animal.height() > DogHeight);
        if (TallDog) {
            System.out.println("В списке есть собака ростом более " + DogHeight + " см");
        } else {
            System.out.println("В списке нет собаки ростом более " + DogHeight + " см");
        }

        System.out.println();
        System.out.println("---Задача 15---");
        int minAge = 1;
        int maxAge = 50;
        Map<Animal.Type, Integer> totalWeightByType = animals.stream()
            .filter(animal -> animal.age() >= minAge && animal.age() <= maxAge)
            .collect(Collectors.groupingBy(Animal::type, Collectors.summingInt(Animal::weight)));
        totalWeightByType.forEach((type, totalWeight) -> System.out.println(type + " - " + totalWeight));

        System.out.println();
        System.out.println("---Задача 16---");
        List<Animal> sortedByTypeSexName = animals.stream()
            .sorted(Comparator.comparing(Animal::type)
                .thenComparing(Animal::sex)
                .thenComparing(Animal::name))
            .toList();
        sortedByTypeSexName.forEach(animal -> System.out.println(animal.name()));

        System.out.println();
        System.out.println("---Задача 17---");
        boolean spidersBiteMoreThanDogs = animals.stream()
            .filter(animal -> animal.type() == Animal.Type.SPIDER || animal.type() == Animal.Type.DOG)
            .anyMatch(Animal::bites);
        if (spidersBiteMoreThanDogs) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println();
        System.out.println("---Задача 18---");
        List<Animal> allFish = new ArrayList<>();
        allFish.addAll(animals);
        allFish.addAll(animals2);

        Optional<Animal> heaviestFish = allFish.stream()
            .filter(animal -> animal.type() == Animal.Type.FISH)
            .max(Comparator.comparingInt(Animal::weight));

        heaviestFish.ifPresent(animal -> System.out.println(animal.name()));

        System.out.println();
        System.out.println("---Задача 19---");
        int order19 = 1;
        Map<String, Set<ValidationError>> validError = validAnimals(animalsForValidate);
        for (Map.Entry<String, Set<ValidationError>> entry : validError.entrySet()) {
            System.out.print(order19 + ") ");
            System.out.print(entry.getKey() + " - ");
            if (entry.getValue().size() > 0) {
                for (var i : entry.getValue()) {
                    System.out.print(i.getMsg() + " ");
                }
                System.out.println();
            }
            else {
                System.out.println("Все корректно");
            }
            order19++;
        }

        System.out.println();
        System.out.println("---Задача 20---");
        int order20 = 1;
        Map<String, String> validError2 = upgradeValidAnimals(animalsForValidate);
        for (Map.Entry<String, String> entry : validError2.entrySet()) {
            System.out.print(order20 + ") ");
            System.out.println(entry.getKey() + " - " + entry.getValue());
            order20++;
        }
    }
}
