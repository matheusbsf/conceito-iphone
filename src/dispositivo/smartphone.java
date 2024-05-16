package dispositivo;

import dispositivo.sistemaoperacional.Ios;

public class smartphone {
    public static void main(String[] args) {
        Ios sisoperacional = new Ios();

        //Utilizando o reprodutor de áudio
        sisoperacional.selecionarMusica();
        sisoperacional.tocar();
        sisoperacional.pausar();

        //Utilizando o navegador de internet
        sisoperacional.adicionarNovaAba();
        sisoperacional.exibirPagina();
        sisoperacional.atualizarPagina();

        //Utilizando o telefone
        sisoperacional.ligar();
        sisoperacional.atender();
        sisoperacional.iniciarCorreioVoz();

    }
}
