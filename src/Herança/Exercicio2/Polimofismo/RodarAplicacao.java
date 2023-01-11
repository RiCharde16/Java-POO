package Herança.Exercicio2.Polimofismo;

public class RodarAplicacao {
    public static void main(String[] args) {
        
        ClassMae[] classes = new ClassMae[]{new ClasseFilha1(), new ClassseFilha2(), new ClassMae()};

        for(ClassMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        for(ClassMae classe: classes){
            classe.metodo2();
        }

        System.out.println("");

        ClassseFilha2 classseFilha2 = new ClassseFilha2();
        classseFilha2.metodo2();
    }
}
