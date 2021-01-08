package projeto.youtube;

public class ProjetoYoutube {

        public static void main(String[] args) {
            Video v [] = new Video[3];
            
            v[0] = new Video("Aula 1 de POO");
            v[1] = new Video("Aula 12 de JS");
            v[2] = new Video("Aula 10 de HTML5");
            
            Gafanhoto g[] = new Gafanhoto[2];
            g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
            g[1] = new Gafanhoto("Creuza", 29, "F", "creuzita");
            
            Visualizacao visu[] = new Visualizacao[5];
            visu[0] = new Visualizacao(g[0], v[2]); // Jubileu assiste HTML5
            visu[0].avaliar();
            System.out.println(visu[0].toString());
            
            visu[1] = new Visualizacao(g[0], v[1]); // Jubileu assiste JS
            visu[0].avaliar(87.0f);
            System.out.println(visu[0].toString());
            /*
            System.out.println("VÍDEOS\n-----------------------------");
            System.out.println(v[0].toString());
            System.out.println(v[1].toString());
            System.out.println(v[2].toString());
            System.out.println("\nGAFANHOTOS\n-----------------------------");
            System.out.println(g[0].toString());
            System.out.println(g[1].toString());
            */
    }
    
}
