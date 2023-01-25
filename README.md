## Перевірка працездатності створеного класу Customer

Перед тим як первіряти клас, в нас стояло два завдання:

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

Результат робот даного код зображено на скріншоті знизу

![alt-текст](https://github.com/ppc-ntu-khpi/java-1-katushhiaa/blob/main/Solution/done.jpg "Done")
