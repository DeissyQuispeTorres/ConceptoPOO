package upeu.polinorfabstract;

public class Loro extends Animal{
    @Override
    public void emitirsonido() {
        System.out.println("Espero que puedes aprender!!" +
                "..no estes juando");
    }
    @Override
    public void comer(){
        System.out.println("Tengo hambre .... que quiero comer algo ");
    }


}
