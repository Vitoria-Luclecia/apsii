package Exercicio01;

public class Aniversariante {

    private String nome;
    private DataAniversario dataAniversario;

    //gets e sets...

    @Override
    public boolean equals(Object outro) {
        if (outro instanceof Aniversariante) {
            Aniversariante outroAniversariante = (Aniversariante) outro;

            return this.nome.equals(outroAniversariante.nome)
                    && this.dataAniversario.equals(outroAniversariante.dataAniversario);
        }

        return false;
    }
}