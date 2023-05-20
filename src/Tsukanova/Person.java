package Tsukanova;

public class Person {
//    Зробіть програму для фітнес трекера, яка реєструватиме нового користувача створюючи
//    йому обліковий запис, приймаючи наступні параметри:
//    Незмінні (задаються тільки при створенні облікового запису, і можуть бути
//    отримані лише за допомогою гетерів):
//    Ім'я
//    Дата народження (окремо день, місяць, рік)
//    Емейл
//    Телефон

//    Змінювані:
//    Прізвище
//    Вага
//    Тиск
//    Кількість пройдених за день кроків

    //    Створювати кожного користувача необхідно через конструктор, беручи всі поля на вхід конструктора.
//    Додати метод printAccountInfo(), при виклику якого друкувати всі дані про користувача
//    Після прийому року народження - вираховувати вік користувача у внутрішню змінну age
//    (відштовхуючись просто від 2020 року, ускладнювати тут не будемо), на яку зробити тільки геттер
//    і виводити на екран разом з іншими полями в методі printAccountInfo(); у конструкторі або
//    геттерах/сеттерах не використовуємо виведення в консоль.
//    У main-класі створити 3-5 користувачів та роздрукувати дані кожного через
//    виклик методу printAccountInfo(); для двох користувачів змінити кілька полів
//    та роздрукувати нові дані повторно
    private final String name;
    private final int dateBirth;
    private final int monthBirth;
    private final int yearBirth;
    private final String email;
    private final String phone;
    private String lastName;
    private int vaga;
    private int tusk;
    private int step;
    private int age;
    private int yearNow;

    public Person(String name, int dateBirth, int monthBirth,
                  int yearBirth, String email, String phone,
                  String lastName, int vaga, int tusk, int step,
                  int yearNow) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
        this.email = email;
        this.phone = phone;
        this.lastName = lastName;
        this.vaga = vaga;
        this.tusk = tusk;
        this.step = step;
        this.yearNow = yearNow;
        this.age = ageRaxynok();
    }

    public String getName() {
        return name;
    }

    public int getDateBirth() {
        return dateBirth;
    }

    public int getMonthBirth() {
        return monthBirth;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getYearNow() {
        return yearNow;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setVaga(int vaga) {
        this.vaga = vaga;
    }

    public void setTusk(int tusk) {
        this.tusk = tusk;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getAge() {
        return age;
    }
    public int ageRaxynok() {
        return yearNow - yearBirth;
    }
    public void printAccountInfo() {
        System.out.println("Який зараз рік: " + this.yearNow);
        System.out.println("Призвище: " + this.lastName);
        System.out.println("Ім'я: " + this.name);
        System.out.println("Число народження: " + this.dateBirth);
        System.out.println("Місяць народження: " + this.monthBirth);
        System.out.println("Рік народження: " + this.yearBirth);
        System.out.println("Вік: " + this.age);
        System.out.println("Мобільний: " + this.phone);
        System.out.println("email: " + this.email);
        System.out.println("Вага: " + this.vaga);
        System.out.println("Тиск: " + this.tusk);
        System.out.println("Кількість шагів: " + this.step);
    }
}
