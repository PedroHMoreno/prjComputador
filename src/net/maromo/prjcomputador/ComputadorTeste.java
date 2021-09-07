package net.maromo.prjcomputador;
import java.util.Scanner;

public class ComputadorTeste {

    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

        // HP

        Computador computador = new Computador();

        System.out.println("A marca do computador é HP");
        computador.marca = "HP";

        System.out.println("Digite a cor: ");
        computador.cor = entrada.nextLine();

        System.out.println("Digite o modelo: ");
        computador.modelo = entrada.nextLine();

        System.out.println("DIgite o número de série: ");
        computador.numeroSerie = entrada.nextLong();

        System.out.println("Digite o preço: ");
        computador.preco = entrada.nextDouble();

        System.out.println();
        computador.imprimir();
        System.out.println();
        computador.calcularValor();
        System.out.println();
        computador.imprimir();
        System.out.println();

        // IBM

        Computador computador2 = new Computador();

        System.out.println("A marca do computador é IBM ");
        computador2.marca = "IBM";

        entrada.nextLine();

        System.out.println("Digite a cor: ");
        computador2.cor = entrada.nextLine();

        System.out.println("Digite o modelo: ");
        computador2.modelo = entrada.nextLine();

        System.out.println("Digite o número de série: ");
        computador2.numeroSerie = entrada.nextLong();

        System.out.println("Digite o preço: ");
        computador2.preco = entrada.nextDouble();

        System.out.println();
        computador2.imprimir();
        System.out.println();
        computador2.calcularValor();
        System.out.println();
        computador2.imprimir();
        System.out.println();
        computador2.alterarValor();
        System.out.println();
        computador2.imprimir();
        System.out.println();
    }
}