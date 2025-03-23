package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    Manager aManager = new Manager();

    @Test

    public void shouldAddMovies() {
        aManager.addMovie("Бладшот");
        aManager.addMovie("Вперёд");

        String[] expected = {"Бладшот", "Вперёд"};
        String[] actual = aManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindAll() {
        aManager.addMovie("Бладшот");
        aManager.addMovie("Вперёд");
        aManager.addMovie("Отель\"Белград\"");
        aManager.addMovie("Джентельмены");
        aManager.addMovie("Человек-неведимка");
        aManager.addMovie("Тролли. Мировой тур");
        aManager.addMovie("Номер один");

        String[] expected = {"Бладшот", "Вперёд", "Отель\"Белград\"", "Джентельмены", "Человек-неведимка", "Тролли. Мировой тур", "Номер один"};
        String[] actual = aManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLast5() {
        aManager.addMovie("Бладшот");
        aManager.addMovie("Вперёд");
        aManager.addMovie("Отель\"Белград\"");
        aManager.addMovie("Джентельмены");
        aManager.addMovie("Человек-неведимка");
        aManager.addMovie("Тролли. Мировой тур");
        aManager.addMovie("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-неведимка", "Джентельмены", "Отель\"Белград\""};
        String[] actual = aManager.findLastAdded();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test

    public void shouldFindLast3(){
        Manager aManager = new Manager(3);

        aManager.addMovie("Бладшот");
        aManager.addMovie("Вперёд");
        aManager.addMovie("Отель\"Белград\"");
        aManager.addMovie("Джентельмены");
        aManager.addMovie("Человек-неведимка");
        aManager.addMovie("Тролли. Мировой тур");
        aManager.addMovie("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-неведимка"};
        String[] actual = aManager.findLastAdded();
    }
    @Test

    public void shouldFindBeforeLim(){
        Manager aManager = new Manager(4);

        aManager.addMovie("Бладшот");
        aManager.addMovie("Вперёд");

        String[] expected = {"Вперёд","Бладшот"};
        String[] actual = aManager.findLastAdded();
    }
}
