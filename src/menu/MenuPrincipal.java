package menu;

import conversor.Conversor;

import java.util.Scanner;

public class MenuPrincipal {
    private Scanner entrada;
    private Conversor conversor;
    private int opcao = 0;
    private double resultado;
    private double valor = 0;

    public MenuPrincipal() {
        entrada = new Scanner(System.in);
        conversor = new Conversor();
        inciar();
    }
    private void menu() {
        System.out.println("""
                *********************************************
                Seja bem vindo(a) ao conversor de moedas
                
                1) Dolar -> Peso Argentino
                2) Peso Argentino -> Dolar
                3) Dolar -> Real Brasileiro
                4) Real Brasileiro -> Dolar
                5) Dolar -> Peso Colombiano
                6) Peso Colombiano -> Dolar
                7) Sair
                Por favor, escolha uma opção válida:
                ********************************************* 
                """);
    }
    private void inciar() {
        while (opcao!=7) {
            menu();
            opcao = entrada.nextInt();

            if (opcao==7) {
                break;
            } else if (opcao<1 || opcao>7) {
                System.out.printf("Opção Inválida, digite outra opção");
            }else {
                System.out.println("Digite o valor que deseja converter:");
                valor = entrada.nextDouble();
            }
            if (opcao==1){
                resultado=conversor.dolarParaPesoArgentino(valor);
                System.out.printf("Valor %.2f [USD] corresponde ao valor final de %.2f [ARS]\n", valor, resultado);

            }else if(opcao==2){
                resultado=conversor.pesoArgentinoParaDolar(valor);
                System.out.printf("Valor %.2f [ARS] corresponde ao valor final de %.2f [USD]\n", valor, resultado);
            }else if(opcao==3){
                resultado=conversor.dolarparareal(valor);
                System.out.printf("Valor %.2f [USD] corresponde ao valor final de %.2f [BRL]\n", valor, resultado);
            } else if (opcao==4) {
                resultado=conversor.realparadolar(valor);
                System.out.printf("Valor %.2f [BRL] corresponde ao valor final de %.2f[USD]\n", valor,resultado);
            }else if (opcao==5) {
                resultado=conversor.dolarParaPesoColombiano(valor);
                System.out.printf("Valor %.2f [USD] corresponde ao valor final de %.2f [COP]\n", valor, resultado);
            }else if (opcao==6) {
                resultado=conversor.pesoColombianoParaDolar(valor);
                System.out.printf("Valor %.2f [COP] corresponde ao valor final de %.2f [USD]\n", valor, resultado);
            }
        }
        System.out.println("Obrigado por usar o conversor de moedas!");
        entrada.close();
    }
}
