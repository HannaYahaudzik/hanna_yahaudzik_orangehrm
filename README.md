# Запуск тестов через командную строку

## Запуск регрессионных тестов
`mvn clean test -Dtest=eu.senla.suites.RegressTests`

## Запуск всех тестов по тегу
`mvn clean test -Dgroups=all`

## Запуск смок тестов по тегу
`mvn clean test -Dgroups=smoke`

## Запуск тестов по страницам
### Страница логина
`mvn clean test -Dgroups=loginForm`
### Страница PIM

### Форма Add employee
`mvn clean test -Dgroups=addEmployee`