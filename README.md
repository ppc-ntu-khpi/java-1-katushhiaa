## 1. Перевірка працездатності створеного класу Customer

Перед тим як перевіряти клас, в нас стояло два завдання:

**Завдання 1. Створення класу з атрибутами**;

**Завдання 2. Додавання в клас методів**. 

В результаті виконання цих двох завдань, я отримала такий код:
``` java
package domain;

public class Customer {

    private int ID = 45;
    private boolean isNew = true;
    private float total = 35.0F;

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + ID);
        System.out.println("Is he new: " + isNew);
        System.out.println("Total purchases are: " + total);
    }
}
```

Результат роботи даного код зображено на скріншоті знизу

![alt-текст](https://github.com/ppc-ntu-khpi/java-1-katushhiaa/blob/main/Solution/done.jpg "Done")


## 2. Виконання завдання на "п'ять"
Нам потрібно було:
 - додати конструктор за замовчуванням, який ініціалізує атрибути початковими значеннями
 - додати методи для зміни атрибутів 
 - та  використати ці методи в методі ````main```` класу````CustomerTest````

В результаті виконання я отримала такий модифікований код:
```java
package domain;

public class Customer {

    private int ID = 45;
    private boolean isNew = true;
    private float total = 35.0F;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = 15;
    }

    public boolean isIsNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = false;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = 30.0F;
    } 

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + ID);
        System.out.println("Is he new: " + isNew);
        System.out.println("Total purchases are: " + total);
    }
}

```
А знизу можна побачити скріншот роботи виконання коду

![alt-текст](https://github.com/ppc-ntu-khpi/java-1-katushhiaa/blob/main/Solution/advanced.jpg)
