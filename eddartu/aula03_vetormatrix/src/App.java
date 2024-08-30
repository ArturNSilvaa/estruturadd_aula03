import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

// Declaração de um vetor de inteiros com tamanho 5
//int[] meu_array = new int[5];

// Inicializando vetor, guardando o 10 na posição 0
//meu_array[0] = 10;
//meu_array[1] = 20;
//meu_array[2] = 30;
//meu_array[3] = 40;
//meu_array[4] = 50;

//recuperar os elementos da array por acesso rapido
// a quantidade de elementos é amarrada no inicio, por meio de um numero inteiro
// permitindo
//int element0= meu_array[0];
//int element1= meu_array[1];

//System.out.println(element0);
//System.out.println(element1);


//Array (ou Vetor) do tipo Texto/String
String[] lista_aluno = new String[5];

lista_aluno[0]="Artur";
lista_aluno[1]="Rafael";
lista_aluno[2]="Yasmin";
lista_aluno[3]="Tayna";

// Array (ou Vetor) do tipo Texto/String
// a quantidade de elementos é amarrada no ato da criação
// portanto, não é possivel modificar a quantidade, somente adicionando e removendo

String[] lista_cidade = {"Poá", "Itaim", "Suzano", "Itu"};
// 0- Poá 1-Itaim 2-Suzano 3-Itu


// Acesso posicional - Sequencial (percorrer um array)
for (int i = 0; i < lista_cidade.length; i++) {
            System.out.println("Elemento " + i + ": " + lista_cidade[i]);

// exibindo um array dentro do systemout
int[] array = {1, 2, 3, 4, 5};
// System.out.println(Arrays.toString(array));
// System.out.println(Arrays.toString(lista_cidade));

// verificando o tamanho do array
// System.out.println("O tamanho é: " + array.length);

//copiando uma array

int[] copia = array.clone();
 String[] copia_cidade = lista_cidade;

// System.out.println("Copia: "+ Arrays.toString(copia));
//System.out.println("Copia: "+ Arrays.toString(copia_cidade));

//recortando e copiando para uma nova array
String[] copia_sel = Arrays.copyOf(lista_cidade, 3);
//System.out.println("Copia: "+ Arrays.toString(copia_sel));

//organizando elementos
int[] nova_array = {5,6,4,2,3,1,0};
Arrays.sort(nova_array);

// System.out.println("Ordenada em: "+ Arrays.toString(nova_array));

// inserindo um valor igual em todas as posições

int[] array_vazia = new int[5];
System.out.println(":"+ Arrays.toString(array_vazia));

Arrays.fill(array_vazia,10);

System.out.println(":"+ Arrays.toString(array_vazia));

// verificando se as arrays são iguais
boolean resp = Arrays.equals(lista_cidade, copia_cidade);

System.out.println("São Iguais: "+resp);

// testando com if
if(Arrays.equals(lista_cidade,copia_cidade)){
    System.out.println("Elas são iguais");
    System.out.println("Elas são diferentes");

//  buscando elementos
int posicao = Arrays.binarySearch(array, 30);
System.out.println("foi localizada na posição: "+ posicao);
}

}

    }
}
