package projeto.youtube;

public class Video implements AcoesVideo {  
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzinho;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzinho() {
        return reproduzinho;
    }

    public void setReproduzinho(boolean reproduzinho) {
        this.reproduzinho = reproduzinho;
    }

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzinho = false;
    }
      
    @Override
    public void play() {
        this.reproduzinho = true;
    }

    @Override
    public void pause() {
        this.reproduzinho = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzinho=" + reproduzinho + '}';
    }
        
}
