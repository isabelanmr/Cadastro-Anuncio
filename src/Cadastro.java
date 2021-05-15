import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) throws Exception {
        String nomeAnuncio, cliente;
        double dataInicio, dataTermino, investDia, valorTotal, a, b, cliqueoriginal, cliquecompart, maxCliques, maxCompart, original, compart, maxvisual;
        double Float = 2.16;
        Scanner input = new Scanner(System.in);
        a = 0.12;
        b = 0.15;
        input.useDelimiter("[\r\n]+");

        System.out.println("Digite o nome do anúncio: ");
        nomeAnuncio = input.next();
        System.out.println("Nome do anúncio: " + nomeAnuncio);

        System.out.println("Digite o nome do cliente: ");
        cliente = input.next();
        System.out.println("Cliente: " + cliente);
        
        System.out.println("Digite a data de início: ");
        dataInicio = input.nextDouble();
        System.out.println("Data de início: " + dataInicio);

        System.out.println("Digite a data de término: ");
        dataTermino = input.nextDouble();
        System.out.println("Data de término: " + dataTermino);

        System.out.println("Digite o valor investido por dia: ");
        investDia = input.nextDouble();
        System.out.println("Investimento por dia = " + investDia);

        valorTotal = (dataTermino - dataInicio) * investDia;
        System.out.println("Investimento total = " + valorTotal);

        original = valorTotal*30;
        System.out.println("Número de visualizações do anúncio original: " + original);

        compart = original*Float;
        System.out.println("Número máximo de visualizações do anúncio compartilhado: " + compart);
        
        maxvisual = (original + compart);
        System.out.println("Quantidade máxima de visualizações = " + maxvisual);

        cliqueoriginal = 30 * valorTotal * a;
        System.out.println("Máximo de cliques no anúncio original = " + cliqueoriginal);

        cliquecompart = cliqueoriginal * b * 40 * a; 
        System.out.println("Máximo de cliques nos anúncios compartilhados = " + cliquecompart);

        maxCliques = (cliqueoriginal + cliquecompart);
        System.out.println("Quantidade máxima de cliques = " + maxCliques);

        maxCompart = (cliqueoriginal * b * 3);
        System.out.println("Quantidade máxima de compartilhamentos = " + maxCompart);

        input.close();
    }
}
