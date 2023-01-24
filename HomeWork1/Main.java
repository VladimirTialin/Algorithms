package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
Класс Notebook содержит поля:
Стоимость - price, double [100, 200, 300, 400, 500, 600, 700, 800]
Оперативная память - ram, integer [4, 8, 16, 20, 24, 28, 32]
Производитель - brand, enum Перечисление Brand может принимать следующие значения:
Lenuvo, Asos, MacNote, Eser, Xamiou.
Сортировать нужно в этом же порядке (т.е. Lenuvo имеет наивысший приоритет).
Отсортировать по стоимости, по памяти, по перечислению (в таком порядке)
*/
public class Main {
    public static void main(String[] args) {

                List<Notebook> notebooks = new ArrayList<>();
                for (int i = 0; i <= 10000; i++) {
                    notebooks.add(new Notebook());
                }

                Collections.sort(notebooks);

                for (Notebook notebook : notebooks) {
                    System.out.println(notebook);
                }

            }
        }
