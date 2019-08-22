package aula2208;

public class Start {

    public static void main(String[] args) {
        //instancias classe pneu
        Pneu pneu1 = new Pneu();
        pneu1.setPressao(29);
        
        Pneu pneu2 = new Pneu();
        pneu2.setPressao(30);
        
        Pneu pneu3 = new Pneu();
        pneu3.setPressao(32);
        
        Pneu pneu4 = new Pneu();
        pneu4.setPressao(31);
        
        Carro carro = new Carro();
        //passando obejto do tipo pneu para o atributo da classe carro
        carro.setP1(pneu1);
        carro.setP2(pneu2);
        carro.setP3(pneu3);
        carro.setP4(pneu4);
        
        carro.Liga();
        carro.Desliga();
    }
    
}
