# Deploy Spring boot Angular 4 приложение

dist папка после билда angular приложени, должна быть
скопирована в директорию spring boot приложения
в папку resources/static

## Первый способ:
Пример файла package.json:

    "build": "ng build -prod",
    "postbuild": "npm run deploy",
    "predeploy": "rimraf ../server/src/main/resources/static && mkdirp ../server/src/main/resources/static",
    "deploy": "copyfiles -f dist/** ../server/src/main/resources/static",

Пример: https://www.youtube.com/watch?v=Aduicn2FT58&t=153s

## Второй способ:
Файл .angular-cli.json
  "outDir": "..//server//src//main//resources//static" - здесь должна быть директория для экспорта

Сборка командой - ng build
