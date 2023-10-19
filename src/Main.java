import com.engeto.homework.Cart;
import com.engeto.homework.Category;
import com.engeto.homework.Item;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Cart shoppingCart = new Cart();
        shoppingCart.addItem
                (new Item("Pečivo", BigDecimal.valueOf(148.10), Category.FOOD));
         shoppingCart.addItem
                (new Item("Tekuté mýdlo", BigDecimal.valueOf(89.90), Category.CONSUMABLES));


        System.out.println(shoppingCart.get(0));
        System.out.println(shoppingCart.getListOfItems());
    }


}