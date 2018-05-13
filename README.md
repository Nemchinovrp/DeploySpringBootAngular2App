Deploy Spring boot Angular 4 приложение

dist папка после билда angular приложени, должна быть 
скопирована в директорию spring boot приложения 
в папку resources/static

Пример файла package.json:

  "build": "ng build -prod",
    "postbuild": "npm run deploy",
    "predeploy": "rimraf ../server/src/main/resources/static && mkdirp ../server/src/main/resources/static",
    "deploy": "copyfiles -f dist/** ../server/src/main/resources/static",
    
Пример: https://www.youtube.com/watch?v=Aduicn2FT58&t=153s