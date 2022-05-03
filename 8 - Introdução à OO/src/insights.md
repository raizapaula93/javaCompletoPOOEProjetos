Classe = meio que vira um tipo
Condensamento de variáveis em um tipo só(um tipo composto)
Eu instancio as "varias" variáveis que x teria em somente uma variável, mas apontando para três espaços de memória

stack -> área onde são criadas as variáveis estáticas, variáveis declaradas no programa;
Quando eu instancio, eu crio um objeto em outra área de memória (dentro da memória alocada pelo programa) chamada Heap(área onde são criados os objetos dinâmicos, utilizados durante a execução).Dentro do x no stack não estão os dados do triângulo, mas sim o endereço de memória criado no heap
Neste exemplo:

Classe = definição do tipo;

É simplismente um cara q vai contar q meu triângulo tem um a,um b e um c

x,y ->Objetos: são instâncias da classe