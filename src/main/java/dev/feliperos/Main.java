package dev.feliperos;

public class Main {
    public static void main(String[] args) {
        Estado sc = new Estado("Santa Catarina", "SC");
        sc.getCidades().add(new Cidade("Lages", 150000, "temperado", 10));
        sc.getCidades().add(new Cidade("Florianópolis", 500000, "tropical", 11));

        System.out.println("Contar Clima: " + sc.contarClima("temperado"));
        System.out.println("Contar clima: " + sc.contarClima("tropical"));
        System.out.println("Cidade mais Populosa: " + sc.getCidadeMaisPopulosa());
        System.out.println("Média de Área: " + sc.criarMediaAreaCidades());
        sc.mostrarTodasCidades();
    }
}