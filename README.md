# PS5ToXbox Adapter (ClassAdapter)

Exemplo de Utilização do Class Adapter:

Este exemplo é utilizado no meu trabalho de Linguagem de Programação IV a respeito de Design Patterns, mais especificamente de Class Adapter.

Esse exemplo conta com as classes:

- AdaptadorPS5ParaXbox(Adapter)
- ControlePS5(Cliente)
- SensorPS5(Interface)
- SensorXbox(Classe)
- Teste (Classe Principal)

*Problema:* Preciso conectar um controle de PlayStation 5 em um computador que só reconhece controles de Xbox.

*Solução:* Adaptar o controle para que ele seja reconhecido como um de Xbox.

A ideia é simples, utilizar o SensorPS5 como interface para através dele, conseguir migrar seus métodos e propriedades para um Adapter(AdaptadorPS5ParaXbox), que por sua vez, realiza o trabalho de conversão. Enquanto que o Cliente, neste caso, fica responsável pela conexão de entrada, por onde o Adapter irá converter suas propriedades para ser interpretado como um controle de Xbox.

O exemplo é bem simples e não segue padrões de forma estritamente correta, no entanto, mostra resultado satisfatório suficiente para exemplificação didática de como funciona este Padrão de Design.

Espero que tenha ficado claro. Obrigado!
