
Feature: Edit Inventory
  Библиотекарят редактира броят налични книги - добавя нови или премахва вече съществуващи. 

  
  Scenario: Библиотекарят добавя нова книга
    Given Отворена е формата за редактиране на наличности
    And Библиотекарят се е логнал успешно
    When Въведен е валиден уникален ISBN
    And Въведено е заглавие на книгата
    And Въведен е автор
    And Въведен е наличен брой екземпляри
    And Въведена е цена
    And Натиснат е бутон Добави книга
    Then Системата генерира ID на новата книга
    And Извежда се съобщение "Успешно добавихте ново произведение. "

  Scenario: Библиотекарят редактира брой наличности
    Given Отворена е формата за редактиране на наличности
    And Библиотекарят се е логнал успешно
    And Библиотекарят е намерил книгата по дадeно заглавие
    When Въведена е нова стойност за наличен брой, по-голяма или равна на нула
    And Натиснат е бутон Save
    Then Запазва се новата стойност
    And Извежда се съобщение "Успешно редактиран запис."


