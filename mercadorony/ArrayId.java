package mercadorony;

import java.util.Scanner;

public class ArrayId {

    Scanner sc = new Scanner(System.in);
    int var = 9;
    Object arrayID[][] = new String[var][var];
    Object arrayID2[][] = new String[var * 1000][var * 1000];

    public void arrayId(int id, String nome, String setor, String fornecedor, int estoque, String preco) {
        Integer id2 = id;
        Integer estoque2 = estoque;
        if (id < 8) {
            this.arrayID[id][1] = id2.toString();
            this.arrayID[id][2] = nome;
            this.arrayID[id][3] = setor;
            this.arrayID[id][4] = fornecedor;
            this.arrayID[id][5] = estoque2.toString();
            this.arrayID[id][6] = preco;
            for (int i = 0; i < 9; i++) {
                this.arrayID2[id][1] = this.arrayID[id][1];
                this.arrayID2[id][2] = this.arrayID[id][2];
                this.arrayID2[id][3] = this.arrayID[id][3];
                this.arrayID2[id][4] = this.arrayID[id][4];
                this.arrayID2[id][5] = this.arrayID[id][5];
                this.arrayID2[id][6] = this.arrayID[id][6];
            }
        } else {
            this.arrayID2[id][1] = id2.toString();
            this.arrayID2[id][2] = nome;
            this.arrayID2[id][3] = setor;
            this.arrayID2[id][4] = fornecedor;
            this.arrayID2[id][5] = estoque2.toString();
            this.arrayID2[id][6] = preco;

        }
    }
    
    public void getNome(){
        
    }

    public String getArrayId(int id) {
        String frase;
        if (id < 8) {
            return frase = "Código: " + arrayID[id][1] + "\nNome: " + arrayID[id][2] + "\nSetor: " + arrayID[id][3] + "\nFornecedor: " + arrayID[id][4] + "\nEstoque: " + arrayID[id][5] + "\nPreço: R$" + arrayID[id][6];

        } else {
            return frase = "Código: " + arrayID2[id][1] + "\nNome: " + arrayID2[id][2] + "\nSetor: " + arrayID2[id][3] + "\nFornecedor: " + arrayID2[id][4] + "\nEstoque: " + arrayID2[id][5] + "\nPreço: R$" + arrayID2[id][6];

        }
    }

    public void removerId(int id) {
        if (id < 7) {
            for (int i = 0; i < arrayID.length - 1; i++) {
                this.arrayID[i][1] = this.arrayID[i][1];
                this.arrayID[i][2] = this.arrayID[i + 1][2];
                this.arrayID[i][3] = this.arrayID[i + 1][3];
                this.arrayID[i][4] = this.arrayID[i + 1][4];
                this.arrayID[i][5] = this.arrayID[i + 1][5];
                this.arrayID[i][6] = this.arrayID[i + 1][6];
            }
            for (int i = 1; i < arrayID.length; i++) {
                this.arrayID2[i][i] = arrayID[i][i];
            }
        } else {
            for (int i = 0; i < arrayID.length; i++) {
                this.arrayID2[i][1] = this.arrayID2[i][1];
                this.arrayID2[i][2] = this.arrayID2[i + 1][2];
                this.arrayID2[i][3] = this.arrayID2[i + 1][3];
                this.arrayID2[i][4] = this.arrayID2[i + 1][4];
                this.arrayID2[i][5] = this.arrayID2[i + 1][5];
                this.arrayID2[i][6] = this.arrayID2[i + 1][6];
            }
            for (int i = 1; i < 7; i++) {
                this.arrayID[i][i] = arrayID2[i][i];

            }
        }
    }

    public void atualizarId(int id, int opcao) {
        System.out.println("Digite o que voce quer substituir");
        String opcao2 = sc.nextLine();
        if (opcao == 1) {
            this.arrayID[id][2] = opcao2;
            this.arrayID2[id][2] = opcao2;
        }
        if (opcao == 2) {
            this.arrayID[id][3] = opcao2;
            this.arrayID2[id][2] = opcao2;
        }
        if (opcao == 3) {
            this.arrayID[id][4] = opcao2;
            this.arrayID2[id][2] = opcao2;
        }
        if (opcao == 4) {
            this.arrayID[id][5] = opcao2;
            this.arrayID2[id][2] = opcao2;
        }
        if (opcao == 5) {
            this.arrayID[id][6] = opcao2;
            this.arrayID2[id][2] = opcao2;
        }

    }
}
