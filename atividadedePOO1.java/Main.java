public class Main{
    public static void main(String[]args){

        Aluno a01 = new Aluno("Vitória", 18, 7.9);
        Aluno a02 = new Aluno("Yasmin", 18, 9.0);
        Aluno a03 = new Aluno("Fernanda", 17, 9.5);
        Aluno a04 = new Aluno("Arnaldo", 17, 5.0);

        a01.exibir();
        System.out.println("---------------");
        
        a02.exibir();
        System.out.println("---------------");
        
        a03.exibir();
        System.out.println("---------------");
        
        a04.exibir();
        System.out.println("---------------");

    }
}