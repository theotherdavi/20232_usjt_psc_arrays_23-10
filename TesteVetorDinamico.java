import java.util.Random;

public class TesteVetorDinamico {
    public static void main(String[] args) throws Exception {
        var v = new VetorDinamico();
        var gerador = new Random();
        while (true) {
            // Lançar um dado
            int dado = gerador.nextInt(6) + 1;
            v.add(dado);
            v.show();
            v.increaseCap();

            Thread.sleep(2000);
            System.out.println(
                    "\n***************************************************************************************************************************");
        }
    }
}
