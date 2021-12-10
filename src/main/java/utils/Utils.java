package utils;

public class Utils {
    public static void limparTela(){
        for (int i = 0; i < 2; i++){
            System.out.println(" ");
        }
    }


    public static void mostrarvendedores2(){
        String vendedor = new String();
        if(vendedor == "antunes" || vendedor == "Antunes" || vendedor == "ANTUNES"){
            lojaantunes.setNomeDoProduto("Batom");
            lojaantunes.setIdProduto(1);
            lojaantunes.setPrecodoProduro(3.99);
            lojaantunes.setEstoque(3);
        } else if(vendedor == "santos" || vendedor == "Santos" || vendedor == "SANTOS"){
            lojasantos.setNomeDoProduto("Anel Cinderela");
            lojasantos.setIdProduto(2);
            lojasantos.setPrecodoProduro(10.00);
            lojasantos.setEstoque(6);
        } else if(vendedor == "ferreira" || vendedor == "Ferreira" || vendedor == "FERREIRA"){
            lojaferreira.setNomeDoProduto("Chave de Fenda");
            lojaferreira.setIdProduto(3);
            lojaferreira.setPrecodoProduro(5.36);
            lojaferreira.setEstoque(9);
        } else if(vendedor == "salgueiro" || vendedor == "Salgueiro" || vendedor == "SALGUEIRO"){
            lojasalgueiro.setNomeDoProduto("Coxinha Congelada");
            lojasalgueiro.setIdProduto(4);
            lojasalgueiro.setPrecodoProduro(5.99);
            lojasalgueiro.setEstoque(30);
        } else if(vendedor == "figueira" || vendedor == "Figueira" || vendedor == "FIGUEIRA"){
            lojasalgueiro.setNomeDoProduto("Coxinha Congelada");
            lojasalgueiro.setIdProduto(4);
            lojasalgueiro.setPrecodoProduro(5.99);
            lojasalgueiro.setEstoque(30);
        } else{
            System.out.println("Digite um vendedor válido");
        }
    }

}
