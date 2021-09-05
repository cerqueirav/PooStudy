<a id="about"></a>

## Sobre



   Avaliação referente a disciplina Programação Orientada a Objetos, ministrada pelo professor [Frederico Barboza](http://lattes.cnpq.br/2897532678011764), por meio do repositorio que se encontra [aqui](https://github.com/pooinf008/inf008-20211/tree/master/especificacao).

<a id="features"></a>

## Ajustes e melhorias

O projeto ainda está em desenvolvimento e as próximas atualizações serão voltadas nas seguintes tarefas:

<h3>Primeira Expecificação 🟠</h3>
     <p>
      As cores RGB modelam um sistema de cores aditivas em que o Vermelho (Red), o Verde (Green) e o Azul (Blue) são combinados de várias formas de modo a reproduzir um largo espectro cromático. Uma cor RGB é representada por uma 3-upla, onde cada elemento pode assumir um valor de 0 a 255, representando a quantidade de vermelho, verde e azul que compõem a cor.
  
  Em cores RGB, a luminosidade é calculada através da expressão de luminosidade = (R*0.3 + G*0.59 + B *0.11) que deve ser truncada para um valor inteiro.
    </p>
        <li> I. Uma classe que represente uma cor RGB. 🟢
        <li> II. A representação estática da classe criada. 🟢
        <li> III. Os métodos que lêem e alteram os valores das componentes RGB da cor. 🟠
        <li> IV. Um método que leia a luminosidade da cor. 🟢
        <li> V. Construtores sobrecarregados que permitam a criação de uma cor. 🔴
        <li> VI. Um construtor de cópia, que crie uma cor idêntica (mesmo valor de R, G e B). 🔴
        <li> VII. Um construtor sem parâmetros, que crie a cor preta (<R=0, G=0, B=0>). 🟢
        <li> VIII. Um construtor que receba três valores como parâmetros e crie uma considerando estes valores como os valores de R, G e B, respectivamente. 🟢
        <li> IX. Um método que verifique se duas cores são iguais. As cores são consideradas iguais se seus valores de R, G e B são idênticos entre si (o R de uma cor igual o R da outra e assim por diante). 🔴
        <li> X. Altere as propriedades Red, Green e Blue e Luminosidade para serem exclusivamente leitura. 🔴
        <li> XI. Um método que gere e retorne uma nova cor RGB equivalente ao cinza da cor RGB em questão. Essa cor possui os valores de R, G e B iguais entre si e iguais ao valor da luminosidade da cor original. Por exemplo, para a cor #2596BE, a cor gerada deverá ser #797979.  🟢
        <li> XII. Um método que gere uma representação String da cor como hexadecimal. A representação é composta pelo caracter # seguida de dois dígitos representando o valor de R, G e B em hexadecimal. Por exemplo, para a cor RGB, onde R=37, G=150, B=190, o método deve retornar: #2596BE.  🟢
        <li> XIII. Um método clarear que receba um valor e modifique a tonalidade da cor em questão a tornando mais clara. Para isso, o método deve modificar os valores RGB, para um novo valor p percentual maior, onde p deve ser indicado como parâmetro. Por exemplo, para a cor  #2596BE, se o parâmetro de clarear for 0.1 (10%), a cor deve se tornar #3BA1C5. 🔴
        <li> XIV. Um método escurecer que receba um valor e modifique a tonalidade da cor em questão a tornando mais escura. Para isso, o método deve modificar os valores RGB, para um novo valor p percentual menor, onde p deve ser indicado como parâmetro. Por exemplo, para a cor  #2596BE, se o parâmetro de escurecer for 0.1 (10%), a cor deve se tornar #2187AB. 🔴
        <li> XV. Um método que retorne uma nova instância de CorRGB, igual a cor que recebeu a mensagem. 🔴
        <li> XVI. Atributos de classe que permitam reduzir o número de instâncias em uso de cores comuns. 🔴
            <ul>
                <li> I.   PRETA #000000 🔴
                <li> II.  BRANCA #FFFFFF 🔴
                <li> III. RED #FF0000 🔴
                <li> IV.  GREEN #00FF00 🔴
                <li> V.   BLUE #0000FF 🔴
            </ul>

##### Legenda
- 🟢 = `Feito`.
- 🟠 = `Fazendo`.
- 🔴 = `Pendente/Falta`.

<a id="technologies-used"></a>

## Tecnologias Utilizadas

Esse projeto foi desenvolvido utilizando a seguinte tecnologia, e pacotes:

- [Java](https://www.java.com/pt-BR/)

<a id="how-to-use"></a>

## Como clonar e importar

- Faça um fork do projeto
- Abra o terminal do Visual Studio Code
- Digite (troque cerqueirav pelo nome do seu usuário): git clone https://github.com/cerqueirav/PooStudy
- Nome da pasta: PooStudy


<a id="how-to-contribute"></a>

## Como contribuir

- Fork este repositório,
- Crie sua branche com sua contribuição: `git checkout -b my-feature`
- Commit suas mudanças: `git commit -m 'feat: My new feature' `
- Push sua branch: `git push origin my-feature`

<h4 align="center">
    Made by <a href="https://github.com/cerqueirav" target="_blank">Victor Cerqueira</a>
</h4>