public class Main {
    public static void main(String[] args) {
        Farmacia farmacia = new Farmacia();
        farmacia.estoque();
        farmacia.mediaVencimento();
        farmacia.proximoVencer();
        farmacia.venderMedicamento("Dipirona");
        farmacia.estoque();
    }
}

class Farmacia {
    private String[] nomesMedicamentos = {"Dipirona", "Paracetamol", "Aprozolan"};
    private int[] diasParaVencimento = {4, 20, 30};
    private double[] precos = {10.99, 14.99, 30};

    public void estoque() {
        for (int i = 0; i < nomesMedicamentos.length; i++) {
            System.out.println("medicamento: " + nomesMedicamentos[i]
                    + " | preco: " + precos[i]
                    + " | vencimento em: " + diasParaVencimento[i]);
        }
    }

    public void mediaVencimento() {
        double media = 0;
        for (int i = 0; i < diasParaVencimento.length; i++) {
            media += diasParaVencimento[i];
        }
        media = media / diasParaVencimento.length;
        System.out.println("media: " + media);
    }

    public void proximoVencer() {
        System.out.println("medicamentos proximos de vencer: ");
        for (int i = 0; i < nomesMedicamentos.length; i++) {
            if (diasParaVencimento[i] < 5) {
                System.out.println(nomesMedicamentos[i]);
                precos[i] = precos[i] * 0.5;
            }
        }
    }

    public void venderMedicamento(String nomeMedicamento) {
        for (int i = 0; i < nomesMedicamentos.length; i++) {
            if (nomesMedicamentos[i].equals(nomeMedicamento)) {
                nomesMedicamentos[i] = "";
                diasParaVencimento[i] = 0;
                precos[i] = 0;
            }
        }
    }
}