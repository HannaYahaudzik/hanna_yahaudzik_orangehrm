# Описание проекта
В проекте реализованы автоматизированные UI тесты для веб-приложения [OrangeHRM](https://opensource-demo.orangehrmlive.com/web/index.php/auth/login).

# Стэк
* Java 17
* Maven
* Selenium WebDriver
* JUnit

# Структура проекта
````
* src
  * main
    * java
      * eu.senla
        * commonElement - общие элементы для страниц (меню, header, footer)
        * driver - работа с Selenium WebDriver
        * entity - объекты данных
        * enums - списки
        * pageObject - страницы
        * utilities - вспомогательные Utility classes
        * webElements - custom web elements
    * resources - property files
  * test - только тесты
    * java        
````

# Запуск тестов через командную строку

## Запуск всех тестов
`mvn clean test`

## Запуск смоук тестов
`mvn clean test -Dgroups=smoke`

## Запуск тестов по страницам

> Страница логина
`mvn clean test -Dgroups=loginForm`

> Admin. Страница Job Titles
`mvn clean test -Dgroups=jobTitles`

> Admin. Job Titles. Страница Add Job Title
`mvn clean test -Dgroups=addJobTitle`

> PIM. Форма Add employee
`mvn clean test -Dgroups=addEmployee`

> Recruitment. Форма Add candidate
`mvn clean test -Dgroups=addCandidate`