package mercadorony;

import java.util.Scanner;

public class mercadorony {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Atributos at = new Atributos();
        ArrayId id = new ArrayId();
        int count = 1;
        int resp2 = 1;
        while(resp2 ==1){
        System.out.println("[1]Cadastrar Produto\n[2]Pesquisar Produto\n"
                + "[3] - Remover Produto [4] - Atulizar Atributo do Produto");
        int resp = sc.nextInt();
        if (resp == 1) {
            sc.nextLine();
            System.out.println("Nome do Produto: ");
            at.setNome(sc.nextLine());
            System.out.println("Insira Setor: ");
            at.setSetor(sc.nextLine());
            System.out.println("Fornecedor: ");
            at.setFornecedor(sc.nextLine());
            System.out.println("Estoque: ");
            at.setEstoque(sc.nextInt());
            sc.nextLine();
            System.out.println("Preço: ");
            at.setPreco(sc.nextLine());
            id.arrayId(count, at.getNome(), at.getSetor(), at.getFornecedor(), at.getEstoque(), at.getPreco());
            System.out.println(id.getArrayId(count));
            
        }if(resp ==2){
            System.out.println("Digite o codigo que voce quer ver: ");
            System.out.println(id.getArrayId(sc.nextInt()));
        }if(resp == 3){
            System.out.println("Digite o codigo que voce quer remover: ");
            int resp3 = sc.nextInt();
            id.removerId(resp3);
            System.out.println(id.getArrayId(resp3));
            
        }if(resp ==4){
            System.out.println("Digite o codigo que voce quer atualizar");
            int opcao = sc.nextInt();
            System.out.println("Digite o que voce quer atulizar \n1 - Nome \n2 - Setor \n3 - Fornecedor \n4 - Estoque"
                    + "\n5 - Preço ");
            int opcao2 = sc.nextInt();
            id.atualizarId(opcao, opcao2);
            System.out.println(id.getArrayId(opcao));
        }
        System.out.print("Voce quer continuar? [1] - Sim [2] - Não");
        resp2 = sc.nextInt();
        count++;
        }
        
    }

}
