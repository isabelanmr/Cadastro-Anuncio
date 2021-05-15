## Instruções de como compilar e executar o programa:

Windows: Inicialmente, pressione a tecla Win + R; digite cmd e tecle enter. Após isso digite alguns comandos:
- cd Desktop:
o comando "cd" permite entrar no diretório "Desktop".


- java -version:
exibe a versão do Java instalado em sua máquina (comando opcional).


- dir:
lista todos os arquivos e pastas do diretório atual. É preciso identificar se está presente o Exemplo.java que irá compilar.


- javac -cp . Exemplo.java:
•	O comando javac compila o arquivo Java.
•	O argumento -cp (classpath) destina em qual diretório a classe deverá ser armazenada. Nesse caso -cp aponta para o "." que é o diretório atual. Se nenhum diretório for especificado, com a omissão do argumento, então é armazenado no diretório atual. Portanto, javac -cp . Exemplo.java é equivalente a javac Exemplo.java.
•	Exemplo.java é o arquivo que será compilado.

- java Exemplo:
•	Esse comando serve para chamar a JVM, que realizará todos aqueles passos de verificação e então executará nosso programa escrito em Java, se estiver tudo certo. 



## Instruções de utilização:

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

