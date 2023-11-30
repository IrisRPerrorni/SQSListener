# SQSListener
Estudo com SQSListener

1. Você deixa o seu app escritor de mensagem rodando, toda vez que tu fizer um POST ele vai escrever uma mensagem na fila SQS. (Utilizei o seguinte app: https://github.com/IrisRPerrorni/SQSaws)

2. Você vai criar um SEGUNDO PROJETO, nele você vai criar um @Service com um método que vai ser chamado AUTOMATICAMENTE toda vez que alguma mensagem cair na fila que o primeiro app escreve. Ele vai pegar a mensagem da fila e printar no console.
Então, basicamente, você vai sensibilizar um programa, e automaticamente o outro programa vai ser acionado e printar a mensagem.
## OBS:
- Nesse outro projeto, você tenta usar as libs: spring-cloud-aws-starter e spring-cloud-aws-starter-sqs 

- Eu quero que a mensagem chegue automaticamente, então use o SqsListener =]

- https://howtodoinjava.com/spring-cloud/aws-sqs-with-spring-cloud-aws/

_______________________________
- Com a localstack configurada usar o seguinte comando para criar a fila: 
```bash
#Criar SQS
aws --endpoint-url http://localhost:4566 --profile localstack sqs create-queue --queue-name eventos-criacao-contatos-telefonicos 
```
- Configurar o pom.xml conforme o item 3.1. Maven 
- Após vai em application.properties e coloca as credencias da sua localstack
- Irá fazer uma classe de AWS configure conforme o item 3.4. SqsTemplate Bean para a configuração automatica
- Fazer uma classe para receber as mensagens
- Após rodar os dois app , irá ver a mensagem no console do app que aplicou o SQS Listener.
