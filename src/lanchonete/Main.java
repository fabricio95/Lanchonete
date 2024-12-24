package lanchonete;

public class Main {
    public static void main(String[] args) {

        Item item1 = new Item("sanduiche natural de frango ",12.99,1);
        Item item2 = new Item("sanduiche narutal de peru",10.99,2);
        Item item3 = new Item("Suco de laranja",8.99,3);
        Item item4 = new Item("Suco de Uva",8.99,4);

        Carrinho c =new Carrinho();

        c.adicionarItem(item2);
        c.adicionarItem(item4);
        c.adicionarItem(item1);
        c.adicionarItem(item4);

        c.removerItem(4);

        c.adicionarItem(item3);

        c.calcularPreco();
    }
}