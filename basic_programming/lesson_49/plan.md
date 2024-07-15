<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan No. 49 07/15/2024

1. What we did in the last lesson:
- mastered working with branches in Git (GitHub)

2. Homework:
- add tests;
- write a console application with a menu and saving/reading data from a file.

3.Workshop on working with Git:

**Task:**
Take the text of a popular song in Russian or English, at least 3 verses.
Each member of the development team adds two lines to the lyrics per iteration.
It is necessary to generate the complete correct text in several iterations (3-4).

Process description:
- select a team leader (team lead - TL);
- create a public repository on GitHub, which is administered by TL;
- TL makes an initial commit (IC), fills out the readme about the project (briefly!), writes a statement of specific tasks and deadlines;
- TL connects team members to the repository;
- TL makes a dev branch from main;
- all team members clone the repository for themselves;
- the leader and the team agree on the way to name their branches according to the stages of the project, for an example - see below;
- team members create their own correctly named branches for each stage of development;
- add “code” (2 lines from a verse of a song) to their branches, always making mistakes in the text and design (leaving comments, empty lines, mistakes in words, etc. in the code);
- create a pull request (PR) and send the TL code to code review (CR) in the dev branch;
- team lead conducts code review, writes comments, sends code for corrections;
- if conflicts appear, they must be eliminated/resolved (for a conflict to appear, you must forget to do git pull before making changes to your branch);
- TL accepts PRs when ready in the dev branch and writes tasks for the next stage to team members;
- based on the results of all stages, TL pushes the dev branch to main.

An example of instructions for formatting the names of branches and commits:
**Branches:**
- for features:
  branch: features/(SONG-XXX)_brief_description of_task
- for fixes:
  branch: fix/(SONG-XXX)_brief_description_of_task
- refactoring:
  branch: refactoring/(SONG-XXX)_brief_description_of_task

**Commit:**
- commits according to this template:
  (SONG-xxx)_commit_description

4. **Implementation of a mini-project (console application):**

**Requirements:**
- Availability of menus and messages from the application in English
- Saving and restoring data from a file in the current project directory (package)
- Project structure:
  -dao
- model
- tests
- application
- protection against "fool" (incorrect data entry)

**Organization of work and timing:**
- joint work in Zoom during classes on July 15 and 17, you can request additional fees. conferences
- distribution of roles (team lead, programmers, tests, project management)
- distribution of tasks
- creating a repository on GitHub
- use of the Internet and AI - as needed and desired.

**Themes:**
- currency converter:
- loads a list of available currencies with rates from a file;
- asks the client for the desired currency and how much money he has to exchange;
- reports the amount to be issued;
- at the end of the session, saves all transactions made to a file, provides a report on the amount
  exchanges for each currency separately for purchase and sale.

- family budget for the current month:
- purchases (a purchase contains several products);
- who did the shopping;
- in which shop;
- budget control during the month.

- calculator of calories eaten per day.

___

# План занятия №49 15.07.2024

1. Что мы делали на прошлом занятии:
- осваивали работу с ветками в Git (GitHub)

2. Домашнее задание:
- дописать тесты;
- написать консольное приложение с меню и сохранением/считыванием данных из файла.

3.Практикум по работе с Git:

**Задача:**
Берем текст популярной песни на русском или английском языке, не менее 3-х куплетов.
Каждый член команды разработчиков добавляет за одну итерацию две строки в текст песни.
Необходимо за несколько итераций (3-4) сформировать полный правильный текст. 

Описание процесса:
- выбираем лидера команды (team lead - TL);
- создаем публичный репозиторий на GitHub, который администрирует TL;
- TL делает initial commit (IC), заполняет readme о проекте (кратко!), пишет постановку конкретных задач и сроки;
- TL подключает членов команды к репозиторию;
- TL делает ветку dev от main; 
- все члены команды клонируют репозиторий себе;
- лидер и команда договариваются о способе именования своих веток по этапам проекта, пример - см. ниже;
- члены команды создают свои правильно именнованные ветки для каждого этапа разработки;
- вносят "код" (по 2 строки из куплета песни) в свои ветки, обязательно допускают ошибки в тексте и оформлении (оставляют в коде комментарии, пустые строки, ошибки в словах и т.д.);
- создают pull request (PR) и отправляют код TL на code review (CR) в ветку dev;
- team lead проводит code review, пишет замечания, отправляет код на исправления;
- если появляются конфликты, то их необходимо устранять/разрешать (для появления конфликта нужно забывать делать git pull до того, как вносить изменения в свою ветку);
- TL принимает PR по готовности в ветку dev и пишет задачи на следующий этап членам команды;
- по итогам всех этапов TL делает push ветки dev на main.

Пример инструкции по оформлению названий веток и коммитов:
**Ветки:**
- для фич:
ветка: features/(SONG-XXX)_краткое_описание_задачи
- для фиксов:
ветка: fix/(SONG-XXX)_краткое_описание_задачи
- рефакторинг:
ветка: refactoring/(SONG-XXX)_краткое_описание_задачи

**Commit:**
- коммиты по этому шаблону: 
(SONG-xxx)_описание_коммита

4. **Реализация мини-проекта (консольное приложение):**

**Требования:**
  - Наличие меню и сообщения от приложения на английском языке
  - Сохранение и восстановление данных из файла в текущей директории проекта (пакете)
  - Структура проекта:
    - dao
    - model
    - tests
  - приложение
  - защита от "дурака" (некорректный ввод данных)

**Организация работы и тайминг:**
  - совместная работа в Zoom во время занятий 15 и 17 июля, можно запросить доп. конференции
  - распределение ролей (team lead, programmers, tests, project management)
  - распределение задач
  - создание репозитория на GitHub 
  - использование Интернета и AI - по необходимости и желанию.

**Темы:**
- конвертор валюты:
    - загружает из файла список доступных валют с курсами;
    - запрашивает у клиента желаемую валюту и сколько у него денег для обмена;
    - сообщает сумму к выдаче;
    - в конце сеанса сохраняет все сделанные транзакции в файл, предоставляет отчет о сумме
      обменов по каждой валюте отдельно по покупке и продаже.

- семейный бюджет в текущем месяце:
    - покупки (покупка содержит несколько продуктов);
    - кто делал покупки;
    - в каком магазине;
    - контроль бюджета в течение месяца.

- калькулятор калорий съеденного за день.