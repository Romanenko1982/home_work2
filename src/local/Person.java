package local;
// я рассматриваю все модификаторы, на случай что классы могут лежать в разных папках, для всех кроме public создаю get и set

public class Person {

  public String name;
  public int age;
  public Pol sex;
  protected double height;
  String colorHair;
  private double weight;

  public Person() {
    name = "Дима";
    age = 25;
    sex = Pol.MAN;
    height = 185;
    weight = 80;
    colorHair = "русый";
  }

  public Person(String name, int age, Pol sex, double height, double weight) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.height = height;
    this.weight = weight;
  }

  public Person(String name, int age, Pol sex, double height, double weight, String colorHair) {
    this.name = name + " Петрович";
    this.age = age + 25;
    this.sex = sex;
    this.height = height - 4;
    this.weight = weight + 15;
    this.colorHair = colorHair;
  }

  public String toString() {
    return "Имя  - " + name + ", Возраст - " + age + ", Пол - " + sex.getPol() + ", Рост - "
        + height + ", " +
        "Вес - " + weight + ", Цвет волос  - " + colorHair;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public String getColorHair() {
    return colorHair;
  }

  public void setColorHair(String colorHair) {
    this.colorHair = colorHair;
  }

  public void grow(int year) {
    age += year;
    weight += year * 0.3;
    if (age > 50) {
      height -= year * 0.1;
    } else if (age <= 20) {
      height += year * 0.1;
    }
  }

  public String speak(int age) {
    if (age <= 2) {
      return "Уа-Уа";
    } else if (age > 2 && age <= 10) {
      return "Здравствуйте, меня зовут " + name;
    } else {
      return "Hello, my name is " + name + " , how do you do? ";
    }
  }

  public double getBodyMassIndex() {
    double result;
    switch (sex) {
      case MAN:
        result = weight / Math.pow(height / 100, 2);
        break;
      case WOMAN:
        result = (weight / Math.pow(height / 100, 2)) - 3;
        break;
      default:
        result = 0;
    }
    return result;
  }

  public String toEatOrNotToEat() {
    double index = getBodyMassIndex();
    return (index < 18) ? name + ", кушать необходимо больше" : (index > 25) ? name +
        ", нужно сдерживать себя в еде" : name + ", у тебя нет проблем с весом, наслаждайся жизнью";
  }

  public String hairColor() {
    if (sex.equals(Pol.WOMAN)) {
      if (age > 20 && age <= 30) {
        colorHair = "black";
      } else if (age > 30 && age <= 40) {
        colorHair = "blond";
      } else {
        colorHair = "natural";
      }
    }
    return colorHair;
  }

  public enum Pol {
    MAN("Мужской"),
    WOMAN("Женский");

    private String pol;

    Pol(String pol) {
      this.pol = pol;
    }

    public String getPol() {
      return pol;
    }
  }
}


