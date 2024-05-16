package dispositivo.sistemaoperacional;

import dispositivo.sistemaoperacional.recursos.AparelhoTelefonico;
import dispositivo.sistemaoperacional.recursos.NavegadorDaInternet;
import dispositivo.sistemaoperacional.recursos.ReprodutorDeMusica;

public class Ios implements ReprodutorDeMusica, NavegadorDaInternet, AparelhoTelefonico {

    //Reprodutor de música
    @Override
    public void pausar() {
        System.out.println("Pausando a música...");
        
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecione a música desejada: ");
        
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo a música...");
        
    }

    //Navegador da internet
    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba...");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
        
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página...");
        
    }

    //Aparelho telefônico
    @Override
    public void atender() {
        System.out.println("Deseja atender a ligação?");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Reproduzindo recado da caixa postal...");
        
    }

    @Override
    public void ligar() {
        System.out.println("Discando...");
        
    }
    
}
