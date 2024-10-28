public class Luz {

    enum Estado {
        DESLIGADA_QUENTE, DESLIGADA_FRIA, LIGADA
    }
    
    static class Lampada {
        Estado estado; // Estado da lâmpada

        // Construtor inicializando a lâmpada como desligada e fria
        Lampada() {
            this.estado = Estado.DESLIGADA_FRIA;
        }
    }

    public static void main(String[] args) {
        Lampada[] lampadas = new Lampada[3];
        for (int i = 0; i < 3; i++) {
            lampadas[i] = new Lampada();
        }

        // Simulação do experimento
        System.out.println("Ligando a Lampada 1 (Interruptor 1) por 10-15 minutos...");
        ligarLampada(lampadas[0], 10);

        System.out.println("Desligando a Lampada 1 e ligando a Lampada 2 (Interruptor 2)...");
        desligarLampada(lampadas[0]);
        ligarLampada(lampadas[1], 0);

        // Lampada 3 permanece desligada

        // Detectar quais interruptores controlam quais lâmpadas baseado no estado das lâmpadas
        System.out.println();
        for (int i = 0; i < 3; i++) {
            if (lampadas[i].estado == Estado.LIGADA) {
                System.out.println("Lampada " + (i + 1) + " está LIGADA - Interruptor 2 controla Lampada " + (i + 1));
            } else if (lampadas[i].estado == Estado.DESLIGADA_QUENTE) {
                System.out.println("Lampada " + (i + 1) + " está DESLIGADA e QUENTE - Interruptor 1 controla Lampada " + (i + 1));
            } else if (lampadas[i].estado == Estado.DESLIGADA_FRIA) {
                System.out.println("Lampada " + (i + 1) + " está DESLIGADA e FRIA - Interruptor 3 controla Lampada " + (i + 1));
            }
        }
    }

    // Método para ligar a lâmpada e simular o aquecimento
    private static void ligarLampada(Lampada lampada, int minutos) {
        System.out.println("Ligando a lâmpada por " + minutos + " minutos...");
        lampada.estado = Estado.LIGADA;
        if (minutos > 0) {
            // Simula a lâmpada que ficou ligada por algum tempo e depois desligada
            lampada.estado = Estado.DESLIGADA_QUENTE;
            System.out.println("A lâmpada foi aquecida e agora está desligada, mas quente.");
        } else {
            System.out.println("A lâmpada está ligada agora.");
        }
    }

    // Método para desligar a lâmpada, mantendo seu estado quente se foi ligada anteriormente
    private static void desligarLampada(Lampada lampada) {
        if (lampada.estado == Estado.LIGADA) {
            lampada.estado = Estado.DESLIGADA_QUENTE;
            System.out.println("Desligando a lâmpada. Está agora quente.");
        }
    }
    //Preparação na Sala dos Interruptores:
    //Ligue o Interruptor 1 e espere cerca de 10-15 minutos.
    //Após 10-15 minutos, desligue o Interruptor 1 e ligue o Interruptor 2.
    //O Interruptor 3 deve permanecer desligado durante todo o processo.
    //Primeira Ida à Sala das Lâmpadas:
    //Entre na sala das lâmpadas e observe:
    //A lâmpada que está acesa é controlada pelo Interruptor 2.
    //Toque nas outras duas lâmpadas:
    //A lâmpada que está desligada, mas quente, foi controlada pelo Interruptor 1.
    //A lâmpada que está desligada e fria é controlada pelo Interruptor 3.
}