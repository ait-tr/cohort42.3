<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

**Instructions for working in the project:**
- select a team leader (team lead - TL);
- create a public repository on GitHub, which is administered by TL;
- TL makes an initial commit (IC), fills out the readme about the project (briefly!), writes a statement of specific tasks and deadlines;
- TL connects team members (collaborators) to the repository;
- TL creates a dev branch based on main;
- all team members clone the repository for themselves;
- the leader and the team agree on the way to name their branches according to the stages of the project, for an example - see below;
- team members create their own correctly named branches for each stage of development;
- develop their parts of the project in their branches;
- send the code to GitHub in their branch, create a pull request to upload their code to the dev branch;
- team lead conducts code review, writes comments, sends code for corrections;
- if conflicts arise, they must be eliminated/resolved;
- TL accepts PRs when ready in the dev branch and writes tasks for the next stage to team members;
- after building the next stage on dev, all team members must pull the dev branch to themselves and continue development, again creating their own branches based on the latest version of the project from dev;
- based on the results of all stages of development, TL pushes the dev branch to main.

An example of instructions for formatting the names of branches and commits:
**Branches:**
- for features:
  branch: features/(project-XXX)_brief_description of_task
- for fixes:
  branch: fix/(project-XXX)_brief_description of_task
- refactoring:
  branch: refactoring/(project-XXX)_brief_description_of_task



<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

**Инструкция по работе в проекте:**
- выбрать лидера команды (team lead - TL);
- создать публичный репозиторий на GitHub, который администрирует TL;
- TL делает initial commit (IC), заполняет readme о проекте (кратко!), пишет постановку конкретных задач и сроки;
- TL подключает членов команды (collaborators) к репозиторию;
- TL создает ветку dev на основе main;
- все члены команды клонируют репозиторий себе;
- лидер и команда договариваются о способе именования своих веток по этапам проекта, пример - см. ниже;
- члены команды создают свои правильно именнованные ветки для каждого этапа разработки;
- ведут разработку своих частей проекта в своих ветках;
- отправляют код на GitHub в свою ветку, создают pull request на залитие своего кода в ветку dev;
- team lead проводит code review, пишет замечания, отправляет код на исправления;
- если появляются конфликты, то их необходимо устранять/разрешать;
- TL принимает PR по готовности в ветку dev и пишет задачи на следующий этап членам команды;
- после сборки очередного этапа на dev все члены команды должны выполнить pull ветки dev к себе и продолжить разработку, создавая опять свои ветки на основе последней версии проекта из dev; 
- по итогам всех этапов разработки TL делает push ветки dev на main.

Пример инструкции по оформлению названий веток и коммитов:
**Ветки:**
- для фич:
  ветка: features/(project-XXX)_краткое_описание_задачи
- для фиксов:
  ветка: fix/(project-XXX)_краткое_описание_задачи
- рефакторинг:
  ветка: refactoring/(project-XXX)_краткое_описание_задачи


</details>






