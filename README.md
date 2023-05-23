[![NPM](https://img.shields.io/npm/l/react)](https://github.com/lucarauj/Trilha-Digital-Web-Back-End/blob/main/LICENSE)

<h1 align="center">Trilha Digital | Web Back-End</h1>

<p align="center"><img width="700px" src="https://github.com/lucarauj/Trilha-Digital-Web-Back-End/blob/main/Trilha%20Digital%20Web%20Back%20End%20Completed.png" /></p>

<br>

## 🗜 Git e Versionamento

### Documentação:

- https://git-scm.com/docs

### Iniciando um novo repositório local:

- git init

### Verificando as condições do diretório de trabalho e da área de staging:

- git status

### Adicionando uma alteração no diretório ativo à área de staging:

- git add . (todos)
- git add "nome do arquivo"

### Capturando um instantâneo das mudanças preparadas do projeto no momento:

- git commit -m "histórico"

### Defazendo um commit:

- git reset

### Mostrando alterações entre confirmações, commit e árvore de trabalho:

- git diff
- git diff --staged

### Visualizando histórico dos commits:

- git log

### Desfazendo alterações em arquivos modificados:

- git restore "nome do arquivo"
- git restore --staged "nome do arquivo" (arquivos na área de staged)

### Listando conjunto de repositórios rastreados:

- git remote 

### Enviando alterações do repositório local para o remoto:

- git push 

### Atualizando repositório local em relação ao remoto:

- git pull

### Verificando alterações no repositório remoto antes de atualizar o repositório local:

- git fetch
- git diff

### Verificando branch existentes:

- git branch

### Criando uma branch:

- git branch "nome da branch"

### Mudando de branch:

- git checkout "outra branch"

### Atualizando uma branch com arquivos de outra branch:

- git merge "outra branch"

<br>

## ⚙ Algorítimos

### Tipos de dados:

- Numérico (inteiro | ponto flutuante)
- Texto
- Booleano (verdadeiro | falso)

### Variável:

- Identificador de um valor dentro da memória de um computador.

### Estruturas:

- Decisão (SE)
- Repetição (ENQUANTO)

### Listas:

- Estruturas de dados utilizadas na programação para agrupar valores que são relacionados entre si.

### Funções:

- Subprogramas ou blocos de código que realizam uma tarefa específica.

<br>

## 💻 Redes e Sistemas

### Redes:

- Conjunto de dois ou mais dispositivos eletrônicos conectados entre si: (Conexão física | Coaxial ou fibra óptica | Via Wireless);

### Origem das redes:

- Darpa
- Arpanet

### NIC(Network Interface Card):

- Placa de rede 👉 responsável por permitir a conexão do computador com o cabe de rede Ethernet ou por receber as ondas de rádio frequência das conexões wireless.

### Hub:

- Hardware que permite a conexão entre dispositivos através de cabos de par trançados e conectados entre si.

### Switch:

- Responsável pela troca ou encaminhamento de informações dos quadros entre os dispositivos.

### Roteador:

- Tem a responsabilidade de procurar as melhores rotas na internet para entregar os pacotes do remetente ao destinatário no menor tempo possível.

### Modem:

- Responsável pela modulação e demodulação do sinal de internet.

### Cabeamento estruturado:

- São padrões estabelecidos que definem como serão as organizações dos cabos e seus periféricos possibilitando melhor organização e performance na rede.

### Par trançado (UTP | STP):

- São dividiso em categorias que determinam a velocidade de transmissão dos dados e o alcance em metros que o cabo pode suportar sem a perda de pacotes.

### Cabo coaxial:

- É composto por fios de cobre, tendo o fio central responsável por ser o condutor do pulso elétrico.

### Fibra óptica:

- Oferece maior velocidade de transmissão de dados. É composta por pedaços de vidros que permitem a propagação dos raios de luz que são convertidos por conversores nas extremidades das fibras.

### Rack:

- Armário para hospedar os equipamentos de hardwares e organizar os cabos em patch panels.

### Modelo OSI | TCP/IP:

- OSI [7 camadas] - Aplicação, Apresentação, Sessão, Transporte, Rede, Enlace e Física.
- TCI/IP [4 camadas] - Aplicação, Transporte, Internet e Acesso a Rede.

### Internet Protocol:

- IP - Protocolo responsável por gerar um endereçamento ao computador ou qualquer servidor.
- IPV4: 32 bits dividido em 8 octetos onde cada um pode variar de 0 até 255.
- IPV6: 128 bits dividido em 16 pares.

### Comandos de Configuração:

- ipconfig: mostra as configurações de ip;
- ipconfig /flushdns: limpa o cash dns;
- ping "endereço de página": verificando conexão com o endereço;
- nslookup "endereço de página": obtem informações relacionadas a um nome de domínio específico;
- tracert "endereço de página": mapeia os saltos (quantos roteadores) até o domínio específico;
- route print: exibir a tabela de roteamento IP atual do computador;
- netstate: mapear as portas que estão sendo utilizadas no computador;

<br>

## ☕ Introdução ao Java

### JRE:

- Ambiente de execução;

### JDK:

- Kit de desenvolvimento;

### IDE:

- Ferramenta de desenvolvimento;

### Variáveis:

- [Documentação Java](https://docs.oracle.com/javase/tutorial/reallybigindex.html)
- byte[-128 - 127], short[-32.768 - 32.767], int, long, float, double, boolean, char[unicode];
 
### Operadores:

- (>, >=, <, <=, ==, !=);
- (+, -, *, /);
- && (AND);
- || (OR);
- Ternário (variável[verdadeira/falsa] ? "Se verdadeira: Executa Opção 1" : "Se falsa: Executa Opção 2");

### Estruturas condicionais:

- Se (if);
- Senão (else);

### String | Date:

- toUpperCase(): converte a string para caracteres maiúsculos;
- toLowerCase(): converte a string para caracteres minúsculos;
- length(): exibe a quantidade de caracteres de uma string;
- equals(): compara duas strings;
- equalIgnoreCase(): compara duas strings desconsiderado caracteres minúsculos e maiúsculos;
- LocalDate.now(): representa o ano-mês-dia local;
- getDayOfWeek(): retorna o dia da semana;
- System.out.printf(%s [representa string] | %n [representa quebr de linha]);

### Arrays:

- int[] numeros = new int[n];
- numeros.lenth = exibe o tamanho do array;
- System.out.println(Arrays.toString(array): exibe o array;

### Funções | Métodos:

- Podem retornar valores (return);
- Podem não retornar um valor (void);

<br>

## 🛠 Introdução à programação orientada a objetos em Java

### Tipos primitivos:

- byte, short, chat, int, long, float, double, boolean;

### Classes:

- Possuem características e comportamentos específicos que definem as suas instâncias (objetos);
- String: guarda uma cadeira de caracteres;
- Atributos: são as características de uma classe;
- Métodos: são os comportamentos que um objeto pode apresentar; 

### Modificadores de acesso:

- public | protected | default | private;

### Herança:

- As classes filhas herdam da classe pai as características e comportamentos (extends);

### Sobrescrevendo um método:

- @Override;

### Polimorfismo:

- Capacidade de um objeto poder ser referenciado de várias formas;

### Classe Abstrata:

- Contém um ou mais métodos para os quais não há definição; 
- Objetos não podem ser criados a partir de classes abstratas;

### Comentários:

- // [linha]
- /* */ [bloco]

### Nome de variáveis:

- pode iniciar com _ (anderline);
- não pode ser igual a palavras reservadas;
- não pode iniciar com número;
- não deve iniciar com letra mínuscula;

### Valores default:

- int: 0;
- float: 0.0;
- boolean: false;
- char: vazio;
- String: null;

### Casting:

- float x = float + (float) double [transforma o valor double em float];

### Anderline:

- Pode ser utilizado para melhorar a leitura de um número: int a = 23_345_789;

<br>

## 🎲 Banco de dados

### Documentação PostgreSQL 15:

- https://www.postgresql.org/docs/15/index.html

### Principais tipos de dados:

- numéricos (inteiros, reais)
- text
- date | time
- boolean

### Ferramenta para criar modelagem:

- https://online.visual-paradigm.com/pt/

### Relacionamentos:

- Um para Um (One-to-One)
- Um para muitos (One-to-Many)
- Muitos para Um (Many-to-One)
- Muitos para Muitos (Many-to-Many)

### Criando uma tabela:

```
create table professores(
	id_professor integer,
	celular varchar(14),
	nome varchar(40),
	id_disciplina integer,
	primary key(id_professor),
	foreign key(id_disciplina)
	references disciplinas(id_disciplina)
)
```

### Populando uma tabela:

```
insert into disciplinas values(1,'portugues','literatura e gramatica')
```

### Populando uma tabela através de um .csv:

```
copy disciplinas(id_disciplina, nome, ementa)
from "caminho do arquivo .csv"
delimiter ','
csv header [dispensa a primeira linha]
```

### Alterando dados de uma tabela:

```
update disciplinas set nome = 'PORTUGUES' where id_disciplina = 1
``` 

### Deletando dados de uma tabela:

```
delete from disciplinas where id_disciplina = 1
delete from disciplinas [deleta tudo]
```

### Criando uma View:

- View: Objeto que permite a visualização de dados da tabela a qual esteja associada;

```
create view matricula_com_sigilo as (
	select id_matricula, id_aluno, validade from matricula
)
```

### Criando Index:

- Index: É um valor/coluna utilizada para identificar as tuplas (linha, registro) de uma tabela e facilitar a localização em uma consulta;

```
create index idx_nome on disciplinas(nome)
```

<br>

## 👨‍🎓 Aluno

#### Lucas Araujo

<a href="https://www.linkedin.com/in/lucarauj"><img alt="lucarauj | LinkdeIN" width="40px" src="https://user-images.githubusercontent.com/43545812/144035037-0f415fc7-9f96-4517-a370-ccc6e78a714b.png" /></a>
