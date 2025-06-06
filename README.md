# Запуск тестов через командную строку

## Запуск всех тестов
`mvn clean test`

## Запуск смок тестов по тегу
`mvn clean test -Dgroups=smoke`

## Запуск тестов по страницам
### Страница логина
`mvn clean test -Dgroups=loginForm`
### Страница PIM

### Форма Add employee
`mvn clean test -Dgroups=addEmployee`