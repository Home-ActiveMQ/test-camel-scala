A camel project built with scala
---

* `test-camel-scala` https://github.com/doppiomacchiatto/test-camel-scala

Этот проект описывает, как настроить camel, camel-scala, gradle и active-mq (http://camel.apache.org).

В проекте есть camel route `MyRouteBuilder` который читает XML-файлы из `data\messageX.xml` и отправляет XML-сообщение в очередь activemq.
Затем логика пере-направляет сообщение из очереди в конечную точку с помощью выражения: `xpath("/person/city='London'")`.


Чтобы запустить проект из командной строки:

1. Убедитесь, что у вас установлен Gradle
2. :> gradle clean runSimple
3  :> gradle test

ПРИМЕЧАНИЕ Этот проект был создан с помощью maven-архетипа `camel-activemq`