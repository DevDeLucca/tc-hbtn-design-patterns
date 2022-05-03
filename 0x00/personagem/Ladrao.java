package personagem;

public class Ladrao extends Personagem {
    @Override
    double getDanoAtaque() {
        return (getForca() * 0.5) +
                (getDestreza() * 0.35) +
                (getVigor() * 0.1) +
                (getInteligencia() * 0.05);
    }

    public Ladrao(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome, TipoPersonagem.MAGO, inteligencia, forca, vigor, resistencia, destreza);

        if (forca < destreza  && inteligencia < destreza) {
            throw new RuntimeException("Atributos invalidos para LADRAO.");
        }
    }
}
