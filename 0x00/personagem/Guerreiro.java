package personagem;

public class Guerreiro extends Personagem {

    @Override
    double getDanoAtaque() {
        return (getForca() * 0.8) +
                (getVigor() * 0.05) +
                (getDestreza() * 0.35) +
                (getVigor() * 0.1) +
                (getInteligencia() * 0.05);
    }

    public Guerreiro(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome, TipoPersonagem.MAGO, inteligencia, forca, vigor, resistencia, destreza);

        if (forca <inteligencia && forca < destreza) {
            throw new RuntimeException("Atributos invalidos para Guerreiro.");
        }
    }
}