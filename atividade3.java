importar java. util. Scanner;

        classe pública  NotasMedias03 {
public static void main(String[] args) {
        Scanner  = novo Scanner(System.em);

        Sistema. fora. print("Digite a primeira nota: ");
        nota dupla1  = scanner. próximoDuplo();

        Sistema. fora. print("Digite a segunda nota: ");
        nota dupla2  = scanner. próximoDuplo();

        dupla média = (nota1 + nota2) / 2;

        Sistema. fora. println("Média: " + mídia);

        if (mídia == 10) {
        Sistema. fora. println("Aprovado com Distinção");
        } se (mídia >= 7) {
        Sistema. fora. println("Aprovado");
        } mais {
        Sistema. fora. println("Reprovado");
        }

        scanner. fechar();
        }
        }