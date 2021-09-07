package net.maromo.prjcomputador;
import java.util.Scanner;

public class Computador {
    public String marca;
    public String cor;
    public String modelo;
    public Long numeroSerie;
    public Double preco;

    Scanner entrada = new Scanner (System.in);
    float valor;

    public void imprimir(){
        System.out.println("Marca do computador: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo " + modelo);
        System.out.println("Número de série: " + numeroSerie);
        System.out.println("Preço: " + preco);
    }
    public void calcularValor(){
        if(marca == "HP"){
            preco = (preco * 30) / 100 + preco;
        return;
        }
        if(marca == "IBM"){
            preco = (preco * 50) / 100 + preco;
        return;
        }
    }

    public int alterarValor(){
        System.out.println("Digite o valor para ser alterado: ");
        valor = entrada.nextFloat();
        if(valor > 0){
            preco += valor;
            System.out.printf("Valor alterado");
            return 1;
        }
        else{
            System.out.println("");
            System.out.printf("Valor NÃO alterado");
            System.out.println("");
            return 0;
        }
    }
}