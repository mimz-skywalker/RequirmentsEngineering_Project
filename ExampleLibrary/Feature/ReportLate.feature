
Feature: Report feature
  Библиотекарят е логнат в системата и създава репорт за закъснение за връщане на книга

  Scenario: Успешно създаден репорт
    Given Отворена е формата за създаване на репорт
    And Библиотекарят се е логнал успешно
    When Въведено е LettingID
    And Въвеждат се детайли
    And Въвежда се име на човека, създаващ репорта
    And Натиска се бутон Завърши репорт
    Then Системата създава репорт
    And Извежда се съобщение "Успешно създаден репорт."
    And Генерира ID на репорта


  Scenario: Не е въведено LettingID
    Given Отворена е формата за създаване на репорт
    And Библиотекарят се е логнал успешно
    When Въвеждат се детайли 
    And Натиска се бутон Завърши репорт
    Then Извежда се съобщение "Моля, посочете активно отдаване. "
    And Изчистват се попълнените полета.
